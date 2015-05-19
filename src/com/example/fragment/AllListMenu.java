package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.AllListMenuAdapter;
import com.example.resterant_client.DataCenter;
import com.example.resterant_client.MainActivity;
import com.example.resterant_client.MainName;
import com.example.resterant_client.Material;
import com.example.resterant_client.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class AllListMenu extends Fragment {
	private MainActivity main;
	public AllListMenu(MainActivity main){
		this.main=main;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View convertView = inflater.inflate(R.layout.listmenu, container,false);
		ListView listMenu = (ListView) convertView.findViewById(R.id.listView1);
		ArrayList<MainName> listFoodName = DataCenter.getObj().getFoodName();
		AllListMenuAdapter adapter = new AllListMenuAdapter(listFoodName, inflater);
		listMenu.setAdapter(adapter);
		listMenu.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,
					long id) {
				// TODO Auto-generated method stub
				
				//Query DB 
				DataCenter.getObj().setMenuTopics(DataCenter.getObj().getFoodName().get(position));
				main.displayView(0);
				
			}
		});
		return convertView ;
	}

}
