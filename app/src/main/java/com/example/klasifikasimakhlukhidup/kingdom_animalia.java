package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class kingdom_animalia extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button bertulang,tidakbertulang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom_animalia);
        TextView yt1 = findViewById(R.id.youtube_anima);
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_animalia.this, Youtube_Anima.class));
            }
        });
        bertulang = findViewById(R.id.btnbertulang);
        tidakbertulang = findViewById(R.id.btntidakbertulang);

        bertulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_animalia.this,hewanbertulang_belakang.class));
            }
        });
        tidakbertulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_animalia.this,hewantakbertulang_belakang.class));
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
                startActivity(new Intent(kingdom_animalia.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(kingdom_animalia.this, hal10_menumateri.class));
                finish();break;

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(kingdom_animalia.this, PerkembanganSistemKlasifikasi.class));
                finish();break;
        }
        return false;
    }
}