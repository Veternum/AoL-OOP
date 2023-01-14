package application;

import java.util.ArrayList;

public class User {
	static public ArrayList<Wallet> wallets = new ArrayList<>();
	
	static public void addWallet(Wallet wallet) {
		wallets.add(wallet);
	}
}
