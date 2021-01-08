package com.example.sbapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class tambahdata extends AppCompatActivity {

    //    Button sukses_tambah;
    ImageView ke_profile;
    ImageView ke_home;

    private EditText ettambahnama,
            ettambahnim,
            ettambahjurusan,
            ettambahalamat,
            ettambahhobi,
            ettambahcitacita;

    private Button simpanTambah;
    private SQLiteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambahdata);

        //aksi input data
        ettambahnama = findViewById(R.id.ettambahnama);
        ettambahnim = findViewById(R.id.ettambahnim);
        ettambahjurusan = findViewById(R.id.ettambahjurusan);
        ettambahalamat = findViewById(R.id.ettambahalamat);
        ettambahhobi = findViewById(R.id.ettambahhobi);
        ettambahcitacita = findViewById(R.id.ettambahcitacita);
        simpanTambah = findViewById(R.id.simpanTambah);

        helper = new SQLiteHelper(this);

        //ambil id
//        sukses_tambah = findViewById(R.id.simpanTambah);

        //lakukan aksi, saat di klik menginstansiasi lalu menuju act regist
        simpanTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = ettambahnama.getText().toString();
                String nim = ettambahnim.getText().toString();
                String jurusan = ettambahjurusan.getText().toString();
                String alamat = ettambahalamat.getText().toString();
                String hobi = ettambahhobi.getText().toString();
                String citacita = ettambahcitacita.getText().toString();

                if(TextUtils.isEmpty(nama)){
                    ettambahnama.setError("Tidak boleh kosong");
                    ettambahnama.requestFocus();
                } else if(TextUtils.isEmpty(nim)) {
                    ettambahnim.setError("Tidak boleh kosong");
                    ettambahnim.requestFocus();
                } else if(TextUtils.isEmpty(jurusan)) {
                    ettambahjurusan.setError("Tidak boleh kosong");
                    ettambahjurusan.requestFocus();
                } else if(TextUtils.isEmpty(alamat)) {
                    ettambahalamat.setError("Tidak boleh kosong");
                    ettambahalamat.requestFocus();
                } else if(TextUtils.isEmpty(hobi)) {
                    ettambahhobi.setError("Tidak boleh kosong");
                    ettambahhobi.requestFocus();
                } else if(TextUtils.isEmpty(citacita)) {
                    ettambahcitacita.setError("Tidak boleh kosong");
                    ettambahcitacita.requestFocus();
                } else {
                    boolean isInsert = helper.insertData(nama, nim, jurusan, alamat, hobi, citacita);
                    if (isInsert){
                        Toast.makeText(tambahdata.this, "data berhasil disimpan", Toast.LENGTH_SHORT).show();
                        kosong();
                        Intent ke_home = new Intent(tambahdata.this, home.class);
                        startActivity(ke_home);
                    } else {
                        Toast.makeText(tambahdata.this, "data gagal disimpan", Toast.LENGTH_SHORT).show();
                        kosong();
                        Intent ke_home = new Intent(tambahdata.this, home.class);
                        startActivity(ke_home);
                    }
                }
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
    private void kosong(){
        ettambahnama.setText(null);
        ettambahnim.setText(null);
        ettambahjurusan.setText(null);
        ettambahalamat.setText(null);
        ettambahhobi.setText(null);
        ettambahcitacita.setText(null);
    }
}
