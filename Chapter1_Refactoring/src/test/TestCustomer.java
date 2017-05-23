package test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Customer;
import main.Movie;
import main.Rental;

public class TestCustomer {
	
	private Customer _customer;
	private Rental _rental;
	private Movie _movie;
	
	@Before
	public void init(){
		_customer = new Customer("Giovanni");
		_movie = new Movie("Le iene", Movie.NEW_RELEASE);
		_rental = new Rental(_movie, 2);
	}
	
	@Test
	public void testAddRental(){
		
		_customer.addRental(_rental);
		
		assertThat(_customer.getRentals().get(0), is(_rental)); 
	}
	
	@Test
	public void testStatement(){
		_customer.addRental(_rental);
		_customer.addRental(_rental);
		_customer.addRental(_rental);
		
		assertThat(_customer.statement(), is("Rental Record for Giovanni\n"
				+ "\tLe iene\t6.0\n"
				+ "\tLe iene\t6.0\n"
				+ "\tLe iene\t6.0\n" 
				+ "Amount owned is 18.0" + "\n" +
				"You earned 6 frequent renter points" ));
	}
	
	@Test
	public void testHtmlStatement(){
		_customer.addRental(_rental);
		_customer.addRental(_rental);
		_customer.addRental(_rental);
		
		assertThat(_customer.htmlStatement(), is("<H1>Rentals for <EM>Giovanni</EM></H1><P>\n"
				+ "Le iene: 6.0<BR>\n"
				+ "Le iene: 6.0<BR>\n"
				+ "Le iene: 6.0<BR>\n"
				+ "<P>You owe <EM>18.0</EM><P>\n"
				+ "On this rental you earned <EM>6</EM> frequent renter points<P>"));
	}
}
