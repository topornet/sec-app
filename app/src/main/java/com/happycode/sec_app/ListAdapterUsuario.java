package com.happycode.sec_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapterUsuario extends ArrayAdapter<Usuario> {

    private Context context;
    private ArrayList<Usuario> lista;

    public ListAdapterUsuario (Context context, ArrayList<Usuario> lista) {
        super(context, 0,lista);
        this.context = context;
        this.lista = lista;
        carregarLista();
    }

    private void carregarLista() {
        for (int id = 1;id <= 10;id++) {
            lista.add(new Usuario("Usuario "+id, 100+id));
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Usuario usuarioPosicao = this.lista.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.usuario,null);

        TextView textView = (TextView) convertView.findViewById(R.id.textview);
        textView.setText(usuarioPosicao.getNome());
        textView.setGravity(Gravity.CENTER_VERTICAL);

        TextView textView1 = (TextView) convertView.findViewById(R.id.textview2);
        textView1.setText(Integer.toString(usuarioPosicao.getQtdCoins()));
        textView1.setGravity(Gravity.CENTER_VERTICAL);

        return convertView;
    }




}
