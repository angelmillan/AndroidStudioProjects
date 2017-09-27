package com.casallana.angel.ejercicio6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ponerTexto("Texto desde método");
    }

    public void ponerTexto  (String texto) {
        TextView textodemetodo = (TextView) findViewById(R.id.miTexto);
        textodemetodo.setText(texto);
    }
}
