package com.cotemig.appecommerce.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.cotemig.appecommerce.R;

public class CadastroProdutos extends AppCompatActivity implements View.OnClickListener{
    // Instanciando a classe ViewHolder
    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produtos);
        //
        this.mViewHolder.Listview_Produtos = findViewById(R.id.Listview_Produtos);
        this.mViewHolder.btn_Cadastrar = findViewById(R.id.btn_Cadastrar);
        this.mViewHolder.btn_Cadastrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent telaproduto = new Intent(this,Formulario_Produtos.class);
        startActivity(telaproduto);
    }

    private static class ViewHolder{
        private ListView Listview_Produtos;
        private Button btn_Cadastrar;

    }
}