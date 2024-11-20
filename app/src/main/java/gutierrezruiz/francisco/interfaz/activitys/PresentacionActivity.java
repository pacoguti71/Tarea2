package gutierrezruiz.francisco.interfaz.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import gutierrezruiz.francisco.R;

public class PresentacionActivity extends AppCompatActivity {

    /*
    * En las clases se explica hacer esto:
    * En gradle:
    * <dependencies>
    *    implementation("androidx.core:core-splashscreen:1.0.1")
    * </dependencies>
    *
    * Y en themes dentro del style :
    *   <item name="android:windowSplashScreenAnimatedIcon">@drawable/super_mario_ia</item>
    *   <item name="android:windowSplashScreenAnimationDuration">1000</item>
    *   <item name="android:windowSplashScreenIconBackgroundColor">@color/colorPrimary</item>
    *   <item name="android:windowSplashScreenBackground">@color/colorPrimary</item>
    *
    * Pero para eso hace falta la API 31, por loq eu he preferido hacerlo así. Una activity como main en manifest
    * que da paso a la main activity
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // LLama al constructor de la clase padre
        super.onCreate(savedInstanceState);
        // Establece el layout de la actividad
        setContentView(R.layout.activity_presentacion);
        // El Handler se utiliza para ejecutar una tarea después de un tiempo
        new Handler().postDelayed(new Runnable() {
            @Override
            // Este método se ejecuta después de 3 segundos
            public void run() {
                // Crea un Intent para iniciar la actividad MainActivity
                Intent intent = new Intent(PresentacionActivity.this, MainActivity.class);
                // Inicia la actividad
                startActivity(intent);
                // Cierra la actividad actual
                finish();
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    } // Fin onCreate
} // Fin class