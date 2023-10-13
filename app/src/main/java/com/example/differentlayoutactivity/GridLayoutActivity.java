package com.example.differentlayoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridLayoutActivity extends AppCompatActivity {

    Button gridToLinearButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        gridToLinearButton = findViewById(R.id.toLinearButton);
        gridToLinearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GridLayoutActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

    }
}