package com.example.klasifikasimakhlukhidup.Lumut2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.paku;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class lumutdaun extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumutdaun);
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub4_lumut);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(lumutdaun.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(lumutdaun.this, hal10_menumateri.class));
                finish();break;

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(lumutdaun.this, PerkembanganSistemKlasifikasi.class));
                finish();break;
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(lumutdaun.this, kingdom_plantae.class));
                finish();break;
            case R.id.menusistemklasifikasi_plantae_paku:
                startActivity(new Intent(lumutdaun.this, paku.class));
                finish();break;
        }
        return false;
    }
}