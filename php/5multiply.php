<?php
//Write a program that asks the user for a number and prints the multiplication table for that number (1 to 10).
$input = 2;
for ($i = 1; $i <= 10; $i++){
	echo $i * $input;
	echo "\n";
}
// better solution:
//echo "$i x $input = " . $i * $input . "\n";
?>
