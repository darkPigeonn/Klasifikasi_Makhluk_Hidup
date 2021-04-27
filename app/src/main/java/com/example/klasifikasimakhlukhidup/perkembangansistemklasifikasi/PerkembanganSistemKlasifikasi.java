package com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_fungi;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_plantae;
import com.example.klasifikasimakhlukhidup.contoh5kindom.kingdom_protista;
import com.example.klasifikasimakhlukhidup.diskusi.Diskusi3;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.kingdom_animalia;
import com.example.klasifikasimakhlukhidup.kingdommonera;
import com.example.klasifikasimakhlukhidup.klasifikasimh.ManfaatDanKlasifikasi;
import com.example.klasifikasimakhlukhidup.klasifikasimh.PengelompokDikotom;
import com.example.klasifikasimakhlukhidup.klasifikasimh.TataCaraPemberian;
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;
import com.example.klasifikasimakhlukhidup.klasifikasimh.urutan_takson_determinasi;
import com.example.klasifikasimakhlukhidup.paku;

public class PerkembanganSistemKlasifikasi extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1,x2,y1,y2;
    TextView monera,protista,fungi,plantae,animalia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkembangan_sistem_klasifikasi);

        monera = findViewById(R.id.btnmonera);
        protista = findViewById(R.id.btnprotista);
        fungi = findViewById(R.id.btnfungi);
        plantae = findViewById(R.id.btnplantae);
        animalia = findViewById(R.id.btnanimalia);

        monera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, kingdommonera.class));
            }
        });
        protista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, kingdom_protista.class));
            }
        });

        fungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, kingdom_fungi.class));
            }
        });

        plantae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, kingdom_plantae.class));
            }
        });
        animalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, kingdom_animalia.class));
            }
        });
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menumateri);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(PerkembanganSistemKlasifikasi.this, hal10_menumateri.class));
                finish();
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch (touchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                //kanan
                if (x1 > x2) {
//                    MediaPlayer mp = MediaPlayer.create(hal9_struktur_porifera.this,R.raw.sipe);
//                    mp.start();
                    Intent i = new Intent(PerkembanganSistemKlasifikasi.this, Diskusi3.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right, R.anim.slide_left_out);
                    finish();
                }
                //kiri
//                else if (x1 < x2) {
//                    Intent i = new Intent(UrutanTaksonHewanDanTumbuhan.this, PengelompokDikotom.class);
//                    startActivity(i);
//                    overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
//                    finish();
//                }
                break;
        }
        return false;
    }
}