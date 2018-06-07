package br.com.agnes_bruno.recifecoffee;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import br.com.agnes_bruno.recifecoffee.Utils.Singleton;

public class CafeteriaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeteria_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Singleton singleton = Singleton.getInstance();//Inicio da instancia da class

        ImageView imgBackground = findViewById(R.id.img_background);
        ImageView instaram = findViewById(R.id.insta);
        ImageView facebook = findViewById(R.id.face);

        instaram.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(singleton.getInstagram()));
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(singleton.getFacebook()));
                startActivity(intent);
            }
        });


    }

}
