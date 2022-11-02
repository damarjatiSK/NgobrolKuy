package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class RoomChatActivity extends AppCompatActivity {
    LinearLayout PersonalChat1, PersonalChat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_chat);
        PersonalChat1 = findViewById(R.id.chat1);
        PersonalChat2 = findViewById(R.id.chat2);

//        PersonalChat1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view1) {
//                Intent login1 = new Intent(RoomChatActivity.this, ChatPersonalActivity.class);
//                startActivity(login1);
//            }
//        });
//
//        PersonalChat2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view2) {
//                Intent login2 = new Intent(RoomChatActivity.this, ChatPersonal2Activity.class);
//                startActivity(login2);
//            }
//        });
    }
    public void chat1(View view1) {
        Intent intent1 = new Intent(RoomChatActivity.this, ChatPersonalActivity.class);
        startActivity(intent1);
    }

    public void chat2(View view1) {
        Intent intent2 = new Intent(RoomChatActivity.this, ChatPersonal2Activity.class);
        startActivity(intent2);
    }
}