package gutierrezruiz.francisco;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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

        // Muestra el RecyclerViewFragment al iniciar la actividad
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new RecyclerViewFragment())
                    .commit();
        }
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
        } else if (itemId == R.id.action_salir) {
            finishAffinity();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}