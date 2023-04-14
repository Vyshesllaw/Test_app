package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {

    private ImageButton buttonCenozoic;
    private ImageButton buttonMesozoic;
    private ImageButton buttonPaleozoic;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonCenozoic = findViewById(R.id.buttonCenozoic);
        buttonMesozoic = findViewById(R.id.buttonMesozoic);
        buttonPaleozoic = findViewById(R.id.buttonPaleozoic);

        buttonCenozoic.setOnClickListener(listener);
        buttonMesozoic.setOnClickListener(listener);
        buttonPaleozoic.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.buttonCenozoic:
                    Intent intentCenozoic = new Intent(getApplicationContext(), CenozoicActivity.class);
                    startActivity(intentCenozoic);
                    break;
                case R.id.buttonMesozoic:
                    Intent intentMesozoic = new Intent(getApplicationContext(), MesozoicActivity.class);
                    startActivity(intentMesozoic);
                    break;
                case R.id.buttonPaleozoic:
                    Intent intentPaleozoic = new Intent(getApplicationContext(), PaleozoicActivity.class);
                    startActivity(intentPaleozoic);
                    break;
            }
        }
    };
}