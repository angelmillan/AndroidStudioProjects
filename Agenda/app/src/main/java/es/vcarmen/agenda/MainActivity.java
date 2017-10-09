package es.vcarmen.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    String[] artistas = {"Miguel Angel", "Leonardo", "Michel Angelo", "Jacinto", "Picasso"};


        ArrayAdapter<String> adaptador = new ArrayAdapter<String> (this, android.R.layout.simple_expandable_list_item_1, artistas);
        AutoCompleteTextView texto = (AutoCompleteTextView) findViewById(R.id.artistas);
        texto.setAdapter(adaptador);
        MultiAutoCompleteTextView texto2 = (MultiAutoCompleteTextView) findViewById(R.id.textomultiple);
        texto2.setAdapter(adaptador);
        texto2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setAdapter(new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,artistas));


    }
}
