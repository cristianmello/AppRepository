package com.example.appmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class activity_main_ejercicio02_tarea02 extends AppCompatActivity {

    private Button wrButton;
    private TextView textView;
    private static final int REQUEST_CODE = 222;
    public static final String MESSAGE = "mensaje";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ejercicio02_tarea02);

        wrButton = (Button) findViewById(R.id.writeButton);
        textView = (TextView) findViewById(R.id.textView);

        wrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(),activity_main2_ejercicio02_tarea02.class), REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                textView.setText(data.getStringExtra(MESSAGE));
            } else if (resultCode == RESULT_CANCELED){
                textView.setText("Se ha cancelado");
            }
        }
    }
}