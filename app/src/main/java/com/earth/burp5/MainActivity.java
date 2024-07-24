package com.earth.burp5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnlistView, btnListView2, btnGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnlistView = findViewById(R.id.btnListView);
        btnlistView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ListViewActivity
                Intent sambid = new Intent(MainActivity.this, ListViewExampleActivity.class);
                startActivity(sambid);
            }
        });
        btnListView2 = findViewById(R.id.btnListView2);
        btnListView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ListViewActivity
                Intent sambid2 = new Intent(MainActivity.this, ListViewExampleActivity2.class);
                startActivity(sambid2);
            }
        });

        btnGridView = findViewById(R.id.btnGridView);

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ListViewActivity
                Intent sambid3 = new Intent(MainActivity.this, GridViewExampleActivity.class);
                startActivity(sambid3);
            }
        });


        }
    }




