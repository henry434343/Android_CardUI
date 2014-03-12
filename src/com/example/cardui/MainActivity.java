package com.example.cardui;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	
	RelativeLayout layout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ListView listView = (ListView)findViewById(R.id.list);		
		cardadapter adapter = new cardadapter(this, R.layout.list_item, new String[]{"123","456","123","456","123","456","123","456","123","456","123","456","123","456","123","456"});
		listView.setAdapter(adapter);
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
