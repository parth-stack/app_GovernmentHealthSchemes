package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button facilities,schemes_details;
    Intent i;
    String lang[]={"ENGLISH","HINDI"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facilities=findViewById(R.id.facilities);
        schemes_details=findViewById(R.id.schemes);
        spinner=findViewById(R.id.lang_spinner);

        final ArrayAdapter langAdapter=new ArrayAdapter(this,R.layout.spinner_item, Arrays.asList(lang));
        spinner.setAdapter(langAdapter);
        spinner.setSelection(0,false);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                Toast.makeText(getApplicationContext(),Arrays.asList(lang).get(position).toString(),Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(getApplicationContext(),"NOTHING SELECTED",Toast.LENGTH_SHORT).show();
            }
        });

        schemes_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(getApplicationContext(), schemes_details.class);
                startActivity(i);
            }
        });
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=new Intent(getApplicationContext(), facilities.class);
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        //menu(GroupId,ItemId,Order,Title);

        menu.add(1, 1, 1, "GRIEVEANCE");
        menu.add(1, 2, 2, "ABOUT US");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case 1:
                i=new Intent(getApplicationContext(),grieveance.class);
                startActivity(i);
                break;
            case 2:
                i=new Intent(getApplicationContext(),about.class);
                startActivity(i);
                break;
        }
        return true;
    }

}
