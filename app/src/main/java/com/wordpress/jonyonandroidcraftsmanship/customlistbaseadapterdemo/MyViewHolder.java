package com.wordpress.jonyonandroidcraftsmanship.customlistbaseadapterdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder {
    private ImageView ivImage=null;
    private TextView tvTitle=null;
    private TextView tvDescription=null;

    public MyViewHolder(View view) {
        ivImage= (ImageView) view.findViewById(R.id.ivImage);
        tvTitle= (TextView) view.findViewById(R.id.tvTitle);
        tvDescription= (TextView) view.findViewById(R.id.tvDescription);
    }

    public ImageView getIvImage() {
        return ivImage;
    }

    public TextView getTvTitle() {
        return tvTitle;
    }

    public TextView getTvDescription() {
        return tvDescription;
    }
}
