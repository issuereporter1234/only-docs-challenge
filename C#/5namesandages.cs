//Write a program that has a dictionary of 3 people with their name and age. Print each person in this format:
//[name] is [age] years old.
using System;
using System.Collections.Generic;

class Geeks
{
    public static void Main()
    {
        Dictionary<string, int> names = new Dictionary<string, int>();
		names.Add("Peter", 35);
		names.Add("Ben", 37);
		names.Add("Joe", 43);
		
		foreach(var ele in names){
			Console.WriteLine($"{ele.Key} is {ele.Value} years old");
		}
    }
}
