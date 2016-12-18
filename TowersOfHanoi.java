package com.Stack;

import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	     // solve(discs, "A", "B", "C");
		
	       String ans = hanoi(discs, 1, 3);
	       System.out.println("ans "+ans);
	       
	       
	       int nDisks = 3;
	       doTowers(nDisks, 'A', 'B', 'C');
	}

	 public static void solve(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println("n==1, "+start + " "+n+"->" + end);
	       } else {
	           solve(n - 1, start, end, auxiliary);
	           System.out.println(start + " "+n+"->" + end);
	           solve(n - 1, auxiliary, start, end);
	       }
	      
	   }

	 
	 public static String hanoi(int nDisks, int fromPeg, int toPeg)
     {
  	 int helpPeg;
  	 String Sol1, Sol2, MyStep, mySol;   // Contains moves
   
  	 if ( nDisks == 1 )
	 {
  	    return fromPeg + " -> " + toPeg + "\n";
	 }
  	 else
  	  {
  	    helpPeg = 6 - fromPeg - toPeg;    // Because fromPeg + helpPeg + toPeg = 6    

  	    Sol1 = hanoi(nDisks-1, fromPeg, helpPeg);    
                                                        
  	    MyStep = fromPeg + " -> " + toPeg + "\n";    
                                                        
  	    Sol2 = hanoi(nDisks-1, helpPeg, toPeg);      

	    mySol = Sol1 + MyStep + Sol2;     // + = String concatenation !
   
  	    return mySol;
  	  }
     }
	 
	 public static void doTowers(int topN, char from,char inter, char to) 
	 {
			      if (topN == 1)
			      {
			    	  System.out.println("Disk 1 from "+ from + " to " + to);
			      }
			      else 
			      {
			         doTowers(topN - 1, from, to, inter);
			         System.out.println("Disk "+ topN + " from " + from + " to " + to);
			         doTowers(topN - 1, inter, from, to);
			      }
			   }
	
}
