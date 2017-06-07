package com.bigbeatplayer.bigbeatplayer;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
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

        ListView listView = (ListView) findViewById(R.id.playlist_list);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PlaylistActivity.this, MusicPlayerActivity.class);
                startActivity(intent);
            }
        });

        Button discoverButton = (Button) findViewById(R.id.playlist_discover_button);
        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, DiscoverActivity.class);
                startActivity(intent);
            }
        });

        Button searchButton = (Button) findViewById(R.id.playlist_search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.playlist_now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PlaylistActivity.this, MusicPlayerActivity.class);
                startActivity(intent);

            }
        });

    }
}
