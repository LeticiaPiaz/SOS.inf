package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {

    private String URL = "http://10.0.2.2:3000/users/auth";
    // criando os objetos para os componentes da tela
    private EditText edt_login, edt_senha;
    private ImageButton btn_entrar;
    // criando as váriaveis que receberão os valores digitados
    public static String login, token;

    public LoginActivity(){ }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_entrar = (ImageButton) findViewById(R.id.btn_entrar);
        edt_login = (EditText) findViewById(R.id.edt_login);
        edt_senha = (EditText) findViewById(R.id.edt_senha);

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamarTelaPrincipal();
            }
        });
    }

    private void chamarTelaPrincipal() {
        startActivity(new Intent(LoginActivity.this, principal.class));
    }
}