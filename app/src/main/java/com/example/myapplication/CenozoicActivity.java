package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class CenozoicActivity extends AppCompatActivity {

    private ListView listView;

    private TextView textView;

    private ArrayList<String> arrCenozoic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cenozoic);
        textView = findViewById(R.id.textViewInfo);

        listView = findViewById(R.id.list_cenozoic);

        Collections.addAll(arrCenozoic, "Глиптодон", "Астрапотерии", "Цератогаулюс", "Сумчатый лев", "Палеопарадоксия", "Дорудон", "Индрикотерий", "Мегатерий");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrCenozoic);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int index, long l) {
                adapter.remove(adapter.getItem(index));
                adapter.notifyDataSetInvalidated();
//                textView.setText(str);
            }
        });

    }
}