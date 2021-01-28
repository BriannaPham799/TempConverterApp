package com.example.temparatureconverter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class tempUnitAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] tempUnits;

    public tempUnitAdapter(Context c, String[] temp){
        tempUnits = temp;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return tempUnits.length;
    }

    @Override
    public Object getItem(int position) {
        return tempUnits[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.list_view_detail, null);
        TextView tempTextView = (TextView) v.findViewById(R.id.tempName);
        String name = tempUnits[position];

        tempTextView.setText(name);
        return v;
    }
}
