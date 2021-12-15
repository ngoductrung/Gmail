package com.example.gmail;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<ItemModel> items;
    private int RGB = 0xFF + 1;
    private int a = 256;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add(new ItemModel( "alie@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "Billie@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "K@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "J@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "World@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "He@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "Teams@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "Make@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "Up@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "Mike@gmail.com", "adasdsdr"));
        items.add(new ItemModel( "You@gmail.com", "adasdsdr"));
        LinearLayout listLayout = findViewById(R.id.list_layout);
        for(int i = 0; i< items.size();i++){
            ItemModel item = items.get(i);
            View view = LayoutInflater.from(this).inflate(R.layout.item_layout_1,null);
            TextView name =  view.findViewById(R.id.name);
            TextView gmail = view.findViewById(R.id.gmail);
            TextView info = view.findViewById(R.id.text_info);
            name.setText(item.getGmail().substring(0,1).toUpperCase());
            gmail.setText(item.getGmail());
            info.setText(item.getInfo());
            listLayout.addView(view);

        }
    }
}