package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(onSearch());

        MenuItem shareItem = menu.findItem(R.id.action_share);
        ShareActionProvider share = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        share.setShareIntent(configurationIntent());

        return true;
    }

    private Intent configurationIntent() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/*");
        intent.putExtra(Intent.EXTRA_INTENT, "Texto para compartilhar");
        return intent;
    }


    private SearchView.OnQueryTextListener onSearch() {
        return new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        };

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
        } else if (id == R.id.tarea4) {
            Intent actTarea4 = new Intent(getApplicationContext(), Activity_Ejercicio04_Tarea02.class);
            startActivity(actTarea4);
        }
        return super.onOptionsItemSelected(item);
    }

}