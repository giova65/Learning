package test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Movie;

public class TestMovie {
	
	private Movie _movie;
	@Before
	public void init(){
		this._movie = new Movie("Pulp fiction", Movie.REGULAR);
	}
	@Test
	public void testGetName(){
		assertThat(_movie.getTitle(), is("Pulp fiction"));
	}
	
	@Test
	public void testSetGetPriceCode(){
		this._movie.setPriceCode(Movie.CHILDRENS);
		assertThat(this._movie.getPriceCode(), is(Movie.CHILDRENS));
	}
}
