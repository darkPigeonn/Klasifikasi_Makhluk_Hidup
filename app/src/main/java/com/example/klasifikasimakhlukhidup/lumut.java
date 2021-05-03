package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.Lumut2.lumutdaun;
import com.example.klasifikasimakhlukhidup.Lumut2.lumuthati;
import com.example.klasifikasimakhlukhidup.Lumut2.lumuttanduk;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.lumut;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class lumut extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
   Button hati,tanduk,daun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumut);

        hati = findViewById(R.id.btnhati);
        tanduk = findViewById(R.id.btntanduk);
        daun =findViewById(R.id.btndaun);

        hati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lumut.this, lumuthati.class));
            }
        });
        tanduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lumut.this, lumuttanduk.class));
            }
        });
        daun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(lumut.this, lumutdaun.class));
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
                startActivity(new Intent(lumut.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(lumut.this, hal10_menumateri.class));
                finish();break;

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(lumut.this, PerkembanganSistemKlasifikasi.class));
                finish();break;
            case R.id.menusistemklasifikasi_plantae:
                startActivity(new Intent(lumut.this, kingdom_plantae.class));
                finish();break;
        }
        return false;
    }
}