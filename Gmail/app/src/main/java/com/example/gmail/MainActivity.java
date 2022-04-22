package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String str1[], str2[];
    int images[] = {
            R.drawable.andrew,
            R.drawable.donn,
            R.drawable.gian,
            R.drawable.joseph,
            R.drawable.luis,
            R.drawable.minh,
            R.drawable.oliver,
            R.drawable.sushi,
            R.drawable.taylor,
            R.drawable.warren
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        str1 = getResources().getStringArray(R.array.user_name);
        str2 = getResources().getStringArray(R.array.msg_detail);

        AdapterEmail adapterEmail = new AdapterEmail(this, str1, str2, images);
        recyclerView.setAdapter(adapterEmail);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}