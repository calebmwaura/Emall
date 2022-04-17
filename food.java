package com.example.emall;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class food extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

       ImageView food = findViewById(R.id.cl0);
       ImageView food2 = findViewById(R.id.cl1);
       ImageView food3 = findViewById(R.id.cl2);


        

        String text = "I am interested in your product";

        //TODO link the numbers that send the items to this variable.
        String f0 = "+254705231589";
        String f1 = "+254746993728";
        String f2 = "+8618824659746";

        //button f0
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp
                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+f0+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                    //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                
            }
        });
        //f1
        food2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp
                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+f2+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();

            }
        });
        //f2
        food3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //directs the user to the seller whatsapp
                boolean installed = isAppInstalled("com.whatsapp");

                if(installed)
                {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("https://wa.me/ "+f0+"&text"+text));
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();
                }
                //Toast.makeText(food.this, "Whatsapp not installed, please install", Toast.LENGTH_SHORT).show();

            }
        });
        //f3
        //f4
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
