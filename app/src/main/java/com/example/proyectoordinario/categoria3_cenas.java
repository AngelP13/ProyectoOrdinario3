package com.example.proyectoordinario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class categoria3_cenas extends AppCompatActivity {

    Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria3_cenas);
        total=(Button)findViewById(R.id.pagocena);

        total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent( categoria3_cenas.this, PantallaFinal.class);
                startActivity(i);
            }
        });

    }
}