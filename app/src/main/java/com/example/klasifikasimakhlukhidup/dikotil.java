package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.contoh5kindom.dikotil.GetahGetahan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.dikotil.KacangKacangan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.dikotil.TerungTerungan;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.contoh5kindom.spermatophyta;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class dikotil extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button papilo,solanace,getah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dikotil);

        papilo = findViewById(R.id.btnkacang);
        solanace = findViewById(R.id.btnterung);
        getah = findViewById(R.id.btngetah);

        papilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dikotil.this, KacangKacangan.class));
            }
        });

        solanace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dikotil.this, TerungTerungan.class));
            }
        });

        getah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(dikotil.this, GetahGetahan.class));
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
                startActivity(new Intent(dikotil.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(dikotil.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(dikotil.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(dikotil.this, kingdom_plantae.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji:
                startActivity(new Intent(dikotil.this, spermatophyta.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji_tutup:
                startActivity(new Intent(dikotil.this, angiospermae.class));
                finish();
        }
        return false;
    }
}