package com.example.klasifikasimakhlukhidup.contoh5kindom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.YoutubeTakson;
import com.example.klasifikasimakhlukhidup.Youtube_plantae;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;
import com.example.klasifikasimakhlukhidup.lumut;
import com.example.klasifikasimakhlukhidup.paku;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class kingdom_plantae extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button lumutbtn,bijibtn,pakubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom_plantae);
        TextView yt1 = findViewById(R.id.youtube_plan);
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_plantae.this, Youtube_plantae.class));
            }
        });
        lumutbtn = findViewById(R.id.btnlumut);
        bijibtn = findViewById(R.id.btnbiji);
        pakubtn = findViewById(R.id.btnpaku);

        lumutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_plantae.this, lumut.class));
            }
        });

        bijibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_plantae.this, spermatophyta.class));
            }
        });

        pakubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_plantae.this, paku.class));
            }
        });

    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(kingdom_plantae.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(kingdom_plantae.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(kingdom_plantae.this, PerkembanganSistemKlasifikasi.class));
                finish();
        }
        return false;
    }
}