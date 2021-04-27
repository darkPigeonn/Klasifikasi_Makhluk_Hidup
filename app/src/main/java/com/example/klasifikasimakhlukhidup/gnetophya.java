package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.contoh5kindom.spermatophyta;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class gnetophya extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gnetophya);
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub4_biji_terbuka);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(gnetophya.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(gnetophya.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(gnetophya.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(gnetophya.this, kingdom_plantae.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji:
                startActivity(new Intent(gnetophya.this, spermatophyta.class));
                finish();
            case R.id.menusistemklasifikasi_plantae_biji_buka:
                startActivity(new Intent(gnetophya.this, gymnospermae.class));
                finish();
        }
        return false;
    }
}