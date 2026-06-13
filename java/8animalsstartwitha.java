import java.util.ArrayList;
import java.util.Collections;
public class Main {

  public static void main(String[] args) {
//Write a program that has a list of 5 animals and prints them sorted alphabetically.
        ArrayList<String> animals = new ArrayList<String>();
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Aligator");
    animals.add("Kangaroo");
    animals.add("Horse");
    Collections.sort(animals);
    for (String animal : animals){
    if(animal.startsWith("A")){
        System.out.println(animal);
        }
    }
  }
}
