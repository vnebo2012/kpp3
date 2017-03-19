package com.cppminitraktor.nikolay.minitraktor;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Privetstvie extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privetstvie);

        Animation anim1 = AnimationUtils.loadAnimation(
                getApplicationContext(), R.anim.scale);
        final TextView textView1 = (TextView) findViewById(R.id.textView2);

        textView1.startAnimation(anim1);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Privetstvie.this, StartActivity.class);
                startActivity(i);
                finish();
            }
        }, 2*600);
    }



}
