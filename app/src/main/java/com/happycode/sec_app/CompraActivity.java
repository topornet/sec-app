package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);
    }


    @Override
    protected void onResume() {
        super.onResume();

        Button btnVoltar = (Button) findViewById(R.id.btnVoltarSolicitacao);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CompraActivity.this, SolicitacaoActivity.class);
                startActivity(intent);
            }
        });
    }
}
