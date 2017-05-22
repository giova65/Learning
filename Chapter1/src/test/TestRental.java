package test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Movie;
import main.Rental;

public class TestRental {

	private Rental _rental;
	private Movie _movie;
	
	@Before
	public void init(){
		_movie = new Movie("Full metal jacket", Movie.REGULAR);
		_rental = new Rental(_movie, 3);
	}
	
	@Test
	public void testMovie(){
		assertThat(_rental.getMovie(), is(_movie));
	}
	
	@Test
	public void testDaysRented(){
		assertThat(_rental.getDaysRented(), is(3));
	}
}
