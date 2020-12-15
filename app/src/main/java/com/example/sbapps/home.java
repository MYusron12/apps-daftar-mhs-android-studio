package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class home extends AppCompatActivity {

    Button tambah_data;
    ImageView ke_profile;
    TextView logout;
    ImageView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //ambil id
        tambah_data = findViewById(R.id.buttonTambah);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        tambah_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_ke_tambah = new Intent(home.this, tambahdata.class);
                startActivity(pindah_ke_tambah);
            }
        });

        //ambil id
        ke_profile = findViewById(R.id.imageView123);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(home.this, profil.class);
                startActivity(profil);
            }
        });

        //ambil id
        logout = findViewById(R.id.textView);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_login = new Intent(home.this, login.class);
                startActivity(ke_login);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field1);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field2);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field3);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field4);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field5);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });

        //ambil id
        edit = findViewById(R.id.imageView5field6);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_edit = new Intent(home.this, edit.class);
                startActivity(ke_edit);
            }
        });
    }
}
