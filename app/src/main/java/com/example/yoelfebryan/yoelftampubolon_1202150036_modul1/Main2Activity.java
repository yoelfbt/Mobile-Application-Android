package com.example.yoelfebryan.yoelftampubolon_1202150036_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView Dmenu = (TextView) findViewById(R.id.displaymenu);
        TextView Dporsi = (TextView) findViewById(R.id.displayporsi);
        TextView Dharga = (TextView) findViewById(R.id.displayharga);
        TextView Dresto = (TextView) findViewById(R.id.displayrestoran);

        String menu = getIntent().getStringExtra("menu");
        int porsi = getIntent().getIntExtra("porsi",0);
        int hasil = getIntent().getIntExtra("hasil",0);
        String namaResto= getIntent().getStringExtra("namaresto");

        Dmenu.setText(menu);
        Dporsi.setText(String.valueOf(porsi));
        Dharga.setText(String.valueOf(hasil));
        Dresto.setText(namaResto);
    }
}
