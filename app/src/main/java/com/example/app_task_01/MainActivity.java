package com.example.app_task_01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_Activity_1 = findViewById(R.id.btn_to_Activity_2);
        Button btn_Activity_3 = findViewById(R.id.btn_to_Activity_3);

        btn_Activity_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_2.class);
                startActivity(intent);
                finish();
            }
        });

        btn_Activity_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity_3.class);
                startActivity(intent);
                finish();
            }
        });
    }
}