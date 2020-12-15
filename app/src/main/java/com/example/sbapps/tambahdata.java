package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class tambahdata extends AppCompatActivity {

    Button sukses_tambah;
    ImageView ke_profile;
    ImageView ke_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahdata);

        //ambil id
        sukses_tambah = findViewById(R.id.simpanTambah);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        sukses_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_home = new Intent(tambahdata.this, home.class);
                startActivity(ke_home);
            }
        });

        //ambil id
        ke_profile = findViewById(R.id.ivprofile);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(tambahdata.this, profil.class);
                startActivity(profil);
            }
        });

        //ambil id
        ke_home = findViewById(R.id.imageView4);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(tambahdata.this, home.class);
                startActivity(home);
            }
        });
    }
}
