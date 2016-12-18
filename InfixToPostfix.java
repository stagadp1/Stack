package com.Stack;

import java.util.Stack;

public class InfixToPostfix {

	
	static Stack operatorStack = new Stack();

	public static String toPrefix(String expression) {
	    expression="("+expression+")";
	    int i;      
	    char token;
	    String output = "";
	    for (i = 0; i < expression.length(); i++) {
	        token = expression.charAt(i);
	        if (Character.isLetterOrDigit(token) == true)
	            output += token;
	        else if (token == '(')
	            operatorStack.push(token);
	        else if (token == ')') {
	            char seeTop;
	            while ((seeTop = seeTop()) != '(') {
	                output += seeTop;
	                popSeeTop();
	            }

	            operatorStack.pop();
	        } else {
	            while (priority(token) <= priority(seeTop())) {
	                output += seeTop();
	                popSeeTop();
	            }
	            operatorStack.push(token);
	        }
	    }
	    return output;
	}
	private static int priority(char operator) 
	{
	    if (operator == '^')
	        return 3;
	    if (operator == '/' || operator == '*')
	        return 2;
	    if (operator == '+' || operator == '-')
	        return 1;
	    return 0;
	}
	private static Character seeTop() {
	    if(!operatorStack.empty())
	        return (Character) operatorStack.peek();
	    else
	        return '0';
	}

	private static void popSeeTop() {
	    if(!operatorStack.empty())
	        operatorStack.pop();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toPrefix("A*B-(C+D)+E"));
	}

}
