package com.example.differentlayoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class LinearLayoutActivity extends AppCompatActivity {

    Button linearToGridButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        linearToGridButton = findViewById(R.id.toGridButton);
        linearToGridButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LinearLayoutActivity.this, GridLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}