package com.example.mybmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);

        List<String> list = new ArrayList<>();
        list.add("蘋果");
        list.add("香蕉");
        list.add("橘子");
        list.add("西瓜");
        list.add("草莓");
        list.add("葡萄");
        list.add("水蜜桃");
        list.add("蓮霧");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spFruit = findViewById(R.id.spFruit);
        TextView tvshow1 = findViewById(R.id.tvshow1);
        ListView lvfruit = findViewById(R.id.lvfruit);

        spFruit.setAdapter(adapter);
        lvfruit.setAdapter(adapter);

        spFruit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    tvshow1.setText(list.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lvfruit.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tvshow1.setText(list.get(position));
            }

        });
    }
}