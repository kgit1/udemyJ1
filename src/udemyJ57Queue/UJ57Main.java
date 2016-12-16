package udemyJ57Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class UJ57Main {

	public static void main(String[] args) {
		// (head) <- ooooooooooooooooooo(tail)  <- first-in-first-our
		//queues has 4 sets of commands
		//throws exception - add(e),remove(),element()
		//returns value - offer(e),poll(),peek()
		//blocks - put(e),take()
		//times out(for threads) offer(e, time, unit), poll(time, unit)
		Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		
		System.out.println("Queue1 element: "+q1.element());
		
		//unchecked RunTime exception IllegalStateException 
		//when u try to add more elements than blocked array can get
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue");
		}
		for (Integer integer : q1) {
			System.out.println(integer);
		}
		Integer value = q1.remove();
		
		//unchecked RunTime exception NoSuchElementException 
		//when u try to remove more elements than blocked array has
		try {
			System.out.println("Removed from queue: "+value);
			System.out.println("Removed from queue: "+q1.remove());
			System.out.println("Removed from queue: "+q1.remove());
			System.out.println("Removed from queue: "+q1.remove());
			System.out.println("Removed from queue: "+q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Havent so much elements");
		}
		System.out.println("===========");
		for (Integer integer : q1) {
			System.out.println(integer);
		}
		///////////////////////////////////
		Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
		//peek() is like element() but not giving exception but just null if out of bounds
		System.out.println("Queue 2: "+q2.peek());
		
		//offer() is like add() but not giving exception but just false if out of bounds
		q2.offer(10);
		q2.offer(20);
		
		if(q2.offer(30)==false){
			System.out.println("Offer failed to ad third item");
		};
		
		for (Integer integer : q2) {
			System.out.println(integer);
		}
		//poll() is like remove() but not giving exception but just false if out of bounds
		System.out.println("Queue 2 poll: "+q2.poll());
		System.out.println("Queue 2 poll: "+q2.poll());
		System.out.println("Queue 2 poll: "+q2.poll());
	}

}
