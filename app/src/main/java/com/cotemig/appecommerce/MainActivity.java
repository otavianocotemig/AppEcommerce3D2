package com.cotemig.appecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    // Instanciar a classe ViewHoler
    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.iv_ProductNews = this.findViewById(R.id.iv_ProductsNews);
        this.mViewHolder.iv_ProductNews.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        // chamda da tela de details products
        Intent acessoTelaDetailsProducts = new Intent(this,product_detailActivity.class);
        startActivity(acessoTelaDetailsProducts);
    }
    // Código utilizado para manipular menu de opções na activity
    // metodo do app que invoca o menu de opções
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal,menu);
        return super.onCreateOptionsMenu(menu);
    }
    // metodo do APP que executa o que foi selecionado no menu de opções
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_search){
            Toast.makeText(this,"Você clicou no Search",Toast.LENGTH_LONG).show();
        }else if (id == R.id.action_ProdutosRecentes){
            Intent acessoTelaDetailsProducts = new Intent(this,product_detailActivity.class);
            startActivity(acessoTelaDetailsProducts);
        }else if (id == R.id.action_login){
            Toast.makeText(this,"Você clicou no Login",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private static class ViewHolder{
        private ImageView iv_ProductNews;

    }
}
