package com.example.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import com.example.resterant_client.MainName;
import com.example.resterant_client.Material;
import com.example.resterant_client.R;
import com.example.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectedMenuAdapter extends BaseExpandableListAdapter {
	HashMap<String, ArrayList<Material>> subMenu;
	LayoutInflater infalInflater;
	int[] idIcon;
	MainName menuTopics;
	public SelectedMenuAdapter(MainName menuTopics,HashMap<String, ArrayList<Material>> subMenu, LayoutInflater infalInflater){
		this.subMenu = subMenu;
		this.infalInflater = infalInflater;
		this.menuTopics = menuTopics;
		idIcon = new int[]{R.drawable.ic_launcher};
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getChildId(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	public Material selectSubMenu(int childPosition){
		
		return subMenu.get(menuTopics.getName()).get(childPosition);
	}

	@Override
	public View getChildView(int groupPosition, int childPosition, boolean arg2, View convertView,
			ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = infalInflater.inflate(R.layout.listchild, parent,false);
		EditText subMenu = (EditText) convertView.findViewById(R.id.subMenu);
		subMenu.setFocusable(false);
		Material material = selectSubMenu(childPosition);
		subMenu.setText(material.getName());
		return convertView;
	}

	@Override
	public int getChildrenCount(int arg0) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Object getGroup(int position) {
		// TODO Auto-generated method stub
		return subMenu.get(position);
	}

	@Override
	public int getGroupCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public long getGroupId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getGroupView(int position, boolean arg1, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = infalInflater.inflate(R.layout.listgroup,parent,false);
		//MainName topics = (MainName) getGroup(position);
		ImageView ic_food = (ImageView) convertView.findViewById(R.id.icon_food);
		ic_food.setImageResource(idIcon[menuTopics.getIcon()]);
		TextView name = (TextView) convertView.findViewById(R.id.foodname);
		name.setText(menuTopics.getName());
		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

}
