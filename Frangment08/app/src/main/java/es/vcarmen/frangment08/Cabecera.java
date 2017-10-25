package es.vcarmen.frangment08;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

/**
 * Created by matinal on 25/10/17.
 */

public class Cabecera extends ListFragment {
    CabeceraListener mCallBack;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, Elementos.Cabeceras));


    }

    public interface CabeceraListener {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mCallBack = (CabeceraListener) context;
    }
}
