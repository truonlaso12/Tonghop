package com.phuoctruong.tonghop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inform("Thông báo", "Đăng Ký Thành Công");
            }
        });

    }
    public  void inform(String title, String mess){
        android.app.AlertDialog.Builder adg = new android.app.AlertDialog.Builder(this);
        adg.setTitle(title);
        adg.setMessage(mess);

        adg.setPositiveButton("Quay Lại Trang Đăng Nhập", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent mh1 = new  Intent(signup.this,login.class);
                startActivity(mh1);
            }
        });
        adg.show();
    }
}