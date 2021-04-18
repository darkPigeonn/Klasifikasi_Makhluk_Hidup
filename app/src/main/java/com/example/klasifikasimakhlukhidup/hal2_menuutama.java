package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class hal2_menuutama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal2_menuutama);

        ImageView kompetensi = findViewById(R.id.btn_kompetensi);
        kompetensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(hal2_menuutama.this,hal4_menukompetensi.class);
                startActivity(a);
            }
        });

        ImageView petunjuk = findViewById(R.id.btn_petunjukpenggunaan);
        petunjuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(hal2_menuutama.this,hal4_menukompetensi.class);
                startActivity(a);
            }
        });

        ImageView konsep = findViewById(R.id.btn_konsep);
        konsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView materi = findViewById(R.id.btn_latihan);
        materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView daftarpustaka = findViewById(R.id.btn_daftarpustaka);
        daftarpustaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ImageView informasi = findViewById(R.id.btn_informasi);
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}