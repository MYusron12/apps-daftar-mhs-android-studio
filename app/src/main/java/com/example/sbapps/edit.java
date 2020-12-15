package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class edit extends AppCompatActivity {

    Button menuju_home;
    ImageView ke_profile;
    ImageView ke_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        //ambil id
        menuju_home = findViewById(R.id.update);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        menuju_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_home = new Intent(edit.this, home.class);
                startActivity(ke_home);
            }
        });

        //ambil id
        ke_profile = findViewById(R.id.ivprofile);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(edit.this, profil.class);
                startActivity(profile);
            }
        });

        //ambil id
        ke_home = findViewById(R.id.imageView4);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(edit.this, home.class);
                startActivity(home);
            }
        });

    }
}
