<?php
//Write a program that has an associative array of 5 countries and their capitals. Print only the countries where the capital name is longer than the country name.
$countries = array('Germany' => 'Berlin', 'Serbia' => 'Belgrade', 'USA' => 'Washington, D.C.', 'Austria' => 'Vienna', 'Arabia' => 'Dubai');
foreach($countries as $country => $capital){
    if(strlen($country) < strlen($capital)){
        print $country. "\n";
    }

}
?>
