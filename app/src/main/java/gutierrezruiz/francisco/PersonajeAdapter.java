package gutierrezruiz.francisco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.PersonajeViewHolder> {

    private final List<Personaje> misPersonajes;

    public PersonajeAdapter(List<Personaje> misPersonajes) {
        this.misPersonajes = misPersonajes;
    }

    @NonNull
    @Override
    public PersonajeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new PersonajeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonajeViewHolder holder, int position) {
        Personaje personaje = misPersonajes.get(position);
        holder.nameTextView.setText(personaje.getNombre());
        holder.descriptionTextView.setText(personaje.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return misPersonajes.size();
    }

    public static class PersonajeViewHolder extends RecyclerView.ViewHolder {

        public TextView nameTextView;
        public TextView descriptionTextView;

        public PersonajeViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.textViewNombre);
            descriptionTextView = itemView.findViewById(R.id.textViewDescripcion);
        }
    }
}
