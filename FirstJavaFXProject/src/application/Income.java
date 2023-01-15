package application;

import java.sql.Timestamp;

public class Income extends Transaction {

	public Income(double value, String category, Timestamp date) {
		super(value, category, date);
		// TODO Auto-generated constructor stub
	}
	
	public Income(double value, String category) {
		super(value, category);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "(+) IDR"+value+" | "+category+" | "+date.toString();
//		String str = String.format("(+) IDR%-15d  %s\n%s", value, category, date.toString());
		
		return str;
	}

}
