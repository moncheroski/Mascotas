package com.monos.tllr3c3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<FDatos> lista = new ArrayList<FDatos>();
        lista.add(new FDatos ("Jack Russel", R.drawable.jcak,0));
        lista.add(new FDatos ("Beagle", R.drawable.beagle,0));
        lista.add(new FDatos ("Buldog", R.drawable.buldog2,0));
        lista.add(new FDatos ("Chihuahua", R.drawable.chihuahua,0));
        lista.add(new FDatos ("Labrador", R.drawable.labrador,0));
        lista.add(new FDatos ("West Highland", R.drawable.westh,0));

        RecyclerView contenedor = (RecyclerView) findViewById(R.id.contenedor);
            contenedor.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(LinearLayoutManager.VERTICAL);
        contenedor.setAdapter(new Adaptador(lista));
        contenedor.setLayoutManager(layout);
    }

    public void siguiente_activity (View view){
        Intent miIntent = new Intent(this, SegundoActivity.class);
        startActivity(miIntent);
    }

    }
