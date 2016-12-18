package com.Stack;
import java.util.*;

public class ReverseStack {

	static void showpush(Stack<Integer> st, int a) {
	      st.push(new Integer(a));
//	      System.out.println("push(" + a + ")");
//	      System.out.println("stack: " + st);
	   }

	   static void showpop(Stack<Integer> st) {
	      //System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      //System.out.println(a);
	      //System.out.println("stack: " + st);
	   }
	   
	   public static void revertStack(Stack<Integer> s) {
		    if (s.isEmpty()) {
		        return;
		    } else {
		        Integer a = s.pop();
		        revertStack(s);
		        
		        appendStack(s, a);
		    }
		}

		public static void appendStack(Stack<Integer> s, Integer a) {
			System.out.println("a is"+a);
		    if (s.isEmpty()) {
		        s.push(a);
		        System.out.println("stack: " + s);
		        return;
		    } else {
		        Integer o = s.pop();
		        appendStack(s, a);
		        s.push(o);
		    }
		}
	
		public static void display(Stack<Integer> s)
		{
			while(!s.isEmpty())
			{
				System.out.println(s.pop());
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
	      //System.out.println("stack: " + st);
	      showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99);
	      
	      
	      revertStack(st);
	      
	      System.out.println("Output\n");
	      display(st);
	      
//	      showpop(st);
//	      showpop(st);
//	      showpop(st);
//	      try {
//	         showpop(st);
//	      } catch (EmptyStackException e) {
//	         System.out.println("empty stack");
//	      }
//	  
	      
	      
	}

}
