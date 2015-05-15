package com.example.adapter;

import java.util.ArrayList;

import com.example.resterant_client.Material;
import com.example.resterant_client.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AllListMenuAdapter extends BaseAdapter {
	ArrayList<Material> listFood;
	LayoutInflater infalInflater;

	public AllListMenuAdapter(ArrayList<Material> listFood , LayoutInflater infalInflater) {
		this.listFood = listFood;
		this.infalInflater = infalInflater;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listFood.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listFood.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		convertView = infalInflater.inflate(R.layout.listchild, parent,false);
		Material data = (Material) getItem(position);
		TextView name = (TextView) convertView.findViewById(R.id.foodname);
		name.setText(data.getName());
		return convertView;
	}

}
