package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class latihan_soal extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button soal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_soal);
        soal = findViewById(R.id.liksoal);
        soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/bbfdLqmsUSAWVC1K9"));
                startActivity(implicit);
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
                startActivity(new Intent(latihan_soal.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(latihan_soal.this, hal10_menumateri.class));
                finish();
        }
        return false;
    }
}