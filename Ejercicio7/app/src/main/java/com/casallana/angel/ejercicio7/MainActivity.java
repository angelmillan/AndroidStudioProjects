package com.casallana.angel.ejercicio7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        print("Primer texto");

        print2("Segundo texto");

    }
    public void print (String texto) {
        TextView textodemetodo = (TextView) findViewById(R.id.miTexto);
        textodemetodo.append(texto);
    }
    public void print2 (String texto) {
        TextView textodemetodo2 = (TextView) findViewById(R.id.miTexto2);
        textodemetodo2.append(texto);
    }
}
