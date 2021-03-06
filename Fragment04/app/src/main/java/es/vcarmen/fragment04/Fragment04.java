package es.vcarmen.fragment04;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Fragment04 extends FragmentActivity {
    private Button btnMostrarDialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment04);

        btnMostrarDialogo = findViewById(R.id.boton);
        btnMostrarDialogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragmento1 dialogoFrangment = Fragmento1.nuevaInstancia(" Nuevo fregmento diálogo ");
                dialogoFrangment.show(getSupportFragmentManager(),"diálogo");
            }
        });
    }

    public void positivo() {
        Toast.makeText(this, "Ok pulsado" , Toast.LENGTH_SHORT).show();
    }
    public void negativo() {
        Toast.makeText(this, "Rechazar pulsado" , Toast.LENGTH_SHORT).show();
    }
}
