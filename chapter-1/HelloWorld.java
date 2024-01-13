
/**
 * Write a description of sample here.
 * 
 * @author (sienna_Tariman) 
 * @version (01/06/24)
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        // Creating a new Cat object with the 'new' keyword and the contructor
        CatTwo myCat = new CatTwo("orange", "elated");

        // Accessing  the public methods of the Cat class
        System.out.println("The cat is " + myCat.getColor() + " and feels " + myCat.getMood());
        myCat.makeHappy(); // Makes the cat  happy which internally changes its mood and make it purr

        // Creating a new CatThree object
        CatThree tabby = new CatThree();

        // Calling the public methods of the Cat class
        tabby.meow(); // Output: Meow!
        tabby.scratch(); // Output: Scratch!

        // Demonstrating the reusability of methods
        tabby.displayBehavior(); // Calls multiple methods to display behaviors
    }
}

/*
   Java hinges on classes = blueprints. 'Hello World is a class'
   Within the HelloWorld class, we house the 'main' method ('main is a method and not a function since it was defined inside of a class')
   
   */

