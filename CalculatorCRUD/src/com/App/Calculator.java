package com.App;

import com.DAO.*;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		CalculatorImplementation ci = new CalculatorImplementation();
		
		char ch = '\0';
		
		do
		{
			System.out.println("Enter the Choice");
			
			System.out.println("1 : Addition \n2 : Subtraction \n3 : Multiplication \n4 : Division");
			
			int iChoice = sc.nextInt();
			
			switch(iChoice)
			{
				case 1 : ci.addition();
				break;
				
				case 2 : ci.subtraction();
				break;
				
				case 3 : ci.multiplication();
				break;
				
				case 4 : ci.division();
				break;
				
				default :
					System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue this ?");
			ch = sc.next().charAt(0);
		
		}while(ch == 'y' || ch == 'Y');
			sc.close();
	}

}
