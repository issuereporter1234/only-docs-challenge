//Write a program that has a list of 5 animals and prints only the animals whose name starts with the letter "A".
using System;
using System.Collections.Generic;				
public class Program
{
	public static void Main(){
		List<string> animals =  ["Cat", "Dog", "Aligator", "Parrot", "Horse"];
	 string longAnimName = "";
		foreach(string animal in animals){
			if(animal.Length > longAnimName.Length){
				longAnimName = animal;
			
			}
		}
		Console.WriteLine(longAnimName);
}
}
