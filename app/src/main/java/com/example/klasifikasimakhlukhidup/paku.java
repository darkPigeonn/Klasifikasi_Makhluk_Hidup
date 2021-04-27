package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.contoh5kindom.paku.PakuEkorKuda;
import com.example.klasifikasimakhlukhidup.contoh5kindom.paku.PakuKawat;
import com.example.klasifikasimakhlukhidup.contoh5kindom.paku.PakuSejati;
import com.example.klasifikasimakhlukhidup.contoh5kindom.paku.PakuTelanjang;
import com.example.klasifikasimakhlukhidup.contoh5kindom.spermatophyta;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class paku extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
   Button kuda,kawat,sejati,telanjang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paku);

        kuda = findViewById(R.id.btnkuda);
        kawat = findViewById(R.id.btnkawat);
        sejati = findViewById(R.id.btnsejati);
        telanjang = findViewById(R.id.btntelanjang);

        kuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paku.this, PakuEkorKuda.class));
            }
        });

        kawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paku.this, PakuKawat.class));
            }
        });
        sejati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paku.this, PakuSejati.class));
            }
        });
        telanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(paku.this, PakuTelanjang.class));
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
                startActivity(new Intent(paku.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(paku.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(paku.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(paku.this, kingdom_plantae.class));
                finish();
        }
        return false;
    }
}