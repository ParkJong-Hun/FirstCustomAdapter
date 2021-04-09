package pjh.mjc.ex11_01;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
    Context context;
    String[] title;
    public MyListAdapter(Context context, String text1[]) {
        this.context = context; title = text1;
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_adapter, parent, false);

        TextView text1, text2;
        text1 = (TextView) convertView.findViewById(R.id.tv1);
        text2 = (TextView) convertView.findViewById(R.id.tv2);
        text1.setText(title[position]);
        text2.setText(title[position] + "의 내용");
        return convertView;
    }
}
