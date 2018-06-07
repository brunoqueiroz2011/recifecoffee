package br.com.agnes_bruno.recifecoffee;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import br.com.agnes_bruno.recifecoffee.Cafeteria.Cafeteria;
import br.com.agnes_bruno.recifecoffee.Cafeteria.CafeteriaAdapter;
import br.com.agnes_bruno.recifecoffee.Utils.Singleton;

public class MenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, AdapterView.OnItemClickListener {

    private ListView listView; //ListView que mostra na tela principal as cafeteria
    private List<Cafeteria> cafeterias; //Lista das cafeterias cadastradas
    private Singleton singleton = Singleton.getInstance();//Inicio da instancia da class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview_Cafeterias);//Onde sera Inflado as Views com as cafeterias
        cafeterias = Cafeteria.getCafeterias(); // Chama o método que instancia a cafeteria e adiciona na lista

        listView.setAdapter(new CafeteriaAdapter(this, cafeterias));
        listView.setOnItemClickListener(this);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int idx, long id) {
        Cafeteria cafeteria = this.cafeterias.get(idx);
        singleton.setInstagram(cafeteria.getInstagram());
        singleton.setFacebook(cafeteria.getFacebook());
        singleton.setImgBackground(cafeteria.getImgBackground());

        Intent intent = new Intent(MenuActivity.this, CafeteriaDetailActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_category) {

        } else if (id == R.id.nav_map) {

        } else if (id == R.id.nav_profile) {

        } else if (id == R.id.nav_about) {
            Intent intent = new Intent(MenuActivity.this, SobreActivity.class);
            startActivity(intent);
            finish();

        } else if (id == R.id.nav_logout) {
            Intent intent = new Intent(MenuActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
