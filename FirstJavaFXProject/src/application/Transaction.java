package application;

import java.sql.Timestamp;

public abstract class Transaction {
	protected double value;
	protected String category;
	protected Timestamp date;

	public Transaction(double value, String category, Timestamp date) {
		super();
		this.value = value;
		this.category = category;
		this.date = date;
	}
	
	public Transaction(double value, String category) {
		super();
		this.value = value;
		this.category = category;
		this.date = new Timestamp(System.currentTimeMillis());
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public abstract String toString();

}
