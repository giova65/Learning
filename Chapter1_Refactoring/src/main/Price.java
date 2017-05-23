package main;

public abstract class Price {
	
	abstract int getPriceCode();

	//this method originally was in Customer is not his responsibility, Extract Method. 
	//After moved it into Rental now I place it here, next step refactor with inheritance
	abstract double getCharge(int daysRented);

	public int getFrequentRenterPoints(int daysRented) {
			return 1;
	}
}
