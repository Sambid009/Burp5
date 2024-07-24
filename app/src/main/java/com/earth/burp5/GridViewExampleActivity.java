package com.earth.burp5;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GridViewExampleActivity extends AppCompatActivity {

        GridView GridView;

    int[] language_image = {R.drawable.c, R.drawable.cplus, R.drawable.java, R.drawable.python, R.drawable.csharp,R.drawable.php,R.drawable.react,R.drawable.js,R.drawable.c,R.drawable.c};
    String[] language_name = {"C", "C++", "Java", "Python", "C#", "PHP", "React", "JavaScript", "C"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view_example);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GridView = findViewById(R.id.GridView);
        CustomGridAdapter customGridAdapter = new CustomGridAdapter(GridViewExampleActivity.this, language_image, language_name);
        GridView.setAdapter(customGridAdapter);


    }
}