package com.example.klasifikasimakhlukhidup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class PetunjukPenggunaan extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_penggunaan);

        Button video = findViewById(R.id.videotutorial);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1YE4E79R_M4fjchFDbeKqpSRMxdfINL0A/view?usp=drivesdk"));
                startActivity(implicit);
            }
        });
    }

    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menuutama);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(PetunjukPenggunaan.this,hal2_menuutama.class));
                finish();break;
        }
        return false;
    }
}