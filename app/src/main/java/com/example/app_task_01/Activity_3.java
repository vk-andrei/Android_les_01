package com.example.app_task_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);


        Button btn_Activity_1to3 = findViewById(R.id.btn_to_Activity_1_from_3);

        btn_Activity_1to3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity_3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}