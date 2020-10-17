package com.phuoctruong.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    Button btn1;
    Button btn2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new    Intent(login.this,signup.class);
                startActivity(mh2);
            }
        });
         btn2 = (Button) findViewById(R.id.btn1);
         btn2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent mh3 = new Intent(login.this,profile.class);
                 startActivity(mh3);
             }
         });

    }

}