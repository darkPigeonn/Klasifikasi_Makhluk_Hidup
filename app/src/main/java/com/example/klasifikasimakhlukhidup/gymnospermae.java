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
import com.example.klasifikasimakhlukhidup.contoh5kindom.spermatophyta;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class gymnospermae extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
   Button gne,gink,cyca,coni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymnospermae);

        gne = findViewById(R.id.btngnetop);
        gink = findViewById(R.id.btngink);
        cyca = findViewById(R.id.btncycado);
        coni = findViewById(R.id.btnconi);

        gne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(gymnospermae.this,gnetophya.class));
            }
        });

        gink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(gymnospermae.this,ginkgophyta.class));
            }
        });

        cyca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(gymnospermae.this,cycadophyta.class));
            }
        });

        coni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(gymnospermae.this,coniferophyta.class));
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
                startActivity(new Intent(gymnospermae.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(gymnospermae.this, hal10_menumateri.class));
                finish();break;

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(gymnospermae.this, PerkembanganSistemKlasifikasi.class));
                finish();break;
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(gymnospermae.this, kingdom_plantae.class));
                finish();break;
            case R.id.menusistemklasifikasi_plantae_biji:
                startActivity(new Intent(gymnospermae.this, spermatophyta.class));
                finish();break;
        }
        return false;
    }
}