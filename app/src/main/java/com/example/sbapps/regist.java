package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class regist extends AppCompatActivity {

    TextView menuju_login;
    Button ke_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        menuju_login = findViewById(R.id.back_to_login);
        menuju_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balik_ke_login = new Intent(regist.this,login.class);
                startActivity(balik_ke_login);
            }
        });

        ke_login = findViewById(R.id.buttonregist);
        ke_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sukses_regist = new Intent(regist.this,login.class);
                startActivity(sukses_regist);
            }
        });
    }
}
