package com.example.sample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class wordadapter extends ArrayAdapter {
    public wordadapter(@NonNull Context context, ArrayList<word> words) {
        super(context,0,words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemview=convertView;
        if(listitemview==null){ listitemview= LayoutInflater.from(getContext()).inflate(R.layout.listitem,parent,false); }

        word curentword= (word) getItem(position);

        TextView title=listitemview.findViewById(R.id.title);
        title.setText(curentword.get_title());
        //TextView description=listitemview.findViewById(R.id.description);
        //description.setText(curentword.get_description());
        //TextView link=listitemview.findViewById(R.id.link);
        //link.setText(curentword.get_link());

        return listitemview;
    }
}
