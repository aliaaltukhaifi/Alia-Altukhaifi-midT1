package com.example.alia_altukhaifi_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Activity3 extends ListActivity {

    String[] items={"Item 1","Item 2","Item 3","Item 4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_3,R.id.txtViewList,items));



        Button bttn1=(Button)findViewById(R.id.goToOneFrom3);
        Button bttn2=(Button)findViewById(R.id.goToTwoFrom3);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                startActivity(new Intent(Activity3.this,MainActivity.class));
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity3.this,Activity2.class));
            }
        });







    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        switch(position){

            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://alfaisal.edu")));
                break;
            case 1:
                startActivity(new Intent(Activity3.this,ShowBig.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com")));
                break;


        }
    }
}