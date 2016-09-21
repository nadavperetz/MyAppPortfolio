package com.nadavperetz.appportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_movies = (Button) findViewById(R.id.button_movies);
        Button button_stock = (Button) findViewById(R.id.button_stock);
        Button button_bigger = (Button) findViewById(R.id.button_bigger);
        Button button_material = (Button) findViewById(R.id.button_material);
        Button button_ubiquitous = (Button) findViewById(R.id.button_ubiquitous);
        Button button_capstone = (Button) findViewById(R.id.button_capstone);

        button_movies.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.movies_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button_stock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.stock_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button_bigger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.app_bigger_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button_material.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.material_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button_ubiquitous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.ubiquitous_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button_capstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), R.string.capstone_toast,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
