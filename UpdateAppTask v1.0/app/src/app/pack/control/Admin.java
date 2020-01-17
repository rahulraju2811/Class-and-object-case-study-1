package app.pack.control;

import java.util.List;
import java.util.Scanner;

import app.pack.dao.DAO;
import app.pack.model.Product;
import app.pack.model.User;

public class Admin {

	Scanner scan = new Scanner(System.in);
	
	String username,password;
	
	public void checkLogin() {
		System.out.println("Username :");
		username = scan.next();
		System.out.println("Password :");
		password = scan.next();
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		int status = DAO.checkLogin(u);
		if(status != 0) {
			System.out.println("Login Successfull");
			System.out.println("-------------------------------------");
			Admin a = new Admin();
			a.getAdminMenu();
		}
	}
	
	public void getAdminMenu() {
		System.out.println("Admin Menu \n1. Add Product \n2. Display Inventory \n3. Logout");
		System.out.println();
		System.out.println("Select your option : ");
		int option = scan.nextInt();
		switch(option) {
		case 1:
			Admin a = new Admin();
			a.addProduct();
			break;
		case 2:
			Admin a1 = new Admin();
			a1.displayProduct();
			break;
		case 3:
			Admin a2 = new Admin();
			a2.logoutAdmin();
			break;
		}
	}
	
	public void displayProduct() {
		List<Product> list = DAO.getAllProduct();
		System.out.println();
		System.out.println("    Product Detils    ");
		System.out.println("+++++++++++++++++++++++++");
		for(Product p : list) {
			System.out.println("Product Id   		 : "+p.getId());
			System.out.println("Product Name 		 : "+p.getName());
			System.out.println("Product Min Quantity	 : "+p.getMinQua());
			System.out.println("Product Price		 : "+p.getPrice());
			System.out.println("---------------------------------------");
		}
		Admin a = new Admin();
		a.getAdminMenu();
	}

	public void logoutAdmin() {
		System.out.println("Logout Successfully");
		System.out.println("---------------------------------------");
	}
	
	public void addProduct() {
		int id;
		String name;
		int minQua;
		int price;
		Product product = new Product();
		System.out.println("Product ID : ");
		id = scan.nextInt();
		product.setId(id);
		System.out.println("Product Name :");
		name = scan.next();
		product.setName(name);
		System.out.println("Product Minimum Sell Quantity :");
		minQua = scan.nextInt();
		product.setMinQua(minQua);
		System.out.println("Product Price :");
		price = scan.nextInt();
		product.setPrice(price);
		int status = DAO.saveProduct(product);
		if(status != 0 )
			System.out.println("Inserted \n ------------------------------------------");
		else
			System.out.println("Not - Inserted");
		Admin a = new Admin();
		a.getAdminMenu();
	}
}
