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
} // If we instantiate a new Cat object, we bring an instance of the Cat class into memory
   // By instantiating a new Cat object, we essentially encapsulate the cat's properties and the actions it can perform within  one cohesive unit

/*
    Contructors
*/

// - are specialized methods invoked at thetime of object creation to initialize new objects
// - utilizes access modifiers like 'public', 'private' to define class accesibility

//  'new' keyword allocates memory for new Cat instances
// through methods, objects  can interact, influence, and  collaborate

public class CatTwo {
    // Using 'private' to restrict access to the properties from outside  this class
    private String color;
    private  String mood;

    // Public constructor for Cat class
    public CatTwo(String color, String mood) {
        // The 'this' keyword refers to the current instance of the class
        this.color = color;
        this.mood = mood;
    }

    // Public method to  access the private color field
    public String getColor() {
        return color;
    }

    // Public method to access the private mood field
    public String getMood() {
        return mood;
    }

    // Private method, only accessible within  this class
    private void changeMood(String newMood) {
        mood = newMood;
    }

    // Public method to expose the  behavior of the Cat object
    public void purr() {
        System.out.println("Cat purrs");
    }

    // Public method to interact with  the private changeMood method
    public void makeHappy() {
        changeMood("happy");
        purr(); // The cat purrs when made happy
        System.out.println("The cat is " + this.getColor() + " and feels " + this.getMood());
    }
} 

    // to use the CatTwo class, create an instance of CatTwo using the  'new' keyword

// public class Main {
//     public static void main(String[] args) {
//         // Creating a new Cat object with the 'new' keyword and the contructor
//         CatTwo myCat = new CatTwo("orange", "elated");

//         // Accessing  the public methods of the Cat class
//         System.out.println("The cat is " + myCat.getColor() + " and feels" + myCat.getMood());
//         myCat.makeHappy(); // Makes the cat  happy which internally changes its mood and make it purr
//     }
// }