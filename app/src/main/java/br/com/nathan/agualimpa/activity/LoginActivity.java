package br.com.nathan.agualimpa.activity;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.com.nathan.agualimpa.R;

public class LoginActivity extends AppCompatActivity {

    Button Acessar, Cadastrar_se,Cadastrar;

    private View ValidarCampos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Cadastrar_se = findViewById(R.id.buttonCadastre_se);
        Acessar = findViewById(R.id.buttonAcessar);
        Cadastrar_se.setOnClickListener(this::Cadastrar);
        Acessar.setOnClickListener(this::Acessar);



    }


      public void Cadastrar(View v){
        Intent intent = new Intent(this,CadastroActivity.class);
        startActivity(intent);
      }

    public void Acessar(View v){
        Intent intent = new Intent(this,NoticiasActivity.class);
        startActivity(intent);

    }








}