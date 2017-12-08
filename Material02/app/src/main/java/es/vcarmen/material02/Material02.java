package es.vcarmen.material02;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

public class Material02 extends AppCompatActivity{

    private boolean tocado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material02b);
        init();
    }

    private void init(){
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocado = !tocado;
                Toast.makeText(getApplicationContext(),"oeoeoeoe",Toast.LENGTH_SHORT).show();

                fab.setScaleX((float) 0);
                fab.setScaleY((float) 0);
                final Interpolator interpolator = AnimationUtils.loadInterpolator(getBaseContext(), android.R.interpolator.fast_out_linear_in);
                fab.animate().scaleX(0).scaleY(0).setInterpolator(interpolator).setDuration(600).start();

                fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolator).setDuration(600).setStartDelay(1000).setListener(new Animator.AnimatorListener() {

                    @Override
                    public void onAnimationStart(Animator animator) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override
                    public void onAnimationCancel(Animator animator) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animator) {

                    }
                });
                view.animate().rotation(tocado ? 45f: 0).setInterpolator(interpolator).start();
            }
        });
    }
}
