import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
  //Write a program that has a list of 5 animals and prints the longest animal name.
   ArrayList<String> animals = new ArrayList<String>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Aligator");
    animals.add("Fish");
    animals.add("Horse");
    
    int num = 0;
    String longAnimName = "";
    for(String animal : animals){
    	if(animal.length() > num){
        	num = animal.length();
            longAnimName = animal;
        }
    }
    System.out.println(longAnimName);
  }
}
