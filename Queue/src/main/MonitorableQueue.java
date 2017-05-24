package main;

import java.util.LinkedList;
import java.util.List;

public class MonitorableQueue implements QueueMethods {

	public final List<Object> _queue;
	public int _maxSize = 0;
	
	public MonitorableQueue() {
		_queue = new LinkedList<Object>();
	}
	
	@Override
	public void enque(Object item) {
		_queue.add(item);
		if(_queue.size() > _maxSize)
			_maxSize++;
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
