package es.vcarmen.botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements OnClickListener, OnLongClickListener, CompoundButton.OnCheckedChangeListener {
    private int numero = 0;
    private TextView tn;
    private LinearLayout mainLayaut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayaut = (LinearLayout) findViewById(R.id.mainLayaut);

        ToggleButton tGb = (ToggleButton) findViewById(R.id.btnTogle);
        tGb.setOnCheckedChangeListener(this);

        tn = (TextView) findViewById(R.id.numero);
        tn.setText(numero+"");
        Button btnIcn = (Button) findViewById(R.id.inc);
        Button btnDec = (Button) findViewById(R.id.dec);

        btnIcn.setOnClickListener(this);
        btnDec.setOnClickListener(this);
        btnIcn.setOnLongClickListener(this);
        btnDec.setOnLongClickListener(this);


/*
        btnIcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero++;
                tn.setText(numero+"");
            }
        });

        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (numero > 0){
                    numero--;
                    tn.setText(numero+"");
                }

            }
        });
*/


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.inc:
                numero++;
                tn.setText((numero+""));
                break;
            case R.id.dec:
                if (numero > 0){
                    numero--;
                    tn.setText(numero+"");
                }
                break;
        }
    }

    @Override
    public boolean onLongClick(View view) {

        switch (view.getId()) {
            case R.id.inc:
                numero += 10;
                tn.setText((numero+""));
                return true;

            case R.id.dec:
                if (numero > 10){
                    numero -= 10;
                    tn.setText(numero+"");
                }
                return true;

        }
        return false;
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            mainLayaut.setBackgroundColor(getResources().getColor(R.color.colorOn));
        } else {
            mainLayaut.setBackgroundColor(getResources().getColor(R.color.colorOff));
        }
    }
}
