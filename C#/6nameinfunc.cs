//Write a function that takes a name as a parameter and returns Hello, [name]!. Call the function and print the result.
using System;
using System.Collections.Generic;
class Program
{
	static string returnName(string name){
	return $"Hello, {name}!";
	}
    public static void Main()
    {
        Console.WriteLine(returnName("Marko"));
    }
}
