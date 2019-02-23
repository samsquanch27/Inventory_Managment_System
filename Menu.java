package application;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.x.protobuf.MysqlxExpr.Array;

import dao.InventoryDao;
import dao.OrdersShippedDao;
import dao.PurchasesDao;

public class Menu {
	private InventoryDao inventoryDao = new InventoryDao();
	private PurchasesDao purchasesDao = new PurchasesDao();
	private OrdersShippedDao ordersShippedDao = new OrdersShippedDao();
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Array.asList( "Create purchase", "Delete purchase", "Show shipment", "Display orders");
			
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			try {
			if(selection.equals("1")) {
					createPurchase();
			}else if(selection.equals("2")) {
					deletePurchase();
			}else if(selection.equals("3")) {
					showShipment();
			}else if(selection.equals("4")) {
					displayOrders();
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Press enter to continue...");
			scanner.nextLine();
		}while (!selection.equals("-1"));
	}
	private void printMenu() {
		System.out.println("Select an Option:\n................");
		for (int i = 0; i < options.size(); i ++) {
			System.out.println(i + 1 + ")" + options.get(i));
		}
	}
	private void createPurchase() throws SQLException {
		System.out.println("Enter nre purchase order:");
		String createPurchase = scanner.nextLine();
		purchasesDao.createNewPurchase(perchaseName);
	}
	private void displayOrders() throws SQLException {
		List<Order> orders = orderDao.getOrders();
		for (Order order : orders) {
			System.out.println(order.getOrderId() + ": " + order.getOrderName());
		}
	}
}
