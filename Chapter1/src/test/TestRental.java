package test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Movie;
import main.Rental;

public class TestRental {

	private Rental rental;
	private Movie movie;
	
	@Before
	public void init(){
		this.movie = new Movie("Full metal jacket", Movie.REGULAR);
		this.rental = new Rental(movie, 3);
	}
	
	@Test
	public void testMovie(){
		assertThat(this.rental.getMovie(), is(this.movie));
	}
	
	@Test
	public void testDaysRented(){
		assertThat(this.rental.getDaysRented(), is(3));
	}
}
