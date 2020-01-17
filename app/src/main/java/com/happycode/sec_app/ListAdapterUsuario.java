package com.happycode.sec_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapterUsuario extends ArrayAdapter<Usuario> {

    private Context context;
    private ArrayList<Usuario> list;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Usuario usuarioPosicao = this.list.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.usuario,null);

        TextView textView = (TextView) convertView.findViewById(R.id.textview);
        textView.setText(usuarioPosicao.getNome());

        TextView textView1 = (TextView) convertView.findViewById(R.id.textview2);
        textView1.setText(usuarioPosicao.getQtdCoins());

        return convertView;
    }

    public ListAdapterUsuario (Context context, ArrayList<Usuario>list) {

        super(context, 0,list);
        this.context = context;
        this.list = list;

    }


}
