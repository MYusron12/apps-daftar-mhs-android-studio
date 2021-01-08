package com.example.sbapps;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {
    private static final String namadb = "sahabatbelajar.db";
    private static final String namatabel = "mahasiswa";

    private static final String kolom1 = "ID";
    private static final String kolom2 = "NAMA";
    private static final String kolom3 = "NIM";
    private static final String kolom4 = "JURUSAN";
    private static final String kolom5 = "ALAMAT";
    private static final String kolom6 = "HOBI";
    private static final String kolom7 = "CITACITA";


    public SQLiteHelper(@Nullable Context context) {
        super(context, namadb, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + namatabel + " ( " +
                kolom1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                kolom2 + " TEXT, " +
                kolom3 + " TEXT, " +
                kolom4 + " TEXT, " +
                kolom5 + " TEXT, " +
                kolom6 + " TEXT, " +
                kolom7 + " TEXT " +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + namatabel);
    }

    //biklin method insert
    public boolean insertData(String nama, String nim, String jurusan, String alamat, String hobi, String citacita){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(kolom1, nama);
        values.put(kolom1, nim);
        values.put(kolom1, jurusan);
        values.put(kolom1, alamat);
        values.put(kolom1, hobi);
        values.put(kolom1, citacita);
        long result = db.insert(namatabel, null, values);
        return result != -1;
    }
}
