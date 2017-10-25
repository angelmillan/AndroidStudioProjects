package es.vcarmen.fragment04;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;


public class Fragmento1 extends DialogFragment {

    static Fragmento1 nuevaInstancia (String titulo) {
        Fragmento1 frangment = new Fragmento1();
        Bundle args = new Bundle();
        args.putString("title", titulo);
        frangment.setArguments(args);
        return frangment;
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String titulo = getArguments().getString("title");
        return new AlertDialog.Builder(getActivity())
                .setTitle(titulo)
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((Fragment04)getActivity()).positivo();
                    }
                })
                .setNegativeButton("Rechazar", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((Fragment04)getActivity()).negativo();
                    }
                })
                .create();
    }



    }



