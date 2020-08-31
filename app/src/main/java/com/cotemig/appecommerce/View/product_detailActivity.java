package com.cotemig.appecommerce.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.cotemig.appecommerce.R;

public class product_detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuproduto, menu);
        return true;
    }

    // metodo do APP que executa o que foi selecionado no menu de opções
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.act_search){
            Toast.makeText(this,"Você clicou no Search",Toast.LENGTH_LONG).show();
        }else if (id == R.id.act_share){
            Toast.makeText(this,"Você clicou no Share",Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
