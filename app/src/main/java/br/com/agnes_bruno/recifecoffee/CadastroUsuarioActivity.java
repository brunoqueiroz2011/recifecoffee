package br.com.agnes_bruno.recifecoffee;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import br.com.agnes_bruno.recifecoffee.Utils.Prefs;

public class CadastroUsuarioActivity extends AppCompatActivity {
   EditText etNome;
   EditText etSenha;
   EditText etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
]
        etNome (EditText) findViewById(R.id.etNomeusuario);
        etSenha (EditText) findViewById(R.id.edit_Senha);
        etEmail (EditText) findViewById(R.id.et_email);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Prefs.setString(this,"Usuario",etNome.getText().toString());
                Prefs.setString(this,"Senha",etSenha.getText().toString());
                Prefs.setString(this, "Email",etEmail.getText().toString());

                Snackbar.make(view, "Usuário salvo!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                Handler handle = new Handler();
                handle.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(CadastroUsuarioActivity.this, MenuActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 2000);
            }
        });
    }

}
