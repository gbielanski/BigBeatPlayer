package com.bigbeatplayer.bigbeatplayer;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

class DiscoverMusicAdapter extends RecyclerView.Adapter<DiscoverMusicAdapter.DiscoverMusicViewHolder> {

    private final OnClickDiscoverHandler mClickHandler;

    DiscoverMusicAdapter(OnClickDiscoverHandler mClickHandler) {
        this.mClickHandler = mClickHandler;
    }

    public interface OnClickDiscoverHandler {
        void discoverOnClick();
    }

    private ArrayList<Integer> discoverData = new ArrayList<>();

    public void setData(ArrayList<Integer> discoverData) {
        this.discoverData = discoverData;
    }

    @Override
    public DiscoverMusicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context ctx = parent.getContext();
        int posterGridItemId = R.layout.discover_grid_item;
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View view = inflater.inflate(posterGridItemId, parent, false);
        return new DiscoverMusicViewHolder(view);
    }


    @Override
    public void onBindViewHolder(DiscoverMusicViewHolder holder, int position) {
        holder.imageView.setImageResource(discoverData.get(position));
    }

    @Override
    public int getItemCount() {
        return discoverData.size();
    }

    public class DiscoverMusicViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;

        public DiscoverMusicViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img_discover_item);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mClickHandler.discoverOnClick();
        }

    }
}
