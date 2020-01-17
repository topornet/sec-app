package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class CompraActivity extends Activity {
    private ListView listaUsuarios;
    private String  [] usuarios = {
            "usuario1 - 10",
            "usuario2 - 20",
            "usuario3 - 40",
            "usuario4 - 15",
            "usuario5 - 17",
            "usuario6 - 26"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        listaUsuarios = (ListView) findViewById(R.id.list_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                usuarios
        );

        listaUsuarios.setAdapter(adapter);

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
