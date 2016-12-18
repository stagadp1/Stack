package com.Stack;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static UsingQueues sortStack(UsingQueues stack)
	{
		UsingQueues helper = new UsingQueues();
		while(!stack.empty())
		{
			int temp = stack.pop();
			while(!helper.empty() && temp<helper.top())
			{
				stack.push(helper.pop());
			}
			helper.push(temp);
		}
		return stack;
	}
}
