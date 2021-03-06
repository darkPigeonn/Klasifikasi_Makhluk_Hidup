package com.example.klasifikasimakhlukhidup.cirimh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.klasifikasimakhlukhidup.Perbedaan_MakhlukHidup;
import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal11_pengertianmakhlukhidup;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;

public class hal12_ciricirimakhlukhidup extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1,x2,y1,y2;
    TextView beradaptasi, bergerakk, berkembang, bernapas, ekskresi, iritabilitas, makan, tumbuh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal12_ciricirimakhlukhidup);

        beradaptasi = findViewById(R.id.btnBeradaptasi);
        bergerakk = findViewById(R.id.btnBergerak);
        berkembang = findViewById(R.id.btnBerkembangBiak);
        bernapas = findViewById(R.id.btnBernapas);
        ekskresi = findViewById(R.id.btnEkskresi);
        iritabilitas = findViewById(R.id.btnIritabilitas);
        makan = findViewById(R.id.btnMakan);
        tumbuh = findViewById(R.id.btnTumbuh);

        beradaptasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Beradaptasi.class));
            }
        });

        bergerakk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, bergerak.class));
            }
        });
        berkembang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, BerkembangBiak.class));
            }
        });
        bernapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Bernapas.class));
            }
        });
        ekskresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Ekspresi.class));
            }
        });
        iritabilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Iritabilitas.class));
            }
        });
        makan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Makan.class));
            }
        });
        tumbuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, Tumbuh.class));
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
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, hal2_menuutama.class));
                finish();break;
            case R.id.menumateribarr:
                startActivity(new Intent(hal12_ciricirimakhlukhidup.this, hal10_menumateri.class));
                finish();break;
        }
        return false;
    }
    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                //kanan
                if(x1 > x2){
//                    MediaPlayer mp = MediaPlayer.create(hal9_struktur_porifera.this,R.raw.sipe);
//                    mp.start();
                    Intent i = new Intent(hal12_ciricirimakhlukhidup.this, Perbedaan_MakhlukHidup.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
                    finish();
                }
                else if(x1 < x2){
                    Intent i = new Intent(hal12_ciricirimakhlukhidup.this, hal11_pengertianmakhlukhidup.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_left,R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }
}