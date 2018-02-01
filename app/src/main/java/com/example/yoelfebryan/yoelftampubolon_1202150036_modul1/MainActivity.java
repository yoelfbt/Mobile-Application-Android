package com.example.yoelfebryan.yoelftampubolon_1202150036_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;


public class MainActivity extends AppCompatActivity {

    Button bteatbus;
    Button btabnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bteatbus = (Button) findViewById(R.id.btneatbus);
        btabnormal = (Button) findViewById(R.id.btnabnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edResto = "Eatbus";
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                EditText edmenu = (EditText) findViewById(R.id.inputmenu);
                EditText edporsi = (EditText) findViewById(R.id.inputporsi);
                int sendporsi = Integer.parseInt(edporsi.getText().toString());
                String sendmenu = edmenu.getText().toString();
                int sendhasil = sendporsi *50000;
                if (sendhasil>65500){
                    Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
                }
                intent.putExtra("menu",sendmenu);
                intent.putExtra("porsi",sendporsi);
                intent.putExtra("hasil",sendhasil);
                intent.putExtra("namaresto", edResto);
                startActivity(intent);
            }
        });

        btabnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edResto = "Abnormal";
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                EditText edmenu = (EditText) findViewById(R.id.inputmenu);
                EditText edporsi = (EditText) findViewById(R.id.inputporsi);
                int sendporsi = Integer.parseInt(edporsi.getText().toString());
                String sendmenu = edmenu.getText().toString();
                int sendhasil = sendporsi *30000;
                if (sendhasil>65500){
                    Toast.makeText(MainActivity.this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
                }
                intent.putExtra("menu",sendmenu);
                intent.putExtra("porsi",sendporsi);
                intent.putExtra("hasil",sendhasil);
                intent.putExtra("namaresto", edResto);
                startActivity(intent);
            }
        });
    }
}
