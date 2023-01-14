package application;

import java.util.ArrayList;

public class Wallet {
	protected String walletName;
	protected double walletTotal;
	protected ArrayList<Transaction> transactions = new ArrayList<>();

	public Wallet(String walletName) {
		super();
		this.walletName = walletName;
	}

	public String getWalletName() {
		return walletName;
	}

	public void setWalletName(String walletName) {
		this.walletName = walletName;
	}

	public double getWalletTotal() {
		return walletTotal;
	}

	public void setWalletTotal(double walletTotal) {
		this.walletTotal = walletTotal;
	}

	public ArrayList<Transaction> getTransaction() {
		return transactions;
	}

	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transactions = transaction;
	}

}
