package com.casallana.angel.labellota;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mitexto = (TextView) findViewById(R.id.mitexto);
        mitexto.setText(R.string.mitexto2);
        mitexto.setTextColor(ResourcesCompat.getColor(getResources() , R.color.colorTittle , null));
        TextView subtitle = new TextView(this);
        subtitle.setText(R.string.subtitle);

        LinearLayout ll = (LinearLayout) findViewById(R.id.miDise);
        ll.addView(subtitle);
    }
}
