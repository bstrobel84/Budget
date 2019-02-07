package com.example.budget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] bills;
    String[] desc;
    String ENTERBILL;


public ItemAdapter(Context c,String[] i, String[] s){
    bills = i;
    desc = s;
    mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

}
    @Override
    public int getCount() {
        return bills.length;
    }

    @Override
    public Object getItem(int position) {
        return bills[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.bills, null);
        TextView bill = (TextView) v.findViewById(R.id.billName);
        TextView descTextView = (TextView) v.findViewById(R.id.desc);
        String billString = bills[position];
        String descString = desc[position];
        bill.setText(billString);
        descTextView.setText(descString);
        return v;
    }
}
