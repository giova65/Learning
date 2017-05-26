package test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import main.MonitorableQueue;

public class TestMonitorableQueue {

	@Test
	public void test() {
		MonitorableQueue _queue = new MonitorableQueue();
		_queue.enque("first");
		_queue.enque("second");
		_queue.enque("third");
		_queue.deque();
		assertThat(_queue._maxSize, is(3));
	}
}
