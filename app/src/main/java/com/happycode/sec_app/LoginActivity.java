package com.happycode.sec_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    protected void  onResume() {
        super.onResume();

        Button telaSolicitacao = (Button)findViewById(R.id.btnEntrar);

        telaSolicitacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                

                Intent intent = new Intent(LoginActivity.this, SolicitacaoActivity.class);
                startActivity(intent);
            }
        });

    }


}
