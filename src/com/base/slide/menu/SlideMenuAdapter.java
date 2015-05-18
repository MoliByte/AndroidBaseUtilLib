package com.base.slide.menu;

import java.util.ArrayList;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.base.androidbaseutillib.R;

/**
 * @author zhup
 *
 */
public class SlideMenuAdapter extends BaseAdapter {
	@SuppressWarnings("unused")
	private Context context ;
	private ArrayList<Map<Integer, String>> data;
	private LayoutInflater layoutInflater;
	
	public interface SlideMenuItemClickListener{
		public void slideMenuItemClickListener(int position);
	}
	
	public SlideMenuAdapter(ArrayList<Map<Integer, String>> data,Context context){
		this.context = context ;
		this.data = data ;
		layoutInflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = layoutInflater.inflate(R.layout.slide_menu_item, null);
		TextView category_name = (TextView) convertView.findViewById(R.id.category_name);
		category_name.setText(data.get(position).get(position));
		return convertView;
	}
	
	

}
