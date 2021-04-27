package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.COELENTERATA;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.arthropoda;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.echinodermata;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.mollusca;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.nematoda;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.platyhelminthes;
import com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang.porifera;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class hewantakbertulang_belakang extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button anne,art,coe,echi,molu,nema,platy,pori;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewantakbertulang_belakang);

        anne = findViewById(R.id.btnanne);
        art = findViewById(R.id.btnart);
        coe = findViewById(R.id.btncoe);
        echi = findViewById(R.id.btnechi);
        molu = findViewById(R.id.btnmolu);
        nema = findViewById(R.id.btnnema);
        platy = findViewById(R.id.btnplaty);
        pori = findViewById(R.id.btnpori);

        anne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this,annelida.class));
            }
        });
        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, arthropoda.class));
            }
        });
        coe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, COELENTERATA.class));
            }
        });
        echi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, echinodermata.class));
            }
        });
        molu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, mollusca.class));
            }
        });
        nema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, nematoda.class));
            }
        });
        platy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, platyhelminthes.class));
            }
        });
        pori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hewantakbertulang_belakang.this, porifera.class));
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
                startActivity(new Intent(hewantakbertulang_belakang.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(hewantakbertulang_belakang.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(hewantakbertulang_belakang.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_animalia:
                startActivity(new Intent(hewantakbertulang_belakang.this, kingdom_animalia.class));
                finish();
        }
        return false;
    }
}