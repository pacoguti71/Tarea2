package gutierrezruiz.francisco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import gutierrezruiz.francisco.databinding.FragmentDetallesPersonajeBinding;

public class DetallesPersonajeFragment extends Fragment {

    private FragmentDetallesPersonajeBinding binding; // Declarar el objeto de View Binding

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar la vista usando View Binding
        binding = FragmentDetallesPersonajeBinding.inflate(inflater, container, false);

        // Obtiene los datos del Bundle (pasados como argumentos)
        Bundle args = getArguments();
        if (args != null) {
            String nombre = args.getString("nombre");
            int imagenId = args.getInt("imagen", 0);
            String descripcion = args.getString("descripcion");
            String habilidad = args.getString("habilidad");

            // Configura los datos directamente usando View Binding
            binding.textViewNombre.setText(nombre);
            binding.imageView.setImageResource(imagenId);
            binding.textViewDescripcion.setText(descripcion);
            binding.textViewHabilidades.setText(habilidad);
        }

        return binding.getRoot(); // Retorna la vista inflada con los datos configurados
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null; // Liberar el objeto de binding
    }
}
