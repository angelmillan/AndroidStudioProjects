package es.vcarmen.material09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Material09 extends AppCompatActivity {

    private ImageView icono;
    private static final int DURACION = 250;
    private boolean giro = false;
    private LinearLayout detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material09);
        init();

    }

    private void init(){
        icono = (ImageView) findViewById(R.id.icono);
        detalle = (LinearLayout) findViewById(R.id.layout3);

        Toolbar barra1 = (Toolbar) findViewById(R.id.barra1);
        barra1.setTitle("El rapto de las Sabinas 1799");
        barra1.setSubtitle("Jacques-louis David");
        barra1.inflateMenu(R.menu.menu);

        barra1.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.opcionmenu1:
                        Toast.makeText(getApplicationContext(), "Pulsada opción 1" , Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.opcionmenu2:
                        Toast.makeText(getApplicationContext(), "Pulsada opción 2" , Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.opcionmenu3:
                        Toast.makeText(getApplicationContext(), "Pulsada Opcion 3" , Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    private void rotate(float angulo){
        Animation animacion = new RotateAnimation(0.0f, angulo, Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        animacion.setFillAfter(true);
        animacion.setDuration(DURACION);

        icono.startAnimation(animacion);
    }

    public void tocado(View v){
        if(giro){
            icono.setImageResource(R.mipmap.menos);
            rotate(-180.0f);
            giro = false;
            Dinamizador.contrae(detalle, DURACION);


        }else{
            icono.setImageResource(R.mipmap.mas);
            rotate(180.0f);
            Dinamizador.expande(detalle, DURACION);
            giro = true;
        }
    }

}
