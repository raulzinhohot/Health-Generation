package com.example.healthgeneration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText nome;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void proximo(View view){

        Intent it = new Intent(LoginActivity.this, CadastroActivity.class);
        startActivity(it);

    }

    public void proximo2(View view){

        Intent it = new Intent(LoginActivity.this, PrincipalActivity.class);
        startActivity(it);

    }
}