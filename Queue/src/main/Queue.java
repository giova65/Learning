package main;

import java.util.LinkedList;
import java.util.List;

public class Queue implements QueueMethods {

	public final List<Object> _queue;
	
	public Queue() {
		_queue = new LinkedList<Object>();
	}
	
	@Override
	public void enque(Object item) {
		_queue.add(item);
	}

	@Override
	public void deque() {
		_queue.remove(_queue.size()-1);
	}

	@Override
	public Object peek() {
		return _queue.get(0);
	}

	@Override
	public boolean isEmpty() {
		return _queue.isEmpty();
	}

}
