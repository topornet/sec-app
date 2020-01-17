package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class CompraActivity extends Activity {
    private ListView listView;

    ArrayList<Usuario> list = new ArrayList<Usuario>();
    ListAdapterUsuario adapterUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        for (int id = 1;id<=10;id++) {

            Usuario usuario = new Usuario();
            usuario.setNome("Usuario "+id);
            usuario.setQtdCoins(10+id);
            list.add(usuario);
        }


        listView = (ListView) findViewById(R.id.list_item);
        adapterUsuario = new ListAdapterUsuario(this,list);
        listView.setAdapter(adapterUsuario);

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
