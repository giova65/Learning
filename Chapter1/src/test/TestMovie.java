package test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Movie;

public class TestMovie {
	
	private Movie movie;
	@Before
	public void init(){
		this.movie = new Movie("Pulp fiction", Movie.REGULAR);
	}
	@Test
	public void testGetName(){
		assertThat(movie.getTitle(), is("Pulp fiction"));
	}
	
	@Test
	public void testSetGetPriceCode(){
		this.movie.setPriceCode(Movie.CHILDRENS);
		assertThat(this.movie.getPriceCode(), is(Movie.CHILDRENS));
	}
}
