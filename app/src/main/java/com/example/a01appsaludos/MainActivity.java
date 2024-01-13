package com.example.a01appsaludos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button miBtn;
    TextView titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edittext);
        miBtn = findViewById(R.id.btn);
        titulo = findViewById(R.id.title);

        miBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ingresoNombre = editText.getText().toString();

                Toast.makeText(
                        MainActivity.this,
                        "Bienvenido "+ ingresoNombre +" a nuestra aplicación",
                        Toast.LENGTH_LONG).show();

            }
        });
    }
}