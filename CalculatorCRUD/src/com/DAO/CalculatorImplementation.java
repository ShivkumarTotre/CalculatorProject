package com.DAO;

import com.Bean.*;
import java.util.*;

public class CalculatorImplementation implements CalculatorDetails{

		Details d;
		Scanner sc = new Scanner(System.in);
		
		public void enternumbers() 
		{	
			System.out.println("enter first number");
			int a = sc.nextInt();
			System.out.println("enter second number");
			int b = sc.nextInt();
			d = new Details(a, b);
		}

		@Override
		public void addition() 
		{
			this.enternumbers();
			System.out.println("Addition is : "+d.a+d.b);
		} 
	
		@Override
		public void subtraction() 
		{
			this.enternumbers();
			System.out.println("Subtraction is : "+(d.a-d.b));
		}
	
		@Override
		public void multiplication() 
		{
			this.enternumbers();
			System.out.println("Multiplication is : "+d.a*d.b);
		}
	
		@Override
		public void division() 
		{
			this.enternumbers();
			System.out.println("Division is : "+d.a/d.b);
		}

		public int addition1(int i, int j) 
		{
			return i+j;
		}

		public int subtraction1(int i, int j) 
		{
			return i-j;
		}

		public int multiplication1(int i, int j) 
		{
			return i*j;
		}

		public int division1(int i, int j) 
		{
			return i/j;
		}
	
}
