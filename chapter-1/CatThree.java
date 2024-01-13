public class CatThree {
    // A method with no return value (void) that represent that cat's action
    public void meow(){
        // Prints "Meow!" to the console when the method is called
        System.out.println("Meow!");
    }

    // A method with no return value (void) that represent the cat's action of scratching
    public void scratch(){
        // Prints "Scratch!" to the console when the method is called
        System.out.println("Scratch!");
    }

    // Example of a methods that changes the internal state of the object
    public void displayBehavior(){
        meow();
        scratch();
       // changeMood("curious"); // The cat's mood is changed internally
    }
}