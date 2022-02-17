package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activityMain_Ejercicio02_Tarea1_Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_ejercicio02_tarea01);

        TextView msg = (TextView) findViewById(R.id.textView);
        String user = getIntent().getExtras().getString("usuario");
        msg.setText("Bienvenido " + user);
    }
}