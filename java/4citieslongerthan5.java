public class MyClass {
  public static void main(String args[]) {
   //Write a program that has a list of 5 city names and prints only the cities that have more than 5 characters in their name.
   String[] cities = {"Berlin", "Belgrade", "New York", "Vienna", "Dubai"};
   for(String city: cities){
       if(city.length() > 5){
       
           System.out.println(city);
       }
       }
   }
  }
