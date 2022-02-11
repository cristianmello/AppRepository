package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_ejercicio01_tarea01 extends AppCompatActivity {

    Button btn;
    EditText inputText;
    TextView tView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio01_tarea01);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(view -> {
            inputText = findViewById(R.id.inputText);
            String textString = inputText.getText().toString();
            tView = findViewById(R.id.textView2);
            tView.setText(textString);
            Toast.makeText(getApplicationContext(), textString , Toast.LENGTH_SHORT).show();
        });
    }
}