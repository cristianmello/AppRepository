package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Ejercicio04_Tarea02 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio04_tarea02);

    }

    public void PesoADolar (View view) {

        EditText editText = findViewById(R.id.inputCantidad);
        String pesosString = editText.getText().toString();
        if (pesosString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double pesos = Double.parseDouble(pesosString);
            double dolares = pesos / 43.11;
            String dolaresString = String.format("%.2f", dolares);
            String mensaje = "$U " + pesosString + " son USD " + dolaresString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void PesoAReal (View view) {
        EditText editText = findViewById(R.id.inputCantidad);
        String pesoString = editText.getText().toString();
        if (pesoString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double pesos = Double.parseDouble(pesoString);
            double reales = pesos / 8.39;
            String realesString = String.format("%.2f", reales);
            String mensaje = "$U " + pesoString + " son R$ " + realesString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void DolarAPeso (View view) {
        EditText editText = findViewById(R.id.inputCantidad);
        String dolaresString = editText.getText().toString();
        if (dolaresString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double dolares = Double.parseDouble(dolaresString);
            double pesos = dolares * 43.11;
            String pesosString = String.format("%.2f", pesos);
            String mensaje = "$USD " + dolaresString + " son $U " + pesosString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void DolarAReal (View view) {
        EditText editText = findViewById(R.id.inputCantidad);
        String dolaresString = editText.getText().toString();
        if (dolaresString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double dolares = Double.parseDouble(dolaresString);
            double reales = dolares * 5.14;
            String realesString = String.format("%.2f", reales);
            String mensaje = "$USD " + dolaresString + " son R$ " + realesString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void RealAPeso (View view) {
        EditText editText = findViewById(R.id.inputCantidad);
        String realesString = editText.getText().toString();
        if (realesString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double reales = Double.parseDouble(realesString);
            double pesos = reales * 8.39;
            String pesosString = String.format("%.2f", pesos);
            String mensaje = "R$ " + realesString + " son $U " + pesosString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

    public void RealADolar (View view) {
        EditText editText = findViewById(R.id.inputCantidad);
        String realesString = editText.getText().toString();
        if (realesString.isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor numerico", Toast.LENGTH_SHORT).show();
        } else {
            double reales = Double.parseDouble(realesString);
            double dolares = reales / 5.14;
            String dolaresString = String.format("%.2f", dolares);
            String mensaje = "R$ " + realesString + " son USD " + dolaresString;
            Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
        }
    }

}