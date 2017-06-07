package com.bigbeatplayer.bigbeatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        //Fake data here
        String[] myArray = {
                "Praise You by Fatboy Slim",
                "Star 69by Fatboy Slim",
                "The Test by The Chemical Brothers",
                "Wonders Of The Deep by The Chemical Brothers",
                "What A Difference Your Love Makes by Basement Jaxx",
                "Oh My Gosh by Basement Jaxx",
                "Hey Boy Hey Girl by The Chemical Brothers",
                "Push The Tempo by Fatboy Slim",
                "Elektrobank by The Chemical Brothers"
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, myArray);

        ListView listView = (ListView) findViewById(R.id.search_list);
        listView.setAdapter(arrayAdapter);


        Button discoverButton = (Button) findViewById(R.id.search_discover_button);
        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, DiscoverActivity.class);
                startActivity(intent);
            }
        });

        Button myMusic = (Button) findViewById(R.id.search_my_music_button);
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MyMusicActivity.class);
                startActivity(intent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.search_now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MusicPlayerActivity.class);
                startActivity(intent);

            }
        });
    }
}
