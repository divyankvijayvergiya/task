package io.funswitch.task;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2, textView3, textView4, textView5, textView6;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.tt);
        textView2 = findViewById(R.id.tt1);
        textView3 = findViewById(R.id.tt2);
        textView4 = findViewById(R.id.tt3);
        textView5 = findViewById(R.id.tt4);
        textView6 = findViewById(R.id.tt5);
        linearLayout = findViewById(R.id.ll);

        ValueAnimator animator = ValueAnimator.ofInt(1, 9);
        animator.setDuration(1000);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator animation) {
                textView1.setText("#"+animation.getAnimatedValue().toString());

            }
        });
        animator.start();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(1, 9);
                animator1.setDuration(1000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView2.setText(animation.getAnimatedValue().toString());
                    }
                });
                animator1.start();
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(1, 9);
                animator1.setDuration(1000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView3.setText(animation.getAnimatedValue().toString());
                    }
                });
                animator1.start();
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(1, 9);
                animator1.setDuration(1000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView4.setText(animation.getAnimatedValue().toString());
                    }
                });
                animator1.start();
            }
        }, 3000);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(1, 9);
                animator1.setDuration(1000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView5.setText(animation.getAnimatedValue().toString());
                    }
                });
                animator1.start();
            }
        }, 4000);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(1, 9);
                animator1.setDuration(1000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView6.setText(animation.getAnimatedValue().toString());
                    }
                });
                animator1.start();
            }
        }, 5000);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                ValueAnimator animator1 = ValueAnimator.ofInt(90, 20);
                animator1.setDuration(4000);
                animator1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator animation) {

                        textView1.setTextSize((int) animation.getAnimatedValue());
                        textView2.setTextSize((int) animation.getAnimatedValue());
                        textView3.setTextSize((int) animation.getAnimatedValue());
                        textView4.setTextSize((int) animation.getAnimatedValue());
                        textView5.setTextSize((int) animation.getAnimatedValue());
                        textView6.setTextSize((int) animation.getAnimatedValue());

                        linearLayout.setGravity(Gravity.CENTER);
                    }
                });
                animator1.start();
            }
        }, 6000);


    }
}
