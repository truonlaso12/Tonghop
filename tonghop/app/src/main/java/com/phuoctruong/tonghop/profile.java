package com.phuoctruong.tonghop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class profile extends AppCompatActivity {

    ImageButton bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        bt1 =(ImageButton) findViewById(R.id.bt1);
        bt2 =(ImageButton) findViewById(R.id.bt2);
        bt3 =(ImageButton) findViewById(R.id.bt3);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Inform();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh2 = new Intent(profile.this,profile.class);
                startActivity(mh2);

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(profile.this,list.class);
                startActivity(mh3);
            }
        });
    }
    public void Inform (){
        AlertDialog.Builder adg = new AlertDialog.Builder(this);
        adg.setTitle("Confirm!!!");
        adg.setMessage("Bạn Có Muốn Thoát Khỏi Người Dùng Này?");
        adg.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent mh2 = new Intent(profile.this,login.class);
                startActivity(mh2);
            }
        });
        adg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent mh2 = new Intent(profile.this,profile.class);
                startActivity(mh2);
            }
        });
        adg.show();
    }

}