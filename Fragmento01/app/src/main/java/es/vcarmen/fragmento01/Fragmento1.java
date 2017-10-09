package es.vcarmen.fragmento01;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragmento1 extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStatus) {

        return inflater.inflate(R.layout.fragmento1, container, false);
    }
}
