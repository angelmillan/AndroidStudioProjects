package es.vcarmen.fragment10;

import android.content.ClipData;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Fragment10 extends FragmentActivity implements Fragmento1.CallBacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment10);
    }

    @Override
    public void onEntradasSeleccionadas(String id) {
        Toast.makeText(getBaseContext(), "Has tocado el " + id, Toast.LENGTH_LONG ).show();

        Intent detalleIntent = new Intent(this, Fragment2.class);
        detalleIntent.putExtra(Fragmento3.ARG_ID_ENTRADA_SELECCIONADA,id);
        startActivity(detalleIntent);
    }
}
