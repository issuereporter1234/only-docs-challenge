using System;
//Write a program that has a list of 5 city names and prints only the cities that 
//have more than 5 characters in their name.
public class Program
{
	public static void Main()
	{
		string[] cities = {"Berlin", "Belgrade", "New York", "Vienna", "Dubai"};
		foreach (string city in cities){
			if(city.Length > 5){
				Console.WriteLine(city);
			}
		}
	}
}
