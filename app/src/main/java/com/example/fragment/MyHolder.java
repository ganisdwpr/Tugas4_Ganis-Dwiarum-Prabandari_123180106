package com.example.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    ImageView imageView;
    TextView highlighterTV, detailTV;
    ItemClickListener itemClickListener;

    MyHolder(@NonNull View itemView) {
        super(itemView);

        this.imageView = itemView.findViewById(R.id.highlighterImg);
        this.highlighterTV = itemView.findViewById(R.id.HighlighterTitle);
        this.detailTV = itemView.findViewById(R.id.detailHighlighter);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClickListener(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
