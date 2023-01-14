package application;

public class Wallet {
	protected String walletName;
	protected double walletTotal;
	protected Transaction transaction;

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

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
