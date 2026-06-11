//Write a program that has a list of 5 animals. Print the list sorted alphabetically.
using System;
using System.Collections.Generic;				
public class Program
{
	public static void Main(){
		List<string> animals = ["Cat", "Dog", "Aligator", "Kangaroo", "Horse"];
		animals.Sort();
		
		foreach(string animal in animals){
			Console.WriteLine(animal);
		}
}
}
