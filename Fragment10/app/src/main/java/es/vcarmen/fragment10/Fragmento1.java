package es.vcarmen.fragment10;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by matinal on 26/10/17.
 */

public class Fragmento1 extends ListFragment {

    public Fragmento1() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new Adaptador(getActivity(),R.layout.layout_listado, Contenido.ENT_LISTA) {
            @Override
            public void onEntrada(Object entrada, View view) {
                TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textotitulo);
                texto_superior_entrada.setText(((Contenido.Lista_entrada)entrada).textoEncima);
                ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagenLista);
                imagen_entrada.setImageResource(((Contenido.Lista_entrada)entrada).idImage);
            }
        });

    }

    public interface CallBacks { public void onEntradasSeleccionadas(String id);}



    private static CallBacks CallBackVacios = new CallBacks() {
        @Override
        public void onEntradasSeleccionadas(String id) {

        }
    };

    private CallBacks mCallBacks = CallBackVacios;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBacks = (CallBacks) context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallBacks = CallBackVacios;
    }
}
