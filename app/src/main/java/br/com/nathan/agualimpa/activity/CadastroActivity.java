package br.com.nathan.agualimpa.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

import com.google.firebase.auth.FirebaseAuth;

import br.com.nathan.agualimpa.R;
import br.com.nathan.agualimpa.model.Usuario;

public class CadastroActivity extends Activity {


    Usuario usuario;
    FirebaseAuth autentificacao;
    EditText campoNome,campoEmail,campoCPF,campoSenha;
    Button botaoCadastrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    inicializar();

    }


    private void inicializar(){

        campoNome = findViewById(R.id.editTextNome);
        campoEmail = findViewById(R.id.editTextEmail);
        campoCPF = findViewById(R.id.editTextCPF);
        campoSenha = findViewById(R.id.editTextSenha);
        botaoCadastrar = findViewById(R.id.buttonCadastrar);
    }
    private void validarCampos(View v){
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        String cpf = campoCPF.getText().toString();
        String senha = campoSenha.getText().toString();

        if (!nome.isEmpty()){
            if (!email.isEmpty()){
                if (!cpf.isEmpty()){
                    if (!senha.isEmpty()){

                        Usuario usuario = new Usuario();

                        usuario.setNome(nome);
                        usuario.setEmail(email);
                        usuario.setCPF(cpf);
                        usuario.setSenha(senha);

                        //cadastro
                        cadastrarUsuario();

                    }else {
                        Toast.makeText(this,"Preencha a senha", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(this,"Preencha o CPF", Toast.LENGTH_SHORT).show();
                }
            }else {
                Toast.makeText(this,"Preencha o email", Toast.LENGTH_SHORT).show();
            }
        }else {
            Toast.makeText(this,"Preencha o nome", Toast.LENGTH_SHORT).show();

        }

    }


    private void cadastrarUsuario(){


    }
}