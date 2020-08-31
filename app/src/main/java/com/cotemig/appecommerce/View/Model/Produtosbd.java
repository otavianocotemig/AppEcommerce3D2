package com.cotemig.appecommerce.View.Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Produtosbd extends SQLiteOpenHelper
{
    private static final String DATABASE = "BDLOJAVIRTUAL";
    private static final int VERSION = 1;

    public Produtosbd (Context context){
        super(context,DATABASE,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String Produto = "CREATE TABLE produtos (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, nomeProduto TEXT NOT NULL, Descricao TEXT NOT NULL, Quantidade INTEGER, Preco Double);";
        db.execSQL(Produto);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String Produto = "DROP TABLE IF EXISTS produtos";
        db.execSQL(Produto);
    }
    // Utilizdo para Salvar Produtos
    public void SalvarProduto(Produtos dtoProduto){

    }
}
