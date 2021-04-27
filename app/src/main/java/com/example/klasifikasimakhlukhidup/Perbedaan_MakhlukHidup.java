package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.cirimh.hal12_ciricirimakhlukhidup;

public class Perbedaan_MakhlukHidup extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perbedaan__makhluk_hidup);
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
                startActivity(new Intent(Perbedaan_MakhlukHidup.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(Perbedaan_MakhlukHidup.this, hal10_menumateri.class));
                finish();
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
                    Intent i = new Intent(Perbedaan_MakhlukHidup.this, ContohMh.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
                    finish();
                }
                else if(x1 < x2){
                    Intent i = new Intent(Perbedaan_MakhlukHidup.this, hal12_ciricirimakhlukhidup.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_left,R.anim.slide_right_out);
                    finish();
                }
                break;
        }
        return false;
    }
}