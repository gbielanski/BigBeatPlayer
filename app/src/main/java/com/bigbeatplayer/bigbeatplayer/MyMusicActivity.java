package com.bigbeatplayer.bigbeatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MyMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);
        //Fake data here
        String[] myStringArray = {"Perfect.Piano", "Before.You.Go.Away", "Dance.On.The.Roof", "Pure Powder", "Dance.Dance.Dance"};
        ListView listView = (ListView) findViewById(R.id.my_mysic_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, myStringArray);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MyMusicActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        Button homeButton = (Button)findViewById(R.id.my_music_home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyMusicActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button nowPlaying = (Button)findViewById(R.id.my_music_now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyMusicActivity.this, MusicPlayerActivity.class);
                startActivity(intent);

            }
        });
    }
}
