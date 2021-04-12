package com.example.inten_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class dengandata extends AppCompatActivity {
    TextView tv_data,tv_akhir;
    Button back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dengandata2);

        tv_akhir = findViewById(R.id.tv_data);

        String nama = getIntent().getStringExtra("et_pemesan");
        int barang = getIntent().getIntExtra("et_barang",0);
        String namabarang = getIntent().getStringExtra("et_namabarang");

        String hasil = "TERIMA KASIH TELAH MELAKUKAN PEMESANAN DENGAN DATA SEBAGAI BERIKUT:\n Nama :"+nama+"berjumlah "+barang+"dengan barang "+namabarang;
        tv_akhir.setText(hasil);

        back = findViewById(R.id.btn_dengandataback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //    Intent back = new Intent(dengandata.this , MainActivity.class);
              //  startActivity(back);

                finish();
            }
        });
    }
}