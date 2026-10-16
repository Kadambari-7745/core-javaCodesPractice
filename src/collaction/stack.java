package collaction;

import java.util.Stack;

//stack LIFO Principle 
public class stack {
	
	public static void main(String[] args) {
		
		
		Stack <Integer> st = new Stack <>();
		
		st.push(20);
		st.push(40);
		st.push(70);
		st.push(44);
		st.push(30);
		st.push(54);
		
		//print elelment of stack
		System.out.println(st); //[20, 40, 70, 44, 30, 54]
		
		//see top element
		System.out.println(st.peek());  //54
		System.out.println(st);   	//[20, 40, 70, 44, 30, 54]
		
		//remove element
		st.pop();
		
		System.out.println(st); //20, 40, 70, 44, 30]
		
		//search position of element
		System.out.println(st.search(20));  //5 position
		
	}

}
