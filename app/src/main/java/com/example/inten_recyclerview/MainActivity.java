package com.example.inten_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button tombol1,tombol2,tombol3,tombol4,tombol5;
    TextView pemesan,barang,namabarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol1 = findViewById(R.id.btn_tanpadata);
        tombol2 = findViewById(R.id.btn_dengandata);
        tombol3 = findViewById(R.id.btn_callcenter);
        tombol4 = findViewById(R.id.btn_web);
        tombol5 = findViewById(R.id.btn_ready);
        pemesan = findViewById(R.id.et_pemesan);
        barang= findViewById(R.id.et_barang);
        namabarang = findViewById(R.id.et_namabarang);

        //pindah tanpa data
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this,tanpadata.class);
                startActivity(pindah);
            }
        });

        //pindah dengan data
       tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(MainActivity.this,dengandata.class);
                data.putExtra("et_pemesan",pemesan.getText().toString());
                data.putExtra("et_barang",Integer.parseInt(barang.getText().toString()));
                data.putExtra("et_namabarang",namabarang.getText().toString());
                startActivity(data);
            }
        });

        //Call Center
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call =  new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0217248367"));
                startActivity(call);
            }
        });

        //Website
        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.vespa.com/id_ID/"));
                startActivity(web);
            }
        });

        //part ready
        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah2 = new Intent(MainActivity.this,partready.class);
                startActivity(pindah2);
            }
        });

    }
}