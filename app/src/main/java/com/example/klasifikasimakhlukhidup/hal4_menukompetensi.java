package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class hal4_menukompetensi extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal4_menukompetensi);

        ImageView inti = findViewById(R.id.btn_kompetensiInti);
        inti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menukompetensi.this,hal4_kompetensiinti.class));
            }
        });

        ImageView dasar = findViewById(R.id.btn_kompetensiDasar);
        dasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menukompetensi.this,hal4_kompetensidasar.class));
            }
        });

        ImageView indikator = findViewById(R.id.btn_indikator);
        indikator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menukompetensi.this,hal4_indikator.class));
            }
        });

        ImageView tujuanpembelajaran = findViewById(R.id.btn_tujuanpembelajaran);
        tujuanpembelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal4_menukompetensi.this,hal4_tujuanpembelajaran.class));
            }
        });
    }

    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menuutama);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(hal4_menukompetensi.this,hal2_menuutama.class));
                finish();
        }
        return false;
    }
}