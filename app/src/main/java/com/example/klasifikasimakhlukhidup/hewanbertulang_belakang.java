package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.hewanberulangbelakang.ampibhia;
import com.example.klasifikasimakhlukhidup.hewanberulangbelakang.aves;
import com.example.klasifikasimakhlukhidup.hewanberulangbelakang.pisces;
import com.example.klasifikasimakhlukhidup.hewanberulangbelakang.reptilia;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.COELENTERATA;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.arthropoda;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.echinodermata;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.mollusca;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.nematoda;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.platyhelminthes;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.porifera;

import com.example.klasifikasimakhlukhidup.hewanberulangbelakang.mamalia;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class hewanbertulang_belakang extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button mama,amphibi,aves,reptil,pisces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewanbertulang_belakang);

        mama = findViewById(R.id.btnmama);
        amphibi = findViewById(R.id.btnamphi);
        aves=findViewById(R.id.btnamphi);
        reptil = findViewById(R.id.btnreptil);
        pisces = findViewById(R.id.btnpisces);

        mama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewanbertulang_belakang.this, mamalia.class));
            }
        });
        amphibi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewanbertulang_belakang.this, ampibhia.class));
            }
        });
        aves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewanbertulang_belakang.this, com.example.klasifikasimakhlukhidup.hewanberulangbelakang.aves.class));
            }
        });
        reptil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewanbertulang_belakang.this, reptilia.class));
            }
        });
        pisces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewanbertulang_belakang.this, com.example.klasifikasimakhlukhidup.hewanberulangbelakang.pisces.class));
            }
        });

    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub5);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(hewanbertulang_belakang.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(hewanbertulang_belakang.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(hewanbertulang_belakang.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_animalia:
                startActivity(new Intent(hewanbertulang_belakang.this, kingdom_animalia.class));
                finish();
        }
        return false;
    }
}