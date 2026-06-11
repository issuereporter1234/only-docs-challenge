using System;
//Write a program that has a list of 5 city names and prints each one on a new line.		
public class Program
{
	public static void Main()
	{
		string[] cities = {"Berlin", "Belgrade", "New York", "Vienna", "Dubai"};
		foreach (string city in cities){
			Console.WriteLine(city);
		}
	}
}
