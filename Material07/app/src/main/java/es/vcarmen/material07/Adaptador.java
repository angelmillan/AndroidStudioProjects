package es.vcarmen.material07;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by matinal on 23/11/2017.
 */

public class Adaptador extends FragmentStatePagerAdapter {

    int numTab;

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Primero();
            case 1:
                return new Segundo();
            case 2:
                return new Tercero();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTab;
    }

    public Adaptador(FragmentManager fm, int numTab) {
        super(fm);
        this.numTab = numTab;
    }

}
