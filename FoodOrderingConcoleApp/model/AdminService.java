package com.aurionpro.FoodOrderingConcoleApp.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminService {

	public static void viewMenu() {
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM menu_items")) {

			System.out.println("\n===== MENU ITEMS =====");
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				System.out.println(id + ". " + name + " - ₹" + price);
			}

		} catch (Exception e) {
			System.out.println("Error fetching menu: " + e.getMessage());
		}
	}

	public static void viewCustomers() {
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM customers")) {

			System.out.println("\n===== REGISTERED CUSTOMERS =====");
			while (rs.next()) {
			    System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " + rs.getString("mobile"));
			}


		} catch (Exception e) {
			System.out.println("Error fetching customers: " + e.getMessage());
		}
	}

	public static void viewDeliveryPartners() {
		try (Connection conn = DBUtil.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM delivery_partners")) {

			System.out.println("\n===== DELIVERY PARTNERS =====");
			while (rs.next()) {
				System.out.println(rs.getInt("id") + ". " + rs.getString("name") + " - " + rs.getString("contact"));
			}

		} catch (Exception e) {
			System.out.println("Error fetching delivery partners: " + e.getMessage());
		}
	}
}
