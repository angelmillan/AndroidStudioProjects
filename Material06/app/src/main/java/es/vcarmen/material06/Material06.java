package es.vcarmen.material06;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Material06 extends AppCompatActivity {
    TabLayout tabLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material06);
        init();
    }

    private void init(){
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setTabTextColors(Color.argb(255,234,120,50), Color.argb(100,50,50,50));
        tabLayout.setSelectedTabIndicatorColor(Color.BLUE);
        tabLayout.setSelectedTabIndicatorHeight(5);

        TabLayout.Tab primerTab = tabLayout.newTab();
        primerTab.setText("Tb 1");
        primerTab.setIcon(R.mipmap.ic_google_round);

        TabLayout.Tab segundoTab = tabLayout.newTab();
        segundoTab.setText("Tb 2");
        segundoTab.setIcon(R.mipmap.ic_facebook_round);

        TabLayout.Tab tercerTab = tabLayout.newTab();
        tercerTab.setText("Tb 3");
        tercerTab.setIcon(R.mipmap.ic_twitter_round);

        tabLayout.addTab(primerTab);
        tabLayout.addTab(segundoTab);
        tabLayout.addTab(tercerTab,2,true);

        Button botonAdd = (Button) findViewById(R.id.botonAdd);
        botonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearNuevaTab();
            }
        });

        Button botonDel = (Button) findViewById(R.id.botonQuitar);
        botonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eliminarTab();
            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int elegida = tabLayout.getSelectedTabPosition();
                switch (elegida){
                    case 0:
                        Toast toast0 = Toast.makeText(getApplicationContext(), "Primer TAB", Toast.LENGTH_SHORT);
                        toast0.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast0.show();
                        break;
                    case 1:
                        Toast toast1 = Toast.makeText(getApplicationContext(), "Segundo TAB", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast1.show();
                        break;
                    case 2:
                        Toast toast2 = Toast.makeText(getApplicationContext(), "Tercer TAB", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER_VERTICAL,0,0);
                        toast2.show();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void crearNuevaTab(){
        int ic_4 = R.mipmap.ic_5_round;
        int ic_5 = R.mipmap.ic_4_round;
        int ic_6 = R.mipmap.ic_6_round;
        if(tabLayout.getTabCount() < 6){
            TabLayout.Tab nuevaTab = tabLayout.newTab();
            nuevaTab.setText("Tb " + (tabLayout.getTabCount()+1));
            switch (tabLayout.getTabCount()){
                case 3:
                    Toast.makeText(getApplicationContext(),"es el 3 " + ic_4 + " " + tabLayout.getTabCount(),Toast.LENGTH_SHORT).show();
                    nuevaTab.setIcon(ic_4);
                    break;
                case 4:
                    Toast.makeText(getApplicationContext(),"es el 4 " + ic_5 + " " + tabLayout.getTabCount(),Toast.LENGTH_SHORT).show();
                    nuevaTab.setIcon(ic_5);
                    break;
                case 5:
                    Toast.makeText(getApplicationContext(),"es el 5 " + ic_6 + " " + tabLayout.getTabCount(),Toast.LENGTH_SHORT).show();
                    nuevaTab.setIcon(ic_6);
                    break;
            }

            nuevaTab.setIcon(ic_4);

            tabLayout.addTab(nuevaTab);
        }else{
            Toast toastMax = Toast.makeText(getApplicationContext(), "Máximo 6 Tabs ", Toast.LENGTH_SHORT);
            toastMax.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toastMax.show();
        }
    }

    private void eliminarTab(){
        if(tabLayout.getTabCount() > 3){
            tabLayout.removeTab(tabLayout.getTabAt(tabLayout.getTabCount()-1));
        }else{
            Toast toastMin = Toast.makeText(getApplicationContext(), "Mínimo 3 Tabs", Toast.LENGTH_SHORT);
            toastMin.setGravity(Gravity.CENTER_VERTICAL,0,0);
            toastMin.show();
        }
    }
}
