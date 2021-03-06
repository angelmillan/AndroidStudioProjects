package com.casallana.angel.testtextview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActivityTextView extends AppCompatActivity implements View.OnClickListener {
    private Typeface fuente;
    private  LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        ll = (LinearLayout) findViewById(R.id.miLinearLayout);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view) {
                addTextView(ll, "Prueba", 20);

            }



        });

        Button btnChangeTitle = (Button) findViewById(R.id.btnChangeTitle);
        Button btnCButton = (Button) findViewById(R.id.btnChangeButton);
        btnCButton.setOnClickListener(this);
        btnChangeTitle.setOnClickListener(this);



        fuente = Typeface.createFromAsset(getAssets(), "fonts/JandaAppleCobbler.ttf");

        TextView text = (TextView) findViewById(R.id.mytextView);
        text.setTypeface(fuente);
        // Animation  anim = AnimationUtils.loadAnimation(this, R.anim.conjunto);
        //anim.setRepeatMode(Animation.INFINITE);
        //anim.setRepeatCount(3);
        //text.startAnimation(anim);


        // text.setText(R.string.miTextView);
        //  text.append("\nSegunda Linea\n");


        // Se a
        ll = (LinearLayout) findViewById(R.id.miLinearLayout);
        String[] animales = {"Perro", "Gato", "Elefante", "Leon", "Jirafa"};

        for (int i = 0; i < animales.length; i++)
            addTextView(ll, animales[i], 24 + i * 4);


        crearAnimacion(text);


    }

        public void deleteAnimals (View views) {

        ll = (LinearLayout)  findViewById(R.id.miLinearLayout);
        int n = ll.getChildCount();
        for(int i = n-1 ; i > 3 ; i--) {
            Log.d("borrado",i+" "+n);
            ll.removeViewAt(i);
        }
    }







    public void addTextView(LinearLayout ll, String texto, float size) {
        TextView tv = new TextView(this);
        tv.setText(texto);
        tv.setTextSize(TypedValue.COMPLEX_UNIT_SP,size);
        ll.addView(tv);
    }

    public void crearAnimacion (View widget) {
        AnimationSet anim = new AnimationSet(true);

        int rp = TranslateAnimation.RELATIVE_TO_PARENT;
        TranslateAnimation desplazamiento = new TranslateAnimation(rp,0.0f,rp,1.0f,rp,0.0f,rp,0.0f);
        desplazamiento.setDuration(4000);
        desplazamiento.setStartOffset(2000);


        int rt = RotateAnimation.RELATIVE_TO_SELF;
        RotateAnimation rotacion = new RotateAnimation(0,360,rt,0.5f,rt,0.5f);
        rotacion.setDuration(4000);


        anim.addAnimation(desplazamiento);
        anim.addAnimation(rotacion);
        widget.startAnimation(anim);


    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) findViewById(R.id.btnChangeButton);
        Log.d("Pulsacion", (btn.getText().toString()));
    }
}
