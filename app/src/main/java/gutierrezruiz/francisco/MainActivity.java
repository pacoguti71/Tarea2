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
}
