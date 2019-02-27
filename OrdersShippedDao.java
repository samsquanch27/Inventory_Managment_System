package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OrdersShippedDao {
	private Connection connection;
	private final String GET_ORDERS_QUERY = "select * from orders";
	private final String DELETE_PURCHASE_QUERY = "DELETE from IncomingPurchases WHERE id = ?";
	
	public OrdersShippedDao() {
		connection = DBConnection.getConnection();
		
	}
	public static List<OrdersShippedDao> getOrders() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_ORDERS_QUERY).executeQuery();
		List<OrdersShippedDao> orders = new ArrayList<OrdersShippedDao>();
		
		while(rs.next()) {
			orders.add(populateOrders(rs.getInt(1), rs.getString(2)));
		}
		return orders;
	}
	
	private OrdersShippedDao populateOrders(int id, String name) throws SQLException {
		
		return new OrdersShippedDao();
	}
	
	public void deletePurchase(int id) {
		PreparedStatement ps = connection.prepareStatement(DELETE_PURCHASE_QUERY);
		ps.setInt(2, id);
		ps.executeUpdate();
	}
		
	}
	

