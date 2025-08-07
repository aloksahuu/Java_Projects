package com.aurionpro.FoodOrderingConcoleApp.model;

public class DeliveryPartner {
	private int id;
	private String name;
	private String contact;

	public DeliveryPartner(int id, String name, String contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getContact() {
		return contact;
	}

	@Override
	public String toString() {
		return "DeliveryPartner{" + "id=" + id + ", name='" + name + '\'' + ", contact='" + contact + '\'' + '}';
	}
}
