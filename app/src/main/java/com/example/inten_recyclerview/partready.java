package com.example.inten_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class partready extends AppCompatActivity {
    private RecyclerView rvcetak;
    private ArrayList<partmodel> listpart = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partready);
        
        rvcetak = findViewById(R.id.rv_layout);
        rvcetak.setHasFixedSize(true);
        listpart.addAll(partdata.getListdata());
        
        showRycylerlist();
    }

    private void showRycylerlist() {
        rvcetak.setLayoutManager(new LinearLayoutManager(this));
        partadapter partadapter = new partadapter(this);
        partadapter.setPartmodels(listpart);
        rvcetak.setAdapter(partadapter);
    }
}