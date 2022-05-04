package com.example.napi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentBreadCrumbs;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Intent tela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicou(View view) {
        tela= new Intent(getApplicationContext(),Menu.class);
        startActivity(tela);

    }
    public void clicouCadastro(View view) {
        tela= new Intent(getApplicationContext(),Cadastro.class);
        startActivity(tela);

    }



    public void clickOsTranstornos(View view) {
        tela= new Intent(getApplicationContext(),osTranstornos.class);
        startActivity(tela);
    }
}