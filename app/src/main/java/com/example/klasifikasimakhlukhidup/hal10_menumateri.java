package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.klasifikasimh.PengertianKlasifikasiMh;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class hal10_menumateri extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal10_menumateri);

        ImageView m_1 = findViewById(R.id.btnmateri1);

        ImageView m_2 = findViewById(R.id.btnmateri2);

        ImageView m_3 = findViewById(R.id.btnmateri3);

        ImageView m_4 = findViewById(R.id.btnmateri4);


        m_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal10_menumateri.this, hal11_pengertianmakhlukhidup.class));
            }
        });



        m_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal10_menumateri.this, PengertianKlasifikasiMh.class));
            }
        });



        m_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal10_menumateri.this, PerkembanganSistemKlasifikasi.class));
            }
        });



        m_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal10_menumateri.this, peranan_kingdom.class));
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
                startActivity(new Intent(hal10_menumateri.this,hal2_menuutama.class));
                finish();
        }
        return false;
    }
}