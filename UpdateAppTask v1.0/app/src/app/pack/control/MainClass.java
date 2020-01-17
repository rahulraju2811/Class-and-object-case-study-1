package app.pack.control;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Admin Login \n2. Agent Login \n3. Exit");
		System.out.println();
		System.out.println("Select your option : ");
		int option = scan.nextInt();
		switch(option) {
		case 1:
			Admin admin = new Admin();
			admin.checkLogin();
			break;
		case 2:
			Agent agent = new Agent();
			agent.checkAgentLogin();
			break;
		case 3:
			new MainClass().exit();
			break;
		}
	}
	
	public void exit() {
		System.out.println("Application Exit");
		System.out.println("-----------------------------");
	}

}
