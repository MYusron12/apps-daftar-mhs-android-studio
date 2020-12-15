package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    TextView menuju_regist;
    Button menuju_home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //ambil id
        menuju_regist = findViewById(R.id.text_regist);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        menuju_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah_ke_regist = new Intent(login.this, regist.class);
                startActivity(pindah_ke_regist);
            }
        });

        //ambil id
        menuju_home = findViewById(R.id.buttonlogin);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        menuju_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ke_home = new Intent(login.this, home.class);
                startActivity(ke_home);
            }
        });
    }
}
