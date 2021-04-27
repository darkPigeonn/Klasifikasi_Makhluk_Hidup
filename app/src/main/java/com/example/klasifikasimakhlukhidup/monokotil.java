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
import com.example.klasifikasimakhlukhidup.contoh5kindom.monokotil.BawangBawangan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.monokotil.PinangPinangan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.monokotil.PisangPisangan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.monokotil.RumputRumputan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.spermatophyta;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class monokotil extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button bawang,pinang,pisang,rumput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monokotil);

        bawang = findViewById(R.id.btnbawang);
        pinang = findViewById(R.id.btnpinang);
        pisang = findViewById(R.id.btnpisang);
        rumput = findViewById(R.id.btnrumput);

        bawang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(monokotil.this, BawangBawangan.class));
            }
        });

        pinang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(monokotil.this, PinangPinangan.class));
            }
        });

        pisang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(monokotil.this, PisangPisangan.class));
            }
        });

        rumput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(monokotil.this, RumputRumputan.class));
            }
        });
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub4_biji_tertutup);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(monokotil.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(monokotil.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(monokotil.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(monokotil.this, kingdom_plantae.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji:
                startActivity(new Intent(monokotil.this, spermatophyta.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji_tutup:
                startActivity(new Intent(monokotil.this, angiospermae.class));
                finish();
        }
        return false;
    }
}