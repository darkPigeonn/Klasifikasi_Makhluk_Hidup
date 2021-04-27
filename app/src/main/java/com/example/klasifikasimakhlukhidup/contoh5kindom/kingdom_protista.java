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
import com.example.klasifikasimakhlukhidup.Youtube_Protista;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.kingdommonera;
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class kingdom_protista extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button btnprotozoa, btnalga, btnjamurprotista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom_protista);

        TextView yt1 = findViewById(R.id.youtube_protista);
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_protista.this, Youtube_Protista.class));
            }
        });
        btnprotozoa = findViewById(R.id.protozoa);
        btnalga = findViewById(R.id.alga);
        btnjamurprotista=findViewById(R.id.protistajamur);

        btnprotozoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_protista.this, Protozoa.class));
            }
        });

        btnalga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_protista.this, Alga.class));
            }
        });

        btnjamurprotista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_protista.this, ProtistaMiripJamur.class));
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
                startActivity(new Intent(kingdom_protista.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(kingdom_protista.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(kingdom_protista.this, PerkembanganSistemKlasifikasi.class));
                finish();
        }
        return false;
    }
}