package gutierrezruiz.francisco;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private final List<Personaje> listaPersonajes = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Infla el diseño del fragmento
        View rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        // Configura el RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Configura la lista de personajes
        iniciarListaPersonajes();

        // Configura el adaptador
        PersonajeAdapter adapter = new PersonajeAdapter(listaPersonajes);
        recyclerView.setAdapter(adapter);

        // Configura el OnClickListener para cuando se pulse sobre un personaje
        adapter.setOnClickListener(view -> {
            // Obtiene el personaje seleccionado
            int posicion = recyclerView.getChildAdapterPosition(view);
            Personaje personaje = listaPersonajes.get(posicion);

            // Crea un nuevo fragmento y pasa los datos del personaje
            Fragment detallesPersonajeFragment = new DetallesPersonajeFragment();
            Bundle args = new Bundle();
            args.putString("nombre", personaje.getNombre());
            args.putInt("imagen", personaje.getImagenId());
            args.putString("descripcion", personaje.getDescripcion());
            args.putString("habilidad", personaje.getHabilidad());
            detallesPersonajeFragment.setArguments(args);

            // Reemplaza el fragmento actual con el de detalles
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, detallesPersonajeFragment)
                    .addToBackStack(null)
                    .commit();

            // Muestra un Toast con el nombre del personaje seleccionado
            Toast.makeText(getContext(), getString(R.string.mensaje_toast, personaje.getNombre()), Toast.LENGTH_SHORT).show();
        });

        // Retorna la vista del fragmento
        return rootView;
    }



    private void iniciarListaPersonajes() {
        listaPersonajes.add(new Personaje(getString(R.string.boo), R.drawable.boo, getString(R.string.boo_descripcion), getString(R.string.boo_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.bowser), R.drawable.bowser, getString(R.string.bowser_descripcion), getString(R.string.bowser_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.bowser_jr), R.drawable.bowserjr, getString(R.string.bowserjr_descripcion), getString(R.string.bowserjr_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.daisy), R.drawable.daisy, getString(R.string.daisy_descripcion), getString(R.string.daisy_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.diddy_kong), R.drawable.diddykong, getString(R.string.diddykong_descripcion), getString(R.string.diddykong_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.donkey_kong), R.drawable.donkeykong, getString(R.string.donkeykong_descripcion), getString(R.string.donkeykong_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.luigi), R.drawable.luigi, getString(R.string.luigi_descripcion), getString(R.string.luigi_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.mario), R.drawable.mario, getString(R.string.mario_descripcion), getString(R.string.mario_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.peach), R.drawable.peach, getString(R.string.peach_descripcion), getString(R.string.peach_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.rosalina), R.drawable.rosalina, getString(R.string.rosalina_descripcion), getString(R.string.rosalina_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.toad), R.drawable.toad, getString(R.string.toad_descripcion), getString(R.string.toad_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.waluigi), R.drawable.waluigi, getString(R.string.waluigi_descripcion), getString(R.string.waluigi_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.wario), R.drawable.wario, getString(R.string.wario_descripcion), getString(R.string.wario_habilidad)));
        listaPersonajes.add(new Personaje(getString(R.string.yoshi), R.drawable.yoshi, getString(R.string.yoshi_descripcion), getString(R.string.yoshi_habilidad)));
    }
}
