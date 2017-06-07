package com.bigbeatplayer.bigbeatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);
        Button discoverButton = (Button) findViewById(R.id.player_discover_button);
        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicPlayerActivity.this, DiscoverActivity.class);
                startActivity(intent);
            }
        });

        Button search = (Button) findViewById(R.id.player_search_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicPlayerActivity.this, SearchActivity.class);
                startActivity(intent);

            }
        });

        Button nowPlaying = (Button) findViewById(R.id.player_my_music_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MusicPlayerActivity.this, MyMusicActivity.class);
                startActivity(intent);

            }
        });

    }
}
