package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SolicitacaoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacao);
    }

    @Override

    protected void onResume() {
        super.onResume();

        Button voltarMainActivity = (Button) findViewById(R.id.btnVoltarMainActivity);

        voltarMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolicitacaoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button vender = (Button) findViewById(R.id.btnVenda);

        vender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolicitacaoActivity.this, VendaActivity.class);
                startActivity(intent);
            }
        });

        Button comprar = (Button) findViewById(R.id.btnCompra);

        comprar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SolicitacaoActivity.this, CompraActivity.class);
                startActivity(intent);
            }
        });

    }
}
