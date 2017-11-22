package es.vcarmen.fragmento01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragmento2 extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStatus) {

        return inflater.inflate(R.layout.fragmento2, container, false);
    }
}
