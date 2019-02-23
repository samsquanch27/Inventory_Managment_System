package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PurchasesDao {

		private Connection connection;
		
		private final String CREATE_NEW_PURCHASE_QUERY = "insert into purchases(name) value(?)";
		
		public PurchasesDao() {
			connection = DBConnection.getConnection();
		}
		public void createNewPurchase (String purchaseName) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_PURCHASE_QUERY);
			ps.setString(1, purchaseName);
			ps.executeUpdate();
		}
}
