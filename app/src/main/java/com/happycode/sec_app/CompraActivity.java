package com.happycode.sec_app;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CompraActivity extends Activity {

    ArrayList<Usuario> lista = new ArrayList<Usuario>();
    ListAdapterUsuario adapterUsuario;
    ListView listView;

    private EditText qtdComprar;
    private TextView saldoAtual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        qtdComprar = (EditText) findViewById(R.id.qtdComprar);

        Bundle extra = getIntent().getExtras();
        if (extra != null) {

            String usuario = extra.getString("usuario");
            Float saldo = extra.getFloat("saldo");
            saldoAtual = findViewById(R.id.saldoAtual);
            saldoAtual.setText(saldo.toString());
        }


        listView = (ListView) findViewById(R.id.list_vendedores);
        adapterUsuario = new ListAdapterUsuario(this, lista);
        listView.setAdapter(adapterUsuario);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codeposition = position;
                String usuarioEscolhido = lista.get(codeposition).getNome();
                Toast.makeText(getApplicationContext(), usuarioEscolhido, Toast.LENGTH_LONG).show();
            }
        });


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
