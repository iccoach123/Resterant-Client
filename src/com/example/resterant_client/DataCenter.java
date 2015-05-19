package com.example.resterant_client;

import java.io.Serializable;
import java.util.ArrayList;

public class DataCenter implements Serializable{
	static DataCenter obj;
	ArrayList<MainName> foodName;
	ArrayList<Material> subMenu;
	private MainName menuTopics;

	
	public MainName getMenuTopics() {
		return menuTopics;
	}

	public void setMenuTopics(MainName menuTopics) {
		this.menuTopics = menuTopics;
	}

	public ArrayList<Material> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(ArrayList<Material> menu) {
		this.subMenu = subMenu;
	}

	public DataCenter(){
		foodName = new ArrayList<MainName>();
		MainName food = new MainName();
		food.setIcon(0);
		food.setName("¢È“«º—¥");
		foodName.add(food);
		subMenu = new ArrayList<Material>();
		Material material = new Material();
		material.setName("¢È“«º—¥À¡Ÿ");
		material.setPrice(100);
		subMenu.add(material);
		material = new Material();
		material.setName("¢È“«º—¥ªŸ");
		material.setPrice(120);
		subMenu.add(material);
		material = new Material();
		material.setName("¢È“«º—¥°ÿÈß");
		material.setPrice(140);
		subMenu.add(material);
		
	}

	public static DataCenter getObj() {
		if (obj == null){
			obj = new DataCenter();
		}
		return obj;
	}
	public void setObj(DataCenter obj) {
		this.obj = obj;
	}

	public ArrayList<MainName> getFoodName() {
		return foodName;
	}

	public void setFoodName(ArrayList<MainName> foodName) {
		this.foodName = foodName;
	}

}
