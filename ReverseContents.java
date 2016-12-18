package com.Stack;

public class ReverseContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingQueues stack = new UsingQueues();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		reverseStack(stack);
		System.out.println(stack.top());
	}

	public static void reverseStack(UsingQueues stack)
	{
		if(stack.empty())
			return;
		int temp = stack.pop();
		reverseStack(stack);
		insertAtBottom(stack, temp);
	}
	public static void insertAtBottom(UsingQueues stack,int data)
	{
		if(stack.empty())
		{
			stack.push(data);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, temp);
		stack.push(temp);
	}
}
