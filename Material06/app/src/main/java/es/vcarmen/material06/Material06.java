package es.vcarmen.material06;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Material06 extends AppCompatActivity {
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material06);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        TabLayout.Tab primerTab = tabLayout.newTab();
        primerTab.setText("Tab 01");
        primerTab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(primerTab);

        TabLayout.Tab segundoTab = tabLayout.newTab();
        segundoTab.setText("Tab 02");
        segundoTab.setIcon(R.drawable.icono1);
        tabLayout.addTab(segundoTab);

        TabLayout.Tab tercerTab = tabLayout.newTab();
        tercerTab.setText("Tab 03");
        tercerTab.setIcon(R.drawable.ic_tercertab);
        tabLayout.addTab(tercerTab,1,true);

        tabLayout.setTabTextColors(Color.RED, Color.WHITE);
        tabLayout.setSelectedTabIndicatorColor(Color.GRAY);
        tabLayout.setSelectedTabIndicatorHeight(25);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int elegida = tabLayout.getSelectedTabPosition();
                Toast.makeText(getApplication(), "Ha tocado el " + elegida , Toast.LENGTH_LONG).show();
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
