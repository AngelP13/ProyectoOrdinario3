package com.example.proyectoordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categoria1_Desayunos extends AppCompatActivity {
    Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria1_desayunos);
        total=(Button)findViewById(R.id.pagototal);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Categoria1_Desayunos.this, PantallaFinal.class);
                startActivity(i);
            }
        });

    }

}