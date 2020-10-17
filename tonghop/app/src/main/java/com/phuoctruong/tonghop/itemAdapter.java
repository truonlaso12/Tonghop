package com.phuoctruong.tonghop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class itemAdapter extends BaseAdapter {
    Context myContext;
    List<com.phuoctruong.tonghop.item> arrayItem;
    int layout;

    public itemAdapter(Context myContext, List<com.phuoctruong.tonghop.item> arrayItem, int layout) {
        this.myContext = myContext;
        this.arrayItem = arrayItem;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return arrayItem.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayItem.get(i) ;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        //ánh xạ và gán giá trị

        TextView txt = (TextView) view.findViewById(R.id.textView2);
        txt.setText(arrayItem.get(i).theLoai);

        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(arrayItem.get(i).image);

        return view;
    }
}
