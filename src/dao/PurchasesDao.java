package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dao.DBConnection;

public class PurchasesDao {

		private Connection connection;
		
		private final String CREATE_NEW_PURCHASE_QUERY = "insert into purchases(name) value(?)";
		private final String DELETE_PURCHASE_QUERY ="DELETE from IncomingPurchases WHERE id = ?";
		
		public PurchasesDao() {
			connection = DBConnection.getConnection();
		}
		public void createNewPurchase (String purchaseName) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(CREATE_NEW_PURCHASE_QUERY);
			ps.setString(1, purchaseName);
			ps.executeUpdate();
		}
		
		public void deletePurchaseByPurchaseId(int PurchaseId) throws SQLException {
			PreparedStatement ps = connection.prepareStatement(DELETE_PURCHASE_QUERY);
			ps.setInt(2, PurchaseId);
			ps.executeUpdate();
		}
}
