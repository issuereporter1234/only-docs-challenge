//Write a class Animal with properties name and sound. Create 3 animals and print each one in this format:
//[name] says [sound].
class Animal{
    String name;
    String sound;
    
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
        
    }
}
public class Main {
    public static void main(String[] args) {
       Animal Cat = new Animal("Cat", "Meow");
       Animal Dog = new Animal("Dog", "Wuf");
       Animal Chicken = new Animal("Chicken", "Ko ko");
       System.out.println(Cat.name + " says " + Cat.sound + ".");
       System.out.println(Dog.name + " says " + Dog.sound + ".");
       System.out.println(Chicken.name + " says " + Chicken.sound + ".");
    }
}
