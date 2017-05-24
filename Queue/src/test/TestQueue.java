package test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Queue;

public class TestQueue {

	private Queue queue;
	
	@Before
	public void init(){
		queue = new Queue();
	}

	@Test
	public void testEnque(){
		queue.enque("terzo");
		assertThat(queue._queue.size(), is(1));
	}
	
	@Test
	public void testDeque() {
		queue.enque("primo");
		queue.enque("secondo");
		queue.deque();
		assertThat((String)queue._queue.get(0), is("primo"));
	}
	
	@Test
	public void testPeek() {
		queue.enque("primo");
		assertThat((String)queue.peek(), is("primo"));
	}
	
	@Test
	public void testIsEmpty() {
		assertThat(queue._queue.size(), is(0));
	}
}
