package com.base.slide.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.widget.ListView;

import com.base.androidbaseutillib.R;

public class SlideDrawView {
	
	public ArrayList<Map<Integer, String>>  data = new ArrayList<Map<Integer,String>>();
	
	public void setData(ArrayList<Map<Integer, String>>  data){
		this.data = data ;
	}
	
	public ArrayList<Map<Integer, String>> getData(){
		return data ;
	}
	
	public SlidingMenu initSlidingMenu(Activity activity) {
		SlidingMenu slidingMenu = new SlidingMenu(activity);
		try {
			slidingMenu.setMode(SlidingMenu.LEFT);// 设置左右滑菜单
//			slidingMenu.setTouchModeAbove(SlidingMenu.SLIDING_WINDOW);
			slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
			// 设置要使菜单滑动，触碰屏幕的范围
			// slidingMenu.setTouchModeBehind(SlidingMenu.RIGHT);
			slidingMenu.setShadowWidthRes(R.dimen.shadow_width);// 设置阴影图片的宽度
			// slidingMenu.setShadowDrawable(R.drawable.shadow);//设置阴影图片
			slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);// SlidingMenu划出时主页面显示的剩余宽度
			slidingMenu.setFadeDegree(0.35F);// SlidingMenu滑动时的渐变程度
			slidingMenu.attachToActivity(activity, SlidingMenu.RIGHT);// 使SlidingMenu附加在Activity右边
			slidingMenu.setBehindWidthRes(R.dimen.left_drawer_avatar_size);// 设置SlidingMenu菜单的宽度
			slidingMenu.setMenu(R.layout.slide_menu);// 设置menu的布局文件
			
			ListView slideListView = (ListView) slidingMenu.findViewById(R.id.slideListView);
			
			ArrayList<Map<Integer, String>> data = new ArrayList<Map<Integer,String>>();
			String[] slide_list = activity.getResources().getStringArray(R.array.slide_list);
			
			for (int i = 0; i < slide_list.length; i++) {
				Map<Integer, String> map = new HashMap<Integer, String>();
				map.put(i, slide_list[i]);
				data.add(map);
			}
			this.setData(data);
			SlideMenuAdapter slideMenuAdapter = new SlideMenuAdapter(data,activity);
			
			slideListView.setAdapter(slideMenuAdapter);
			
			slideMenuAdapter.notifyDataSetChanged();
			
		} catch (Exception e) {
			
		}
		return slidingMenu;
	}
}
