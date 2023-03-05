
import java.util.*;


public class QueueEx {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> queue1=new PriorityQueue<>(); //sorts the queue
		ArrayDeque<Integer> queue2= new ArrayDeque<>(); // behaves as double ended queue 
		for(int i=10;i>0;i--) {
			queue1.add(i);
		}
		for(int i=10;i>0;i--) {
			queue2.add(i);
		}
		System.out.println(queue1);
		System.out.println(queue2);
		System.out.println(queue2.getFirst());
		System.out.println(queue2.getLast());
		System.out.println(queue2.peek());
		System.out.println(queue2.peekFirst());
		System.out.println(queue2.peekLast());
		queue2.offerFirst(11);
		System.out.println(queue2);
		queue2.addFirst(12);
		System.out.println(queue2);
		Iterator<Integer> itr= queue1.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		for(int i:queue1) {
			System.out.print(i+" ");
		}
		System.out.println();
		Iterator<Integer> itr1= queue2.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println();
		queue2.addAll(queue1);
		System.out.println(queue1);
		System.out.println(queue2);
		//queue1=  queue2.clone();
		//System.out.println(queue1);
		

	}

}
