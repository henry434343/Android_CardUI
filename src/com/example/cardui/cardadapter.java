package com.example.cardui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class cardadapter extends ArrayAdapter<String>{

	private View v;
	private String[] arrayList; 
	private Context ctx;
	private int resourceID;
	
	public cardadapter(Context context, int resourceID, String[] arrayList) {
		super(context, resourceID);
		// TODO Auto-generated constructor stub
		this.arrayList = arrayList;		
		this.resourceID = resourceID;
		this.ctx = context;
	}
	
	private void findView(int position) { 
		// TODO Auto-generated method stub
		String item = arrayList[position];
		if (item != null) {
			//TextView 
			TextView sourceName = (TextView) v.findViewById(R.id.title);
			sourceName.setText(item);
		}
	}	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.arrayList.length;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		v = convertView;
		if (v == null) {
 		   LayoutInflater inflater = ((Activity)ctx).getLayoutInflater();
           v = inflater.inflate(resourceID, parent, false);
		}
		findView(position);
		return v;
	}
}
