package com.example.klasifikasimakhlukhidup.diskusi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.ContohMh;
import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.klasifikasimh.ManfaatDanKlasifikasi;
import com.example.klasifikasimakhlukhidup.klasifikasimh.TataCaraPemberian;
import com.example.klasifikasimakhlukhidup.klasifikasimh.urutan_takson_determinasi;
import com.example.klasifikasimakhlukhidup.latihan_soal;

public class Diskusi1 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskusi1);
        Button soal = findViewById(R.id.likdiskusi);
        soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://download1496.mediafire.com/468ae05hml1g/liivhi9fgajwbvr/Lembar+Kerja+Peserta+Didik+1.docx"));
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mediafire.com/file/liivhi9fgajwbvr/Lembar_Kerja_Peserta_Didik_1.docx/file"));
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
                startActivity(new Intent(Diskusi1.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(Diskusi1.this, hal10_menumateri.class));
                finish();break;
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
//                if (x1 > x2) {
////                    MediaPlayer mp = MediaPlayer.create(hal9_struktur_porifera.this,R.raw.sipe);
////                    mp.start();
//                    Intent i = new Intent(ManfaatDanKlasifikasi.this, TataCaraPemberian.class);
//                    startActivity(i);
//                    overridePendingTransition(R.anim.slide_right, R.anim.slide_left_out);
//                    finish();
//                }
                //kiri
                if (x1 < x2) {
                    Intent i = new Intent(Diskusi1.this, ContohMh.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }
}