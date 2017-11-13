package com.huxq17.moveongridview;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class GridViewAdapter extends BaseAdapter {
    private Context context;
    private List<String> mDatas;

    public GridViewAdapter(Context context, List<String> dataList) {
        this.context = context;
        this.mDatas = dataList;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public String getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(context);
            convertView = textView;
            textView.setPadding(20, 100, 20, 100);
            textView.setBackgroundColor(0x33ff00ff);
            textView.setGravity(Gravity.CENTER);
        } else {
            textView = (TextView) convertView;
        }
        textView.setText(getItem(position));
        return convertView;
    }
}