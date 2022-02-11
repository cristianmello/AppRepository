package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.tarea1) {
            Intent actTarea1 = new Intent(getApplicationContext(), activity_ejercicio01_tarea01.class);
            startActivity(actTarea1);
        } else if (id == R.id.tarea1_2) {
            Intent actTarea1_2 = new Intent(getApplicationContext(), activity_ejercicio01_tarea02.class);
            startActivity(actTarea1_2);
        } else if (id == R.id.tarea2) {
            Intent actTarea2 = new Intent(getApplicationContext(), activityMain_Ejercicio02_Tarea1_Welcome.class);
            startActivity(actTarea2);
        } else if (id == R.id.tarea2_2) {
            Intent actTarea2_2 = new Intent(getApplicationContext(), activity_main_ejercicio02_tarea02.class);
            startActivity(actTarea2_2);
        }
        return super.onOptionsItemSelected(item);
    }

}