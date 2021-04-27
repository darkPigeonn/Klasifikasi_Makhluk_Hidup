
package com.example.klasifikasimakhlukhidup.hewantakbertulangbelakang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.example.klasifikasimakhlukhidup.R;
import com.example.klasifikasimakhlukhidup.hal10_menumateri;
import com.example.klasifikasimakhlukhidup.hal2_menuutama;
import com.example.klasifikasimakhlukhidup.kingdom_animalia;
import com.example.klasifikasimakhlukhidup.perkembangansistemklasifikasi.PerkembanganSistemKlasifikasi;

public class COELENTERATA extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_o_e_l_e_n_t_e_r_a_t);
    }
    public void showPopup(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.menusistemklasifikasi_sub5_takbelakang);
        popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuutama:
                startActivity(new Intent(COELENTERATA.this, hal2_menuutama.class));
                finish();
            case R.id.menumateribarr:
                startActivity(new Intent(COELENTERATA.this, hal10_menumateri.class));
                finish();

            case R.id.menusistemklasifikasi:
                startActivity(new Intent(COELENTERATA.this, PerkembanganSistemKlasifikasi.class));
                finish();
            case R.id.menusistemklasifikasi_animalia:
                startActivity(new Intent(COELENTERATA.this, kingdom_animalia.class));
                finish();
            case R.id.menusistemklasifikasi_animalia_takbertulang:
                startActivity(new Intent(COELENTERATA.this, kingdom_animalia.class));
                finish();
        }
        return false;
    }
}