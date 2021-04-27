package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.diskusi.Diskusi4;
import com.example.klasifikasimakhlukhidup.klasifikasimh.PengertianKlasifikasiMh;

public class peranan_kingdom extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ImageButton keuntungan,kerugian;
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peranan_kingdom);

        keuntungan = findViewById(R.id.btnkeuntungan);
        kerugian = findViewById(R.id.btnkerugian);

        keuntungan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(peranan_kingdom.this,kingdom_untung.class));
            }
        });

        kerugian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(peranan_kingdom.this,kingdom_rugi.class));
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
                startActivity(new Intent(peranan_kingdom.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(peranan_kingdom.this, hal10_menumateri.class));
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
                    Intent i = new Intent(peranan_kingdom.this, Diskusi4.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right, R.anim.slide_left_out);
                    finish();
                }
                //kiri
//                if (x1 < x2) {
//                    Intent i = new Intent(Diskusi4.this, peranan_kingdom.class);
//                    startActivity(i);
//                    overridePendingTransition(R.anim.slide_left, R.anim.slide_right_out);
//                    finish();
//                }
                break;
        }
        return false;
    }
}