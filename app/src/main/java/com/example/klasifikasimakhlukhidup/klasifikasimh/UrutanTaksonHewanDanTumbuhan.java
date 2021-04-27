package com.example.klasifikasimakhlukhidup.klasifikasimh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.ContohMh;
import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.YoutubeTakson;
import com.example.klasifikasimakhlukhidup.Youtube_1;
import com.example.klasifikasimakhlukhidup.diskusi.Diskusi2;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;

public class UrutanTaksonHewanDanTumbuhan extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1, x2, y1, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urutan_takson_hewan_dan_tumbuhan);

        TextView yt1 = findViewById(R.id.idyoutube1);
        yt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UrutanTaksonHewanDanTumbuhan.this, YoutubeTakson.class));
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
                startActivity(new Intent(UrutanTaksonHewanDanTumbuhan.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(UrutanTaksonHewanDanTumbuhan.this, hal10_menumateri.class));
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
                    Intent i = new Intent(UrutanTaksonHewanDanTumbuhan.this, Diskusi2.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right, R.anim.slide_left_out);
                    finish();
                }
                //kiri
                else if (x1 < x2) {
                    Intent i = new Intent(UrutanTaksonHewanDanTumbuhan.this, PengelompokDikotom.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }
}