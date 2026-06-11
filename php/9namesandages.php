<?php
//Write a program that has an associative array of 3 people with their name and age. Print each person in this format:
[name] is [age] years old.
people =  array("Peter"=>"35", "Ben"=>"37", "Joe"=>"43");

foreach ($people as $name => $age){
	print $name. " is ". $age. " years old.\n";
}
?>
