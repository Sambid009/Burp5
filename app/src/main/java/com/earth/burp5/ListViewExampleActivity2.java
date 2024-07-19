package com.earth.burp5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListViewExampleActivity2 extends AppCompatActivity {
    ListView listView2;
    String[] food_name = {"pizza","momo","sushi","pizza","momo","sushi","pizza","momo","sushi","momo"};
    int[] food_image = {R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza,R.drawable.pizza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_example2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listView2 = findViewById(R.id.listView2);
        CustomListAdapter2 customListAdapter = new CustomListAdapter2(ListViewExampleActivity2.this, food_name, food_image);
        listView2.setAdapter(customListAdapter);

//        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(ListViewExampleActivity2.this, "Selected:: " + food_image[position], Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}