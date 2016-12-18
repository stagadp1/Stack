package com.Stack;

import java.util.*;

public class ValidExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "((2+3)*5)";
		System.out.println(isValid2(str));
	
	
	}

	public static boolean isValid(String str)
	{
	    if(str.length() == 0)
	    {
	        return true;
	    }    
	    char[] arr = str.toCharArray();
	    Stack<Character> stack = new Stack<Character>();
	    
	    for(int i=0;i<str.length();i++)
	    {
	        if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
	        {
	            stack.push(arr[i]);   
	        }
	        if(arr[i] == ')' || arr[i] == ']' || arr[i] == '}')
	        {
	            if(stack.isEmpty())
	                return false;
	            char c = stack.pop(); 
	            
	            if((c == '(' && arr[i] == ')' ) || (c=='[' && arr[i] == ']') || ( c=='{' && arr[i] == '}'))
	            {
	                    continue;
	            }
	            else
	            {
	                return false;   
	            }    
	        }   
	    }
	    
	    if(!stack.isEmpty())
	        return false;
	    return true;
	    
	}
	
	public static boolean isValid2(String str)
	{
		Map<Character,Character> map = new HashMap<Character,Character>();
		
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			char curr = str.charAt(i);
			
			if(map.keySet().contains(curr))
			{
				st.push(curr);
			}
			else if(map.values().contains(curr))
			{
				if(curr == map.get(st.peek()) && !st.isEmpty())
				{
					st.pop();
				}
				else
				{
					return false;
				}
			}
		}
		return true;
	}
}
