package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class profil extends AppCompatActivity {

    ImageView ke_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        //ambil id
        ke_home = findViewById(R.id.imageView4);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        ke_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(profil.this, home.class);
                startActivity(profil);
            }
        });
    }
}
