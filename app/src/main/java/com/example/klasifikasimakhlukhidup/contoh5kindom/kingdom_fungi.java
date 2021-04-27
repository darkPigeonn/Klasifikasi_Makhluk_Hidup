package com.example.klasifikasimakhlukhidup.contoh5kindom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.YoutubeTakson;
import com.example.klasifikasimakhlukhidup.Youtube_fungi;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class kingdom_fungi extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ImageButton acomy,basidio,zigo,deuteru;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kingdom_fungi);

        TextView yt1 = findViewById(R.id.youtube_fungi);
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_fungi.this, Youtube_fungi.class));
            }
        });
        acomy = findViewById(R.id.btnascom);
        basidio = findViewById(R.id.btnbasidio);
        zigo = findViewById(R.id.btnzigo);
        deuteru = findViewById(R.id.btndeutero);


        acomy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_fungi.this,Ascomycotina.class));
            }
        });

        basidio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(kingdom_fungi.this,Basidio.class));

            }
        });

        zigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(kingdom_fungi.this,Zigo.class));
            }
        });
        deuteru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(kingdom_fungi.this,Deutero.class));
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
                startActivity(new Intent(kingdom_fungi.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(kingdom_fungi.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(kingdom_fungi.this, PerkembanganSistemKlasifikasi.class));
                finish();
        }
        return false;
    }
}