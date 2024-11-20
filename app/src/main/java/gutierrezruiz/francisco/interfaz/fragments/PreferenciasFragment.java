package gutierrezruiz.francisco.interfaz.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;

import android.preference.PreferenceFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import gutierrezruiz.francisco.R;

public class PreferenciasFragment extends PreferenceFragmentCompat {


    @Override
    public void onCreatePreferences(@Nullable Bundle savedInstanceState, @Nullable String rootKey) {
        setPreferencesFromResource(R.xml.preferencias, rootKey);
        SwitchPreference idioma = findPreference("idioma");
        SwitchPreference modo = findPreference("modo");

        if (idioma != null) {
            idioma.setOnPreferenceChangeListener((preference, newValue) -> {
                // Aquí puedes manejar el cambio de idioma
                return true;
            });
        }

        if (modo != null) {
            modo.setOnPreferenceChangeListener((preference, newValue) -> {
                // Aquí puedes manejar el cambio de modo
                return true;
            });

        }
    }
}