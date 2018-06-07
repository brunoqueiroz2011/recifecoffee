package br.com.agnes_bruno.recifecoffee;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import br.com.agnes_bruno.recifecoffee.Utils.Prefs;

public class LoginActivity extends AppCompatActivity {

    EditText editUser, editSenha; //Variavel para obter as propriedades dos campos na tela de Login
    Handler handle = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences preferences =
                getSharedPreferences("agnesbruno", MODE_PRIVATE);
        if ((!Prefs.getString(LoginActivity.this, "Usuario").isEmpty()) &&
                (!Prefs.getString(LoginActivity.this, "Senha").isEmpty())) {
            login();
        }

        editUser = findViewById(R.id.edit_Usuario); //Faz a associação do Java com o layout
        editSenha = findViewById(R.id.edit_Senha); //Faz a associação do Java com o layout

        editUser.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if(keyEvent != null && KeyEvent.KEYCODE_ENTER == keyEvent.getKeyCode() || actionId == EditorInfo.IME_ACTION_GO) {
                    handle.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            editSenha.requestFocus();
                        }
                    }, 100);
                }

                return false;
            }
        });
        editSenha.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
                if(keyEvent != null && KeyEvent.KEYCODE_ENTER == keyEvent.getKeyCode() || actionId == EditorInfo.IME_ACTION_DONE) {
                    validateCampos();
                }

                return false;
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Esse botão chamara a tela de Cadastro para que o usuário possa e cadastra
                Intent intent = new Intent(LoginActivity.this, CadastroUsuarioActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Button btn_Login = findViewById(R.id.btn_Login);
        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateCampos();
            }
        });
    }

    private void validateCampos(){

        String userSave = Prefs.getString(LoginActivity.this, "Usuario");
        String passSave = Prefs.getString(LoginActivity.this, "Senha");
        String user = editUser.getText().toString();
        String pass = editSenha.getText().toString();

        if (editUser.getText().length() != 0 && editSenha.getText().length() != 0){
            if ((userSave.equals(user)) && (passSave.equals(pass))){
                handle.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        login();
                    }
                }, 100);
            }else{
                alertDialog();
            }
        }
    }

    private void login() {
        Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }

    private void alertDialog() {
        //atributo da classe.
        AlertDialog alerta;
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
        builder.setTitle("Erro de Login");
        //define a mensagem
        builder.setMessage("Usuário ou senha inválido, por favor informe um login correto!");
        //define um botão como positivo
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {
            }
        });
        //cria o AlertDialog
        alerta = builder.create();
        //Exibe
        alerta.show();
    }

}
