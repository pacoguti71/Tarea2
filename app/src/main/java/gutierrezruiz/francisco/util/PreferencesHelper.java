package gutierrezruiz.francisco.util;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesHelper {

    private static final String IDIOMA="idioma";
    private static final String MODO="modo";


    public static void  saveIdioma(Context context, String idioma){
        SharedPreferences preferencias = context.getSharedPreferences(IDIOMA, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString(IDIOMA, idioma);
        editor.apply();
    }

    public static String getIdioma(Context context){
        SharedPreferences preferencias = context.getSharedPreferences(IDIOMA, Context.MODE_PRIVATE);
        return preferencias.getString(IDIOMA, "es");
    }

    public static void  saveModo(Context context, String modo){
        SharedPreferences preferencias = context.getSharedPreferences(MODO, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencias.edit();
        editor.putString(MODO, modo);
        editor.apply();
    }

    public static String getModo(Context context){
        SharedPreferences preferencias = context.getSharedPreferences(MODO, Context.MODE_PRIVATE);
        return preferencias.getString(MODO, "true");
    }
}
