package gutierrezruiz.francisco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    private final List<Personaje> listaPersonajes;

    public PersonajeAdapter(List<Personaje> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = listaPersonajes.get(position);
        holder.nombreTextView.setText(personaje.getNombre());
        holder.imagenImageView.setImageResource(personaje.getImagenId());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {

        public TextView nombreTextView;
        public ImageView imagenImageView;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.textViewNombrePersonaje);
            imagenImageView = itemView.findViewById(R.id.imageViewPersonaje);
        }
    }
}
