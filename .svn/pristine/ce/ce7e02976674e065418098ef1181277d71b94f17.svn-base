package com.base.supertoasts.util;

import android.content.Context;
import android.view.Gravity;

import com.base.supertoasts.SuperToast;

public class AppToast {
	
	public final static int TOAST_TIME = 2000 ;
	
	public static SuperToast toastMsg(Context context,String msg,int duration){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 100);
		
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(duration);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsg(Context context,int string_id,int duration){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(context.getResources().getString(string_id));
		superToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 100);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(duration);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgCenter(Context context,String msg,int duration){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.CENTER, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(duration);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgCenter(Context context,int string_id,int duration){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(context.getResources().getString(string_id));
		superToast.setGravity(Gravity.CENTER, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(duration);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgTopCenter(Context context,String msg,int duration){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.CENTER|Gravity.TOP, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(duration);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	/******************************************* 默认时间提示 **********************************************/
	public static SuperToast toastMsg(Context context,String msg){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 100);
		
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(TOAST_TIME);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsg(Context context,int string_id){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(context.getResources().getString(string_id));
		superToast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 100);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(TOAST_TIME);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgCenter(Context context,String msg){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.CENTER, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(TOAST_TIME);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgCenter(Context context,int string_id){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(context.getResources().getString(string_id));
		superToast.setGravity(Gravity.CENTER, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(TOAST_TIME);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
	public static SuperToast toastMsgTopCenter(Context context,String msg){
		SuperToast superToast = new SuperToast(context);
		superToast.setText(msg);
		superToast.setGravity(Gravity.CENTER|Gravity.TOP, 0, 0);
		superToast.setAnimations(SuperToast.Animations.FADE);
		superToast.setDuration(TOAST_TIME);
		superToast.setBackground(SuperToast.Background.BLACK);
		return superToast;
	}
	
}
