package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {

    private ImageView imageView;

    private AnimationDrawable animationDrawable;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.logo_animation);
        imageView.setBackgroundResource(R.drawable.logo);

       // animationDrawable = (AnimationDrawable) imageView.getBackground();
        //animationDrawable.start();


     }

    @Override
    protected void onResume() {
        super.onResume();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }, 5000);


        Button goToSolicitacao = (Button)findViewById(R.id.btnGoToSolicitacao);

        goToSolicitacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SolicitacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}
