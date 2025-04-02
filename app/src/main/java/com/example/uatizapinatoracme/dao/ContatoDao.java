package com.example.uatizapinatoracme.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.uatizapinatoracme.bd.DBHelper;
import com.example.uatizapinatoracme.modelos.Contato;

public class ContatoDao {

    private SQLiteDatabase db;
    private DBHelper helper;

    public ContatoDao(Context context) {
        helper = new DBHelper(context);
    }

    public void Abrir(){
        db = helper.getReadableDatabase();
    }

    public void Fechar(){
        helper.close();
    }

    public Long Inserir(Contato c){
        ContentValues dados = new ContentValues();
        dados.put("Contato", c.getContato());
        dados.put("Celular", c.getCelular());
        dados.put("Email", c.getEmail());

        Long sqlId = db.insert("contatos", null, dados);

        return sqlId;

    }
}
