import java.util.HashMap;
public class Main {
  public static void main(String[] args) {
    //Write a program that has a HashMap of 3 people with their name and age. Print each person in this format:

//[name] is [age] years old.
HashMap<String, Integer>  names = new HashMap <String, Integer>();
names.put("Peter", 35);
names.put("Ben", 37);
names.put("Joe", 43);
for (String name : names.keySet()){
	
    System.out.println(name + " is "+ names.get(name)+ " years old.");
    }
    
  }
}
