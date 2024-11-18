package gutierrezruiz.francisco;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<Personaje> misPersonajes = new ArrayList<>();
    private PersonajeAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler_view, container, false);

        recyclerView = rootView.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        iniciarListaPersonajes();

        adapter = new PersonajeAdapter(misPersonajes);
        recyclerView.setAdapter(adapter);

        return rootView;
    }

    private void iniciarListaPersonajes() {
        misPersonajes.add(new Personaje(getString(R.string.boo), R.drawable.boo, getString(R.string.boo_descripcion), getString(R.string.boo_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.bowser), R.drawable.bowser, getString(R.string.bowser_descripcion), getString(R.string.bowser_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.bowser_jr), R.drawable.bowserjr, getString(R.string.bowserjr_descripcion), getString(R.string.bowserjr_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.daisy), R.drawable.daisy, getString(R.string.daisy_descripcion), getString(R.string.daisy_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.diddy_kong), R.drawable.diddykong, getString(R.string.diddykong_descripcion), getString(R.string.diddykong_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.donkey_kong), R.drawable.donkeykong, getString(R.string.donkeykong_descripcion), getString(R.string.donkeykong_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.luigi), R.drawable.luigi, getString(R.string.luigi_descripcion), getString(R.string.luigi_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.mario), R.drawable.mario, getString(R.string.mario_descripcion), getString(R.string.mario_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.peach), R.drawable.peach, getString(R.string.peach_descripcion), getString(R.string.peach_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.rosalina), R.drawable.rosalina, getString(R.string.rosalina_descripcion), getString(R.string.rosalina_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.toad), R.drawable.toad, getString(R.string.toad_descripcion), getString(R.string.toad_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.waluigi), R.drawable.waluigi, getString(R.string.waluigi_descripcion), getString(R.string.waluigi_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.wario), R.drawable.wario, getString(R.string.wario_descripcion), getString(R.string.wario_habilidad)));
        misPersonajes.add(new Personaje(getString(R.string.yoshi), R.drawable.yoshi, getString(R.string.yoshi_descripcion), getString(R.string.yoshi_habilidad)));
    }
}