package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        //membuat timer 3 detik untuk menampilkan form login
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //merubah splash ke login
                Intent menujulogin = new Intent(MainActivity.this,login.class);
                startActivity(menujulogin);
                finish();
            }
        }, 5000);
    }
}
