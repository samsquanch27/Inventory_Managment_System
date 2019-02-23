package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OrdersShippedDao {
	private Connection connection;
	private final String GET_ORDERS_QUERY = "select * from orders";
	
	public OrderDao() {
		connection = DBConnection.getConnection();
		
	}
	public List<Order> getOrders() throws SQLException{
		ResultSet rs = connection.prepareStatement(GET_ORDERS_QUERY).executeQuery();
		List<Order> orders = newArrayList<Order>();
		
		while(rs.next()) {
			orders.add(populateOrders(rs.getInt(1), rs.getString(2)));
		}return orders;
	}
	
}
