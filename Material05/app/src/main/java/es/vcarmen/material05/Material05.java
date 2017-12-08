package es.vcarmen.material05;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Material05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material05);
        initialize();
    }

    private void initialize(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }

    private void mensaje(int resid){
        Snackbar snc = Snackbar.make(findViewById(R.id.coordinatorLayout), resid, Snackbar.LENGTH_SHORT);
        snc.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.barra_nuevo: mensaje(R.string.cadena_barra_nuevo);
                return true;
            case R.id.barra_acerca: mensaje(R.string.cadena_barra_acerca);
                return true;
            case R.id.barra_ayuda: mensaje(R.string.cadena_barra_ayuda);
                return true;
            case R.id.barra_configurar: mensaje(R.string.cadena_barra_configurar);
                return true;
            case R.id.barra_editar: mensaje(R.string.cadena_barra_editar);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
