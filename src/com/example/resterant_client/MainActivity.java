package com.example.resterant_client;

import com.example.fragment.AllListMenu;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements TabListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		String[] tabName = getResources().getStringArray(R.array.tab_name);

		for (int i = 0; i < tabName.length; i++) {
			ActionBar.Tab tab = actionBar.newTab().setText(tabName[i])
					.setTabListener(this);
					
			actionBar.addTab(tab);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

		Fragment fragment = new MyFragment();
		Bundle args = new Bundle();

		switch (tab.getPosition()) {
		case 0:
			fragment = new AllListMenu();
			/*args.putString("color", "#2574a9");
			fragment.setArguments(args);*/
			break;
		case 1:
			args.putString("color", "#36d5b5");
			fragment.setArguments(args);
			break;
		case 2:
			args.putString("color", "#f9640f");
			fragment.setArguments(args);
			break;
		}

		ft.replace(android.R.id.content, fragment);
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	public static class MyFragment extends Fragment {

		private String color;

		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			Bundle args = getArguments();
			color = args.getString("color");
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			View view = inflater.inflate(R.layout.tab, container, false);

			LinearLayout linearLayout = (LinearLayout) view
					.findViewById(R.id.linear);
			linearLayout.setBackgroundColor(Color.parseColor(color));

			return view;
		}

	}
}
