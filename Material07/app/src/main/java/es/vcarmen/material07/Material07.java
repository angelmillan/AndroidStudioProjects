package es.vcarmen.material07;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class Material07 extends AppCompatActivity {

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material07);
        initialize();
    }

    private void initialize(){
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        TabLayout.Tab primerTab = tabLayout.newTab().setText("PRIMERO").setIcon(R.drawable.ic_uno);
        TabLayout.Tab segundoTab = tabLayout.newTab().setText("SEGUNDO").setIcon(R.drawable.ic_segundo);
        TabLayout.Tab tercerTab = tabLayout.newTab().setText("TERCERO").setIcon(R.drawable.ic_tres);

        tabLayout.addTab(primerTab);
        tabLayout.addTab(segundoTab);
        tabLayout.addTab(tercerTab);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                Fragment fragmento = null;

                switch (tab.getPosition()){
                    case 0:
                        fragmento = new Primero();
                        break;
                    case 1:
                        fragmento = new Segundo();
                        break;
                    case 2:
                        fragmento = new Tercero();
                        break;
                    default:
                        break;
                }

                FragmentManager fm =  getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.replace(R.id.contenedor, fragmento);
                ft.commit();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
