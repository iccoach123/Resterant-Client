package com.example.fragment;


import java.util.ArrayList;
import java.util.HashMap;

import com.example.adapter.SelectedMenuAdapter;
import com.example.resterant_client.DataCenter;
import com.example.resterant_client.MainActivity;
import com.example.resterant_client.MainName;
import com.example.resterant_client.Material;
import com.example.resterant_client.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

public class SelectedMenu extends Fragment {
	MainActivity main;
	HashMap<String, ArrayList<Material>> subMenu;
	
	
	public SelectedMenu(MainActivity main){
		this.main=main;
		subMenu = new HashMap<String, ArrayList<Material>>();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		createData();
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View convertView = inflater.inflate(R.layout.selected_menu , container, false);
		ExpandableListView listSubMenu = (ExpandableListView) convertView.findViewById(R.id.listSubMenu);
		SelectedMenuAdapter adapter = new SelectedMenuAdapter(DataCenter.getObj().getMenuTopics(),subMenu, inflater);
		listSubMenu.setAdapter(adapter);
		return convertView;
	}
	
	private void createData(){
		subMenu.put(DataCenter.getObj().getMenuTopics().getName(), DataCenter.getObj().getSubMenu());
	}

}
