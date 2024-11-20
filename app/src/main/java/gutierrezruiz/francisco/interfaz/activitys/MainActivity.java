package gutierrezruiz.francisco.interfaz.activitys;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;

import gutierrezruiz.francisco.R;
import gutierrezruiz.francisco.interfaz.fragments.RecyclerViewFragment;
import gutierrezruiz.francisco.interfaz.dialogos.AcercadeDialogo;
import gutierrezruiz.francisco.util.PreferencesHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Configura el Edge-to-Edge
        EdgeToEdge.enable(this);
        // Configura el diseño de la actividad
        setContentView(R.layout.activity_main);

        // Configura la Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Configura el snackbar
        View rootView = findViewById(android.R.id.content);
        // Muestra el snackbar
        Snackbar.make(rootView, getString(R.string.mensajeSnack), Snackbar.LENGTH_SHORT).show();

//        // Muestra el RecyclerViewFragment al iniciar la actividad. De la forma antigua
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.fragment_container, new RecyclerViewFragment())
//                    .commit();
//        }

        // Muestra el RecyclerViewFragment al iniciar la actividad. De la forma nueva




    }




    @Override
    // Crea el menú de opciones
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    // Maneja las acciones de los elementos del menú
    public boolean onOptionsItemSelected(android.view.MenuItem item) {
        int itemId = item.getItemId(); // Obtiene el ID del elemento seleccionado

        // Comprueba el ID del elemento y realiza la acción correspondiente
        if (itemId == R.id.action_acercade) {
            AcercadeDialogo acercadeDialogo = new AcercadeDialogo();
            acercadeDialogo.show(getSupportFragmentManager(), "acercade_dialogo");
            return true;
            //Lo he incluido para que no tenga sólo una opción
        } else if (itemId == R.id.action_salir) {
            finishAffinity();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    //Para el drawer
    // PreferencesHelper.saveIdioma(this, "es");
    // PreferencesHelper.saveModo(this, "true");





}