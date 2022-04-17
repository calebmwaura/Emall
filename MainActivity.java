package com.example.emall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //TODO  small cumcodes that get attached to someones shoulder,,,,ill just have to tP TEM AND ITS ATACHED AND VICE SERSA
    
    EditText   username, password, repassword;
    Button signup, signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialise these variables.
        username  = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);

        signup = (Button) findViewById(R.id.btnsignup);
        signin = (Button) findViewById(R.id.btnsignin);

        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                ///the action for the sign button
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass =  repassword.getText().toString();

                if (user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(MainActivity.this, "please enter all the details", Toast.LENGTH_SHORT).show();
                else{
                    if (pass.equals(repass))//if the two passwords match.
                    {

                        Boolean checkuser =DB.checkusername(user);//check if user is in the database
                        if (checkuser==false)
                        {
                            Boolean insert = DB.insertData(user, pass);
                            if (insert==true)
                            {
                                Toast.makeText(MainActivity.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(MainActivity.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(MainActivity.this, "User already exist please sign in", Toast.LENGTH_SHORT).show();
                        }

                    }else{
                        Toast.makeText(MainActivity.this, "Password not matching", Toast.LENGTH_SHORT).show();

                    }

                }
            }
        });//action ends here

        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //the action for the sign in button
                Intent intent  = new Intent(getApplicationContext(), LActivity.class);
                startActivity(intent);
            }
        });//action ends here

}}