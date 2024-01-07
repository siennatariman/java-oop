
/**
 * Write a description of sample here.
 * 
 * @author (sienna_Tariman) 
 * @version (01/06/24)
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}

/*
   Java hinges on classes = blueprints. 'Hello World is a class'
   Within the HelloWorld class, we house the 'main' method ('main is a method and not a function since it was defined inside of a class')
   
   */

// Understanding Java Syntax

/*
    Objects and Classes in  Java
*/

class Cat {
    String color;
    String mood;

    void purr(){
        System.out.println("Cat purrs");
    }
}
   // If we instantiate a new Cat object, we bring an instance of the Cat class into memory
   // By instantiating a new Cat object, we essentially encapsulate the cat's properties and the actions it can perform within  one cohesive unit

/*
    Contructors
*/