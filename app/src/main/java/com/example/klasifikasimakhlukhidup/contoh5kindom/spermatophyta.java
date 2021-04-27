package com.example.klasifikasimakhlukhidup.contoh5kindom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.angiospermae;
import com.example.klasifikasimakhlukhidup.gymnospermae;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.kingdommonera;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class spermatophyta extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ImageButton bterbuka,btutup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spermatophyta);

        bterbuka = findViewById(R.id.btnbijiterbuka);
        btutup = findViewById(R.id.btnbijitertutup);

        bterbuka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(spermatophyta.this, gymnospermae.class));
            }
        });
        btutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(spermatophyta.this, angiospermae.class));
            }
        });
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub4);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(spermatophyta.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(spermatophyta.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(spermatophyta.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(spermatophyta.this, kingdom_plantae.class));
                finish();
        }
        return false;
    }
}