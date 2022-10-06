package com.sgtech.learnkotlinbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<DataHolder> list;
    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    AdView adview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        addlist();
        recyclerView = findViewById(R.id.recycler);
        adapter = new RecyclerAdapter(this, list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        MobileAds.initialize(this);
        adview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adview.loadAd(adRequest);


    }

    public void addlist() {
        list.add(new DataHolder(getString(R.string.kotlin_introduction), "kotlin_intro.php"));
        list.add(new DataHolder(getString(R.string.kotlin_syntax), "kotlin_syntax.php"));
        list.add(new DataHolder(getString(R.string.kotlin_comment), "kotlin_comments.php"));
        list.add(new DataHolder(getString(R.string.kotlin_variables), "kotlin_variables.php"));
        list.add(new DataHolder(getString(R.string.kotlin_data_types), "kotlin_data_types.php"));
        list.add(new DataHolder(getString(R.string.kotlin_string), "kotlin_strings.php"));
        list.add(new DataHolder(getString(R.string.kotlin_boolean), "kotlin_booleans.php"));
        list.add(new DataHolder(getString(R.string.kotlin_if_else), "kotlin_conditions.php"));
        list.add(new DataHolder(getString(R.string.kotlin_when), "kotlin_when.php"));
        list.add(new DataHolder(getString(R.string.kotlin_while_loop), "kotlin_while_loop.php"));
        list.add(new DataHolder(getString(R.string.kotlin_break_continue), "kotlin_break.php"));
        list.add(new DataHolder(getString(R.string.kotlin_array), "kotlin_arrays.php"));
        list.add(new DataHolder(getString(R.string.kotlin_for_loop), "kotlin_for_loop.php"));
        list.add(new DataHolder(getString(R.string.kotlin_ranges), "kotlin_ranges.php"));
        list.add(new DataHolder(getString(R.string.kotlin_functions), "kotlin_functions.php"));

    }


}