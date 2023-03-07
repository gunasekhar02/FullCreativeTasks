import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack<>();
		stack.push(10);
		stack.push(21);
		stack.push(61);
		stack.push(50);
		
		System.out.println(stack.empty());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		
		System.out.println(stack.search(21));
		
				

	}

}
