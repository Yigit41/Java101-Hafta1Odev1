package patikadev;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		
		//variables are defined
		double height,index;
		int weight;
		
		System.out.println("****BODY MASS INDEX CALCULATOR****");
		Scanner input = new Scanner(System.in);
		

		//Getting height information from user
		System.out.println("Please enter your weight (kg) : ");
		weight = input.nextInt();
		

		//Getting height information from user
		System.out.println("Please enter your height (m) : ");
		height = input.nextDouble();
		
		//Calculating the user's body mass index
		index = weight/(height*height);
		System.out.println("Your Body Mass Index : "+index);
	}

}
