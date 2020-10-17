package com.phuoctruong.tonghop;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class list extends AppCompatActivity {
    ListView lv;
    ArrayList<item> arr;
    itemAdapter adapter;
    ImageButton bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv = (ListView) findViewById(R.id.lv);

        arr = new ArrayList<item>();
        arr.add(new item("Sống Cho Hết Đời Thanh Xuân",R.drawable.nhac));
        arr.add(new item("Có Chắc Yêu Là Đây",R.drawable.nhac));
        arr.add(new item("Bài Ca Tuổi Trẻ",R.drawable.nhac));
        arr.add(new item("Thích Quá Rùi Nà",R.drawable.nhac));
        arr.add(new item("Anh Vẫn Ok",R.drawable.nhac));
        arr.add(new item("Forever Alone",R.drawable.nhac));
        arr.add(new item("Làm Gì Phải Hốt",R.drawable.nhac));
        arr.add(new item("Em Bé",R.drawable.nhac));
        arr.add(new item("Ghé Qua",R.drawable.nhac));
        arr.add(new item("Em Của Ngày Hôm Qua",R.drawable.nhac));
        arr.add(new item("Ví Con Hết Mana",R.drawable.nhac));
        arr.add(new item("Cô Gái Vàng",R.drawable.nhac));
        arr.add(new item("Anh Thanh Niên",R.drawable.nhac));
        arr.add(new item("Stream Đến Bao Giờ",R.drawable.nhac));
        arr.add(new item("You're My Crush",R.drawable.nhac));
        arr.add(new item("2 Triệu Năm",R.drawable.nhac));
        arr.add(new item("Cảm Ơn",R.drawable.nhac));



        adapter = new itemAdapter(this,arr,R.layout.customlist);
        lv.setAdapter(adapter);

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
                Intent mh2 = new Intent(list.this,profile.class);
                startActivity(mh2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh3 = new Intent(list.this,list.class);
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
                Intent mh2 = new Intent(list.this,login.class);
                startActivity(mh2);
            }
        });
        adg.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent mh2 = new Intent(list.this,list.class);
                startActivity(mh2);
            }
        });
        adg.show();
}
}