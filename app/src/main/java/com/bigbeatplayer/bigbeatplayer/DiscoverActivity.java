package com.bigbeatplayer.bigbeatplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class DiscoverActivity extends AppCompatActivity implements DiscoverMusicAdapter.OnClickDiscoverHandler {

    private ArrayList<Integer> discoverData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        createDiscoverData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.discover_music_grid);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        DiscoverMusicAdapter adapter = new DiscoverMusicAdapter(this);
        adapter.setData(discoverData);
        recyclerView.setAdapter(adapter);


        Button myMusic = (Button) findViewById(R.id.discover_my_music_button);
        myMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiscoverActivity.this, MyMusicActivity.class);
                startActivity(intent);
            }
        });

        Button searchButton = (Button) findViewById(R.id.discover_search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiscoverActivity.this, SearchActivity.class);
                startActivity(intent);
            }
        });

        Button nowPlaying = (Button) findViewById(R.id.discover_now_playing_button);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiscoverActivity.this, MusicPlayerActivity.class);
                startActivity(intent);

            }
        });
    }

    private void createDiscoverData() {
        discoverData.add(R.drawable.cover1);
        discoverData.add(R.drawable.cover2);
        discoverData.add(R.drawable.cover3);
        discoverData.add(R.drawable.cover4);
        discoverData.add(R.drawable.cover5);
        discoverData.add(R.drawable.cover6);
        discoverData.add(R.drawable.cover7);
    }

    @Override
    public void discoverOnClick() {
        Intent intent = new Intent(this, MusicPlayerActivity.class);
        startActivity(intent);
    }
}
