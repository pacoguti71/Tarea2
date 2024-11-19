package gutierrezruiz.francisco.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import gutierrezruiz.francisco.R;
import gutierrezruiz.francisco.datos.Personaje;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    private final List<Personaje> listaPersonajes; // Lista de personajes
    private View.OnClickListener onClickListener; // Listener para el clic en un personaje

    // Constructor
    public PersonajeAdapter(List<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    // Método para establecer el listener
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @NonNull
    @Override
    // Crea un nuevo ViewHolder
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        view.setOnClickListener(onClickListener);
        return new PersonajeViewHolder(view);
    }

    @Override
    // Vincula los datos del personaje con el ViewHolder
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = listaPersonajes.get(position);
        holder.nombreTextView.setText(personaje.getNombre());
        holder.imagenImageView.setImageResource(personaje.getImagenId());
    }

    @Override
    // Devuelve el número de elementos en la lista
    public int getItemCount() {
        return listaPersonajes.size();
    }

    // ViewHolder para los elementos de la lista
    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {

        public TextView nombreTextView; // Vista para el nombre del personaje
        public ImageView imagenImageView; // Vista para la imagen del personaje

        // Constructor
        public PersonajeViewHolder(View itemView) {
            super(itemView);
            // Enlaza las vistas con los elementos del diseño
            nombreTextView = itemView.findViewById(R.id.textViewNombrePersonaje);
            imagenImageView = itemView.findViewById(R.id.imageViewPersonaje);
        }
    }
}
