package com.example.admin.tutsall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class CustomListTest extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };

    String[] subtitle ={
            "Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
    };

    Integer[] imgid={
            R.drawable.image1,R.drawable.image2,
            R.drawable.image3,R.drawable.image4,
            R.drawable.image5,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_test);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=findViewById(R.id.list);
        list.setAdapter(adapter);
    }
}
