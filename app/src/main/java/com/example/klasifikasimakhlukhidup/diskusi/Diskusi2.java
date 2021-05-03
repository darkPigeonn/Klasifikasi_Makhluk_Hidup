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
import com.example.klasifikasimakhlukhidup.klasifikasimh.UrutanTaksonHewanDanTumbuhan;

public class Diskusi2 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskusi2);
        Button soal = findViewById(R.id.likdiskusi);
        soal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://download1336.mediafire.com/v0i4v2k57usg/h5rv76j1ymbjjuo/LEMBAR+KERJA+PESERTA+DIDIK+2.docx"));
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mediafire.com/file/h5rv76j1ymbjjuo/LEMBAR_KERJA_PESERTA_DIDIK_2.docx/file"));
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
                startActivity(new Intent(Diskusi2.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(Diskusi2.this, hal10_menumateri.class));
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
                    Intent i = new Intent(Diskusi2.this, UrutanTaksonHewanDanTumbuhan.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }

}