package com.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int MaxRectangleArea(int[] A)
	{
		UsingQueues stack = new UsingQueues();
		if(A==null || A.length ==0)
			return 0;
		
		int maxArea = 0;
		int i=0;
		while(i<A.length)
		{
			// if current bar is higher than stack top
			if(stack.empty() || A[i] >= stack.top())
				stack.push(i++);
			else
			{
				//if current bar is smaller than stack top
				int top = stack.pop();
				maxArea = Math.max(maxArea, A[top]*(stack.empty()?i:i-stack.top()-1));
			}
	
		}
		
		while(!stack.empty())
		{
			int top = stack.pop();
			maxArea = Math.max(maxArea, A[top]*(stack.empty()?i:stack.top()-i-1));
		}
		return maxArea;
	}
}
