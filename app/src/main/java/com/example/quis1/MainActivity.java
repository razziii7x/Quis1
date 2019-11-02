package com.example.quis1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga>keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = findViewById(R.id.recycleview);
        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.mama),"Rini Yusidah","Ibu", "Diving, Coffee, Adventure"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.me),"Oliver Januardi Ababil","Anak Pertama", "Gaming, Music, Web Design"));
        keluargaArrayList.add(new Keluarga(getDrawable(R.drawable.ulil),"Aldryan Ulil Abshar","Anak Kedua", "Futsal, Comic"));
    }
}


