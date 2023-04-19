package com.example.proyectoordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button desayuno,almuerzo,cena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        desayuno=(Button)findViewById(R.id.desayuno);
        almuerzo=(Button)findViewById(R.id.almuerzo);
        cena=(Button)findViewById(R.id.cena);

        desayuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Menu.this, Categoria1_Desayunos.class);
                startActivity(i);
            }
        });

        almuerzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Menu.this, Categoria2_Almuerzos.class);
                startActivity(i);
            }
        });

        cena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Menu.this, categoria3_cenas.class);
                startActivity(i);
            }
        });

    }
}