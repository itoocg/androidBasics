package com.example.admin.tutsall;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MediaPlayerList extends AppCompatActivity {

    ListView mainList;
    static MediaPlayer mp;
    int running = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player_list);

        final String [] listContent = {"Moh Moh", "Iktara"};

        final int[] resID = {R.raw.song, R.raw.song2};

        mainList = findViewById(R.id.list_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, listContent);

        mainList.setAdapter(adapter);

        mainList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (running==0){
                    mp = MediaPlayer.create(getApplicationContext(), resID[position]);
                    mp.start();
                    running++;
                }else {
                    mp.reset();
                    mp = MediaPlayer.create(getApplicationContext(), resID[position]);
                    mp.start();
                }

            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mp.release();
    }
}
