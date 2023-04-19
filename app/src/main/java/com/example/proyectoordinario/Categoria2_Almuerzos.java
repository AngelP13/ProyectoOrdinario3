package com.example.proyectoordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categoria2_Almuerzos extends AppCompatActivity {
    Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria2_almuerzos);
        total=(Button)findViewById(R.id.totalpago);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( Categoria2_Almuerzos.this, PantallaFinal.class);
                startActivity(i);
            }
        });
    }
}