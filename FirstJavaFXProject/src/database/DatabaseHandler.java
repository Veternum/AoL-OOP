package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import application.*;

public class DatabaseHandler {
	
	String walletName, transactCategory;
	Double transactValue;
	Timestamp transactDate;
	boolean isExpense;
	
	public void insert() {
		// TODO Auto-generated method stub
		
		Connect con = Connect.getInstance();
		
		String query = String.format("INSERT INTO user VALUES ('%s', '%s', '%f', '%s', '%s', '%d')",
				walletName, "", transactValue, transactCategory, transactDate.toString(), isExpense?1:0);
		
		con.executeUpdate(query);
	}
	
	public void insert(String walletName, Double transactValue, String transactCategory, Timestamp transactDate, boolean isExpense) {
		Connect con = Connect.getInstance();
		
		String query = String.format(
				"INSERT INTO `user`(`walletName`, `transactId`, `transactValue`, `transactCategory`, `transactDate`, `isExpense`)"
				+ "VALUES ('%s', NULL, '%f', '%s', '%s', '%d')",
				walletName, transactValue, transactCategory, transactDate.toString(), isExpense?1:0);
	
		con.executeUpdate(query);
	}

//	public void update() {
//		// TODO Auto-generated method stub
//		
//	}

//	public void delete() {
//		// TODO Auto-generated method stub
//		
//	}

	public DatabaseHandler get() {
		// TODO Auto-generated method stub
		Connect con = Connect.getInstance();
		
		String query = "SELECT * FROM user";
		ResultSet rs = con.executeQuery(query);
		
		try {
			if (rs.next()) {
				walletName = rs.getString("walletName");
				transactCategory = rs.getString("transactCategory");
				transactValue = rs.getDouble("transactValue");
				transactDate = rs.getTimestamp("transactDate");
				isExpense = rs.getBoolean("isExpense");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void getAll() {
		Connect con = Connect.getInstance();
		
		String query = "SELECT * FROM user";
		ResultSet rs = con.executeQuery(query);
		
		try {
			while (rs.next()) {
				System.out.printf("%s %f %s %s\n",
						rs.getString("walletName"),
						rs.getDouble("transactValue"),
						rs.getString("transactCategory"),
						rs.getTimestamp("transactDate").toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void loadWalletName() {
		Connect con = Connect.getInstance();
		
		String query = "SELECT * FROM user";
		ResultSet rs = con.executeQuery(query);
		
		try {
			while (rs.next()) {
				String walletName = rs.getString("walletName");

				if (!User.walletNames.contains(walletName)) {
					User.addWalletName(walletName);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void loadWalletTransactions() {
//		Connect con = Connect.getInstance();
//		
//		for (String walletName: User.walletNames) {
//			
//			String query = "SELECT * FROM user WHERE walletName ='"+walletName+"'";
//			ResultSet rs = con.executeQuery(query);
//			
//			try {
//				while (rs.next()) {
//					
//				}
//				
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
//	}
	
	// getters setters
	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public String getTransactCat() {
		return transactCategory;
	}

	public void setTransactCat(String transactCat) {
		this.transactCategory = transactCat;
	}

	public Double getTransactValue() {
		return transactValue;
	}

	public void setTransactValue(Double transactValue) {
		this.transactValue = transactValue;
	}

	public Timestamp getTransactDate() {
		return transactDate;
	}

	public void setTransactDate(Timestamp transactDate) {
		this.transactDate = transactDate;
	}

	public boolean isExpense() {
		return isExpense;
	}

	public void setExpense(boolean isExpense) {
		this.isExpense = isExpense;
	}
}
