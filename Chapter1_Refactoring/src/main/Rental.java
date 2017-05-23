package main;

public class Rental {
	
	private final Movie _movie;
	private final int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public Movie getMovie(){
		return _movie;
	}
	
	public int getDaysRented(){
		return _daysRented;		
	}
	
	//this method originally was in Customer is not his responsibility, Extract Method
	public double getCharge() {
		double result = 0;
		//determine amounts for each line
		switch(getMovie().getPriceCode()){
			case Movie.REGULAR:
				result += 2;
				if(getDaysRented() > 2){
					result += (getDaysRented() - 2) * 1.5;
				}
			break;
			case Movie.NEW_RELEASE:
				result+= getDaysRented() * 3;
			break;
			case Movie.CHILDRENS:
				result += 1.5;
				if(getDaysRented() > 3){
					result += (getDaysRented() - 3) * 1.5;
				} 
			break;	
		}
		return result;
	}
	
	public int getFrequentRenterPoints(){
		if(getDaysRented() > 1 && getMovie().getPriceCode() == Movie.NEW_RELEASE){
			return 2;
		}else{
			return 1;
		}
	}
}
