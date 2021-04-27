package com.example.klasifikasimakhlukhidup.contoh5kindom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.kingdommonera;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class Alga extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alga);
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub2);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(Alga.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(Alga.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(Alga.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_protista:
                startActivity(new Intent(Alga.this, kingdommonera.class));
                finish();
        }
        return false;
    }
}