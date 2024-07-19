package com.earth.burp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter2 extends BaseAdapter {
    TextView textView2;
    ImageView imageView2;
    Context context;

    String[] food_name;
    int[] food_image;

    LayoutInflater layoutinflater;

    public CustomListAdapter2(Context context, String[] food_name, int[] food_image) {
        this.context = context;
        this.food_name = food_name;
        this.food_image = food_image;
        layoutinflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return food_image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view = layoutinflater.inflate(R.layout.layout_list_item2, null);
        textView2 = view.findViewById(R.id.tvListItem2);
        imageView2 = view.findViewById(R.id.imageListItem2);
        textView2.setText(food_name[position]);
        imageView2.setImageResource(food_image[position]);
        return view;
    }
}
