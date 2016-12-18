package com.Stack;

import java.util.LinkedList;

public class UsingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	 LinkedList<Integer> queue1 = new LinkedList<Integer>();
	    LinkedList<Integer> queue2 = new LinkedList<Integer>();
	    
	    // Push element x onto stack.
	    public void push(int x) {
	        if(empty())
	        {
	            queue1.offer(x);
	        }
	        else
	        {
	            if(queue1.size()>0)
	            {
	                queue2.offer(x);
	                int len = queue1.size();
	                while(len>0)
	                {
	                    queue2.offer(queue1.poll());
	                    len--;
	                }
	            }
	            else if(queue2.size()>0)
	            {
	                queue1.offer(x);
	                int len = queue2.size();
	                while(len>0)
	                {
	                    queue1.offer(queue2.poll());
	                    len--;
	                }
	            }
	        }
	    }
/*
	    // Removes the element on top of the stack.
	    public void pop() {
	        if(queue1.size()>0)
	        {
	            queue1.poll();
	        }
	        else if(queue2.size()>0)
	        {
	            queue2.poll();
	        }
	        
	    }
*/
	    
	    
	    // Removes the element on top of the stack.
	    public int pop() {
	        if(queue1.size()>0)
	        {
	            return queue1.poll();
	        }
	        else if(queue2.size()>0)
	        {
	            return queue2.poll();
	        }
	        return 0;
	    }
	    
	    
	    
	    
	    
	    // Get the top element.
	    public int top() {
	         if(queue1.size()>0)
	        {
	            return queue1.peek();
	        }
	        else if(queue2.size()>0)
	        {
	           return  queue2.peek();
	        }
	        return 0;
	        
	    }

	    // Return whether the stack is empty.
	    public boolean empty() {
	       return queue1.isEmpty() && queue2.isEmpty();
	    }
	
	
}
