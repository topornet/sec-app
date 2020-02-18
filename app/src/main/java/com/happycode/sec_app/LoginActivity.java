package com.happycode.sec_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

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
                String usuario =  ((EditText) findViewById(R.id.username)).getText().toString();
                String senha = ((EditText)findViewById(R.id.password)).getText().toString();

                String usuref = "marco";
                String senharef = "123";

                if (!usuario.equals(usuref) || !senha.equals(senharef)){
                    Toast.makeText(getApplicationContext(),"Usuário ou senha inválidos",Toast.LENGTH_SHORT).show();
                } else {


                    Intent intent = new Intent(LoginActivity.this, SolicitacaoActivity.class);
                    intent.putExtra("usuario",usuario);
                    intent.putExtra("saldo", 15000F);
                    startActivity(intent);
                }
            }
        });

    }


}
