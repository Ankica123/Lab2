package gcdemos;

import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.println("Welcome to Grand Circus' Room Detail Generator");


		System.out.println("Enter Lenght :");
		double l = scnr.nextDouble();

		System.out.println("Enter Widht:");
		double w = scnr.nextDouble();

		System.out.println("Enter hight");
		double h = scnr.nextDouble();

		double area = l * w;
		double perimeter = l * 2 + w * 2;
		double volume = l * w * h;

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Volume:" + volume);
		String myLetter;
		myLetter = new String();
		System.out.println("Continue? y/n");
		myLetter = scnr.next();

	}

}
