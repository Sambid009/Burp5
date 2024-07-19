package com.earth.burp5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListViewExampleActivity extends AppCompatActivity {

    ListView listView;
    String[] languages = {"Java","C","c#","C++","JavaScript","PHP","Python","React"};
    int[] itemImages = {R.drawable.java,R.drawable.c,R.drawable.csharp,R.drawable.cplus,R.drawable.js,R.drawable.php,R.drawable.python,R.drawable.react};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_view_example);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.listView);
        //----------------for single entries--------------------
//        ArrayAdapter arrayAdapter = new ArrayAdapter(ListViewExampleActivity.this, android.R.layout.simple_list_item_1, languages);
//        listView.setAdapter(arrayAdapter);

        //----------------for multiple entries--------------------
        CustomListAdapter customListAdapter = new CustomListAdapter(ListViewExampleActivity.this, languages, itemImages);
        listView.setAdapter(customListAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewExampleActivity.this, "Selected:: " + languages[position], Toast.LENGTH_SHORT).show();
            }
        });



    }
}