package com.example.myfirstapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bnt = (Button) findViewById(R.id.bnt1);
        TextView txt = (TextView) findViewById(R.id.ola);

        bnt.setOnClickListener(v -> {
            txt.setText("mudou!");
            Toast.makeText(MainActivity.this, "clicado", Toast.LENGTH_LONG).show();
        });
    }
}