package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LupasPassActivity extends AppCompatActivity {

    TextView tvBack1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupas_pass);

        tvBack1 = findViewById(R.id.buttonBack1);

        tvBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(LupasPassActivity.this, LoginActivity.class);
                startActivity(next);
            }
        });
    }
}