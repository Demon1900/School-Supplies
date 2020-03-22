/***********************************************************************
@Title:	MatthewsDevynSchoolSupply
@Purpose:	To get familiar with simple calculations and comparison in Java
@Author:    (Matthews Devyn)
@Date:   	(9/16/2019)
@Version:	1.2
************************************************************************/

import java.util.Scanner;

public class MatthewsDevynSchoolSupply
{
	public static void main(String[] args)
	{


	Scanner keyboard= new Scanner(System.in);

	int Pencil;
	double Shipping; //Calcualting Shipping
	double Package;
	double Individual;
	double Percent;
	double Total;
	String again;
//The amount of Pencil ordered

do{	System.out.println("How many pencils did you order?");
	Pencil = keyboard.nextInt();
	Package= Pencil / 10;
	System.out.println("The number of package is " + Package);

//If the amount of pencils are less than 10.

	if(Pencil<10)
	 {Total= Pencil * .72;}

	Individual= (Pencil + 100) % 10;
System.out.println("The individual pencil is " + Individual );

		//The intital total higher than 10

	 Total= (Package*5.99) + (Individual*.72);

	if(Total<=25)
	{
	 Shipping = Total + 2.5;
     Total= Shipping;
	 System.out.println("Shipping:$2.5");
	}

	if(Total>=30)
	{
	 Percent = Total*.15;
     Total= Total-(Percent);
  	 System.out.println("You'll have a 15% discount");
    }

	System.out.println("Your total is $" + Total);
	System.out.println("\nWould you like to try again? y or n");
	again=keyboard.next();
}while(again.equals("y"));		//Updated on 3/22/2020
}
   }

