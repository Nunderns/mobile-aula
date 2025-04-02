package com.example.uatizapinatoracme.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.uatizapinatoracme.bd.DBHelper;
import com.example.uatizapinatoracme.modelos.Contato;

import java.util.ArrayList;
import java.util.List;

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

    public List<Contato> ListarContatos(){
        List<Contato> lista = new ArrayList<Contato>();

        String campos[] = new String[]{"Contato", "Celular", "Email"};

        Cursor dados = db.query("contatos", campos, null, null, null, null, "Contato", null);

        dados.moveToFirst();

        while (!dados.isAfterLast()) {
            Contato c = new Contato(
                    dados.getString(0),
                    dados.getString(1),
                    dados.getString(2)
            );

            lista.add(c);

            dados.moveToNext();
        }
        return lista;
    }
}
