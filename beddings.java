package com.example.emall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class beddings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ImageView bi0= findViewById(R.id.cl);
        ImageView bi1 = findViewById(R.id.cl1);//automation of the client objct (cl*) - an algorithm that checks for the maximum of the clothes in the dtb, if its not the max, cln++, to get the max
        //something like that
        ImageView bi2 = findViewById(R.id.cl2);



        String cc0 = "+254705231589";
        String text = "I am interested in your product";

        bi0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp

                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+cc0+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(beddings.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();

            }
        });
        //cl1
        bi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp

                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+cc0+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(beddings.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();

            }
        });

        //cl2
        bi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp

                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+cc0+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(beddings.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();

            }
        });
        //cl3
        //cl4
        //...
        //cln

    }

    private boolean isAppInstalled(String s) {
        //get the package
        PackageManager packageManager = getPackageManager();

        boolean is_installed;

        try {
            packageManager.getPackageInfo(s, PackageManager.GET_ACTIVITIES);
            is_installed = true;

        } catch (PackageManager.NameNotFoundException e) {
            is_installed = false;
            e.printStackTrace();
        }
        return is_installed;

    }
}
