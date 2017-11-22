package es.vcarmen.frangment03;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by matinal on 13/10/17.
 */

public class Fragmento1 extends ListFragment {
    private String[] artistas = {"Alberto Durero", "Miguel Ángel", "Rafael Sanzio", "Tiziano", "Donatello", "Ralael", "Jacinto", "Rosa","Alberto Durero", "Miguel Ángel", "Rafael Sanzio", "Tiziano", "Donatello", "Ralael", "Jacinto", "Rosa"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        setListAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,artistas));
        return inflater.inflate(R.layout.fragmento1,container,true);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(getActivity(),"Ha tocado a " + artistas[position], Toast.LENGTH_SHORT).show();
    }
}
