package com.wordpress.jonyonandroidcraftsmanship.customlistbaseadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {

    private ArrayList<SingleRow> rows = null;
    private Context context;
    public CustomBaseAdapter(Context context) {
        this.context=context;
        rows = new ArrayList<SingleRow>();
        String[] titles = context.getResources().getStringArray(R.array.titles);
        String[] descriptions = context.getResources().getStringArray(R.array.descriptions);
        int[] images = new int[]{R.drawable.title1,
                R.drawable.title2,
                R.drawable.title3,
                R.drawable.title4,
                R.drawable.title5,
                R.drawable.title6,
                R.drawable.title7,
                R.drawable.title8,
                R.drawable.title9,
                R.drawable.title10,
                R.drawable.title11,
                R.drawable.title12,
                R.drawable.title13,
                R.drawable.title14,
                R.drawable.title15,
                R.drawable.title16,
                R.drawable.title17,
                R.drawable.title18,
                R.drawable.title19,
                R.drawable.title20};
        for (int i=0;i<20;i++) {
            rows.add(new SingleRow(images[i],titles[i],descriptions[i]));
        }
    }



    @Override
    public int getCount() {
        return rows.size();
    }

    @Override
    public Object getItem(int position) {
        return rows.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        MyViewHolder viewHolder=null;
        SingleRow singleRow=null;

        if (convertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.single_row, parent, false);
            viewHolder=new MyViewHolder(view);
            view.setTag(viewHolder);
            Logger.log(context.getString(R.string.msg_new_row));
        }else{
            viewHolder= (MyViewHolder) view.getTag();
            Logger.log(context.getString(R.string.msg_recycling));
        }

        singleRow=rows.get(position);
        viewHolder.getIvImage().setImageResource(singleRow.getImage());
        viewHolder.getTvTitle().setText(singleRow.getTitle());
        viewHolder.getTvDescription().setText(singleRow.getDescription());

        return view;
    }
}
