package com.example.adapter;

import java.util.ArrayList;

import com.example.resterant_client.MainName;
import com.example.resterant_client.Material;
import com.example.resterant_client.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AllListMenuAdapter extends BaseAdapter {
	ArrayList<MainName> listFoodName;
	LayoutInflater infalInflater;

	public AllListMenuAdapter(ArrayList<MainName> listFoodName , LayoutInflater infalInflater) {
		this.listFoodName = listFoodName;
		this.infalInflater = infalInflater;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listFoodName.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listFoodName.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = infalInflater.inflate(R.layout.listgroup, parent,false);
		TextView name = (TextView) convertView.findViewById(R.id.foodname);
		name.setText(listFoodName.get(position).getName());
		return convertView;
	}

}
