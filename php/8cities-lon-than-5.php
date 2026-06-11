><?php
//Write a program that has a list of 5 city names and prints only the cities that have more than 5 characters in their name.
$cities = array('Berlin', 'Belgrade', 'New York', 'Vienna', 'Dubai');

foreach($cities as $city){
	if (strlen($city) > 5){
		print $city. "\n";
	}
}
?>
