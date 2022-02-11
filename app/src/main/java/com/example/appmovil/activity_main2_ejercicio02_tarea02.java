package com.example.appmovil;

import static com.example.appmovil.activity_main_ejercicio02_tarea02.MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_main2_ejercicio02_tarea02 extends AppCompatActivity {

    private Button rsButton;
    private EditText edText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_ejercicio02_tarea02);

        edText = (EditText) findViewById(R.id.editText);
        rsButton = (Button) findViewById(R.id.buttonResult);

        rsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                String mensaje = edText.getText().toString();
                intent.putExtra(MESSAGE, mensaje);
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}