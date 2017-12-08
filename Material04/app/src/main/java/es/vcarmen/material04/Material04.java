package es.vcarmen.material04;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Material04 extends AppCompatActivity implements View.OnClickListener {

    CoordinatorLayout coordinatorLayout;
    FloatingActionButton fab;
    Button btnSimple;
    Button btnInteractivo;
    Button btnPersonalizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material04);

        initialize();
    }

    private void initialize() {
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        fab = (FloatingActionButton) findViewById(R.id.fab);
        btnSimple = (Button) findViewById(R.id.btnSimple);
        btnInteractivo = (Button) findViewById(R.id.btnInteractivo);
        btnPersonalizado = (Button) findViewById(R.id.btnPersonalizado);

        /*accionBotonSimple();
        accionBotonInteractivo();
        accionBotonPersonalizado();*/

        btnSimple.setOnClickListener(this);
        btnInteractivo.setOnClickListener(this);
        btnPersonalizado.setOnClickListener(this);
        fab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSimple:
                Snackbar snc1 = Snackbar.make(coordinatorLayout, "Ejemplo SnackBar", Snackbar.LENGTH_SHORT);
                snc1.show();
                break;
            case R.id.btnInteractivo:
                Snackbar snc2 = Snackbar.make(coordinatorLayout, "Mensaje Borrado", Snackbar.LENGTH_SHORT)
                        .setAction("UnDo", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snc = Snackbar.make(coordinatorLayout, "Mensaje Restaurado", Snackbar.LENGTH_SHORT);
                                snc.show();
                            }
                        });
                snc2.show();
                break;
            case R.id.btnPersonalizado:
                Snackbar snc3 = Snackbar.make(coordinatorLayout, "No encuentro Red", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snc = Snackbar.make(coordinatorLayout, "A probar again", Snackbar.LENGTH_SHORT);
                                snc.show();
                            }
                        });
                snc3.setActionTextColor(Color.CYAN);
                View sbView = snc3.getView();
                TextView texto = sbView.findViewById(android.support.design.R.id.snackbar_text);
                texto.setTextColor(Color.YELLOW);
                snc3.show();
                break;
            case R.id.fab:
                Snackbar snc4 = Snackbar.make(coordinatorLayout, "Ángel Millán Miralles", Snackbar.LENGTH_SHORT)
                        .setAction("Ok", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snc = Snackbar.make(coordinatorLayout, "Agur Magur!", Snackbar.LENGTH_SHORT);
                                View sbView = snc.getView();
                                TextView texto = sbView.findViewById(android.support.design.R.id.snackbar_text);
                                texto.setTextColor(Color.YELLOW);
                                snc.show();
                            }
                        });
                snc4.show();
                break;
            default:
                break;
        }
    }

    /*private void accionBotonSimple(){
        btnSimple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snc = Snackbar.make(coordinatorLayout, "EJEMPLO DE SNACKBAR", Snackbar.LENGTH_SHORT);
                snc.show();
            }
        });
    }

    private void accionBotonInteractivo(){
        btnInteractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snc = Snackbar.make(coordinatorLayout, "MENSAJE BORRADO", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snc = Snackbar.make(coordinatorLayout, "MENSAJE RESTAURADO", Snackbar.LENGTH_SHORT);
                                snc.show();
                            }
                        });
                snc.show();
            }
        });
    }

    private void accionBotonPersonalizado(){
        btnPersonalizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snc = Snackbar.make(coordinatorLayout, "NO ENCUENTRO LA RED", Snackbar.LENGTH_SHORT)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar snc = Snackbar.make(coordinatorLayout, "VOLVIENDO A PROBAR", Snackbar.LENGTH_SHORT);
                                snc.show();
                            }
                        });
                snc.setActionTextColor(Color.CYAN);
                View sbView = snc.getView();
                TextView texto = sbView.findViewById(android.support.design.R.id.snackbar_text);
                texto.setTextColor(Color.YELLOW);
                snc.show();
            }
        });
    }*/

}
