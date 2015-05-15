package com.example.fragment;

import java.util.ArrayList;

import com.example.adapter.AllListMenuAdapter;
import com.example.resterant_client.Material;
import com.example.resterant_client.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class AllListMenu extends Fragment {

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
		ArrayList<Material> listFood = new  ArrayList<Material>();
		Material data = new Material();
		data.setName("ข้าวผัด");
		ArrayList<String> material = new ArrayList<String>();
		material.add("หมู");
		material.add("หมึก");
		material.add("กุ้ง");
		data.setMaterialFood(material);
		listFood.add(data);
		AllListMenuAdapter adapter = new AllListMenuAdapter(listFood, inflater);
		listMenu.setAdapter(adapter);
		return convertView ;
	}

}
