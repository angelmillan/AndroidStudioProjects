package es.vcarmen.activity02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity02a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity02a);
        Log.v("Momento","Estoy en Create");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.v("Momento","Estoy en Start");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Momento","Estoy en Restart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Momento","Estoy en Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Momento","Estoy en Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Momento","Estoy en Destroy");
    }



    public void boton2 (View view) {
        finish();
    }


}
