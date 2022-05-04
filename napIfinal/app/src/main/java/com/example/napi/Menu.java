package com.example.napi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {
    Intent tela = new Intent(getApplicationContext(),osTranstornos.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void clickCdastro(View view) {

tela= new Intent(getApplicationContext(),Cadastro.class);
startActivity(tela);

    }

    public void clickOsTranstornos(View view) {
tela= new Intent(getApplicationContext(),osTranstornos.class);
        startActivity(tela);
    }

    public void clickSos(View view) {
    }

    public void clickDicas(View view) {
    }
}