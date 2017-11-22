package es.vcarmen.design03;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.AnimeViewHolder> {
    private List<Encapsulador> items;

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView titulo;
        public TextView texto;

        public AnimeViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            titulo = (TextView) v.findViewById(R.id.titulo);
            texto = (TextView) v.findViewById(R.id.texto);
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
    public void onBindViewHolder(AnimeViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).get_idImagen());
        viewHolder.titulo.setText(items.get(i).get_textoTitulo());
        viewHolder.texto.setText(String.valueOf(items.get(i).get_textoContenido()));
    }
}