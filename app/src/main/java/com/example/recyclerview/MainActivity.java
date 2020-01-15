package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    int [] image = {R.drawable.flag_bangladesh,R.drawable.flag_bangladesh, R.drawable.flag_bangladesh,
            R.drawable.flag_bangladesh,R.drawable.flag_bangladesh,R.drawable.flag_bangladesh,
            R.drawable.flag_bangladesh,R.drawable.flag_bangladesh,R.drawable.flag_bangladesh,
    R.drawable.flag_bangladesh};

    String [] title,descriptioin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        title= getResources().getStringArray(R.array.country_name);
        descriptioin= getResources().getStringArray(R.array.description);


        Adapter adapter = new Adapter(this,title,descriptioin,image);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
