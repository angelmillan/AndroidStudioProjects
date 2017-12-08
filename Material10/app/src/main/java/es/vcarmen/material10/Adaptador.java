package es.vcarmen.material10;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.AnimeViewHolder> {
    private List<Encapsulador> items;

    public static class AnimeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imagen;
        public TextView titulo;
        public TextView texto;

        public AnimeViewHolder(View vista) {
            super(vista);
            imagen = (ImageView) vista.findViewById(R.id.imagen);
            titulo = (TextView) vista.findViewById(R.id.titulo);
            texto = (TextView) vista.findViewById(R.id.texto);
            vista.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int posicion = this.getAdapterPosition();
            Toast.makeText(view.getContext(), "TOCADO ELEMENTO:"+String.valueOf(posicion+1), Toast.LENGTH_SHORT);
        }
    }


    public Adaptador(List<Encapsulador> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public AnimeViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.carta, viewGroup, false);
        return new AnimeViewHolder(v);
    }


    @Override
    public void onBindViewHolder(AnimeViewHolder viewHolder, final int i) {
        viewHolder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), ""+items.get(i).getTitulo().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.titulo.setText(items.get(i).getTitulo());
        viewHolder.texto.setText(String.valueOf(items.get(i).getTexto()));
    }
}