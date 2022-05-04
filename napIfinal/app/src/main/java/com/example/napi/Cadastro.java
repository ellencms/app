package com.example.napi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class Cadastro extends AppCompatActivity {

    EditText edt1, edt2, edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

         edt1 = (EditText) findViewById(R.id.editTextTextPersonName);
         edt2 = (EditText) findViewById(R.id.editTextTextPersonName2);
         edt3 = (EditText) findViewById(R.id.editTextTextPersonName3);

    }

    public void CadastrarNovo (View view){


        Cadastro_Notificado notificar_alunos = new Cadastro_Notificado(Cadastro.this);

        NotificationCompat.Builder avisoGerado =
                notificar_alunos.builder
                        (edt1.getText().toString()+"Seja Bem vindo (a)"
                                ,"Aproveite o PsychoDigital!");

        notificar_alunos.getManager().notify(new Random().nextInt(), avisoGerado.build());

    }

}