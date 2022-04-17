package com.example.emall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton btnfood = findViewById(R.id.food);


        ImageButton btnclothes = findViewById(R.id.clothes);

        ImageButton btnelectronics = findViewById(R.id.elect);

        ImageButton btnbeddings = findViewById(R.id.bed);

        //FOOD BUTTON
        btnfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), food.class);
                startActivity(intent);

            }
        });

        //CLOTHES BUTTON.
        btnclothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), clothes.class);
                startActivity(intent);
            }
        });

        //ELECTRONICS AND ELECTRICAL BUTTON
        btnelectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), electronics.class);
                startActivity(intent);
            }
        });

        //BEDDINGS
        btnbeddings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), beddings.class);
                startActivity(intent);
            }
        });

    }

}
