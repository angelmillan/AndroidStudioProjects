package com.casallana.angel.ejercicio4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView texto = (TextView) findViewById(R.id.miTexto);
        texto.setText("NUEVO TEXTO");
        texto.append("\nOTRA LINEA 1 CON APPEND");
        texto.append("\nOTRA LINEA 2 CON APPEND");
    }
}
