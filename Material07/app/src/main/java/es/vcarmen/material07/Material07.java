package es.vcarmen.material07;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Material07 extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material07);
        init();
    }

    private void init(){
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        TabLayout.Tab primerTab = tabLayout.newTab().setText("facebook").setIcon(R.mipmap.ic_facebook_round);
        TabLayout.Tab segundoTab = tabLayout.newTab().setText("twitter").setIcon(R.mipmap.ic_twiter_round);
        TabLayout.Tab tercerTab = tabLayout.newTab().setText("linkedIn").setIcon(R.mipmap.ic_linkedin_round);

        tabLayout.addTab(primerTab);
        tabLayout.addTab(segundoTab);
        tabLayout.addTab(tercerTab);

        Fragment fragmento = new Primero();

        FragmentManager fm =  getSupportFragmentManager();
        final FragmentTransaction ft = fm.beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.add(R.id.contenedor, fragmento);
        ft.commit();
        ft.addToBackStack(null);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());



            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        

        viewPager = (ViewPager) findViewById(R.id.contenedor2);
        viewPager.setAdapter(new Adaptador(getSupportFragmentManager(), tabLayout.getTabCount()));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));



    }

}
