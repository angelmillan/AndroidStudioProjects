package es.vcarmen.material03;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class activity_material03 extends AppCompatActivity implements View.OnClickListener {

    private boolean abierto = false;
    private boolean abierto2 = false;
    private FloatingActionButton fab1;
    private FloatingActionButton fab2;
    private FloatingActionButton fab2_1;
    private FloatingActionButton fab2_2;
    private FloatingActionButton fab2_3;
    private FloatingActionButton fab2_4;
    private FloatingActionButton fab3;
    private Animation animAbrir;
    private Animation animCerrar;
    private Animation animDerecha;
    private Animation animIzquierda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material03);

        initialize();
    }

    private void initialize() {
        fab1 = (FloatingActionButton) findViewById(R.id.fab1);
        fab2 = (FloatingActionButton) findViewById(R.id.fab2);
        fab2_1 = (FloatingActionButton) findViewById(R.id.fab2_1);
        fab2_2 = (FloatingActionButton) findViewById(R.id.fab2_2);
        fab2_3 = (FloatingActionButton) findViewById(R.id.fab2_3);
        fab2_4 = (FloatingActionButton) findViewById(R.id.fab2_4);
        fab3 = (FloatingActionButton) findViewById(R.id.fab3);

        animAbrir = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.abrir);
        animCerrar = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cerrar);
        animDerecha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.derecha);
        animIzquierda = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.izquierda);

        fab1.setOnClickListener(this);
        fab2.setOnClickListener(this);
        fab3.setOnClickListener(this);
        fab2_1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab1:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Has tocado el boton 1", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER, 0, 0);
                toast1.show();

                break;
            case R.id.fab2:
                Toast toast2 = Toast.makeText(getApplicationContext(), "Has tocado el boton 2", Toast.LENGTH_SHORT);
                toast2.setGravity(Gravity.CENTER, 0, 0);
                toast2.show();
                accionSubBotones();
                break;
            case R.id.fab3:
                if (abierto) {
                    fab1.startAnimation(animCerrar);
                    fab2.startAnimation(animCerrar);
                    fab3.startAnimation(animIzquierda);
                    fab1.setClickable(false);
                    fab2.setClickable(false);
                    abierto = false;
                    //cerrar();

                } else {
                    fab1.startAnimation(animAbrir);
                    fab2.startAnimation(animAbrir);
                    fab3.startAnimation(animDerecha);
                    fab1.setClickable(true);
                    fab2.setClickable(true);
                    abierto = true;

                }
                break;
            case R.id.fab2_1:
                Toast toast = Toast.makeText(getApplicationContext(), "Has tocado el boton 2_1", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
                break;
            case R.id.fab2_2:
                Toast.makeText(getApplicationContext(), "Has tocado el boton 2_2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab2_3:
                Toast.makeText(getApplicationContext(), "Has tocado el boton 2_3", Toast.LENGTH_SHORT).show();
                break;
            case R.id.fab2_4:
                Toast.makeText(getApplicationContext(), "Has tocado el boton 2_4", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

    private void accionSubBotones() {
        if (abierto2) {
            fab2_1.startAnimation(animCerrar);
            fab2_2.startAnimation(animCerrar);
            fab2_3.startAnimation(animCerrar);
            fab2_4.startAnimation(animCerrar);
            fab2.startAnimation(animIzquierda);
            fab2_1.setClickable(false);
            fab2_2.setClickable(false);
            fab2_3.setClickable(false);
            fab2_4.setClickable(false);
            abierto2 = false;

        } else {
            fab2_1.startAnimation(animAbrir);
            fab2_2.startAnimation(animAbrir);
            fab2_3.startAnimation(animAbrir);
            fab2_4.startAnimation(animAbrir);
            fab2.startAnimation(animDerecha);
            fab2_1.setClickable(true);
            fab2_2.setClickable(true);
            fab2_3.setClickable(true);
            fab2_4.setClickable(true);
            abierto2 = true;

        }
    }

    private void cerrar() {
        fab2_1.startAnimation(animCerrar);
        fab2_2.startAnimation(animCerrar);
        fab2_3.startAnimation(animCerrar);
        fab2_4.startAnimation(animCerrar);
        fab2.startAnimation(animIzquierda);
        fab2_1.setClickable(false);
        fab2_2.setClickable(false);
        fab2_3.setClickable(false);
        fab2_4.setClickable(false);
        abierto2 = false;
    }
}
