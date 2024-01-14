public class CatFour {
    // Private instance variables, encapsulating the state of the Cat object
    private String name;
    private int age;

    // Contructor that initializes a Cat object with a given name and age
    public CatFour(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for the name, allowing read access to the private variable
    public String getName(){
        return this.name;
    }

    // Public setter for the name, allowing wirite access to the private variable
    public void setName(String name){
        this.name = name;
    }

    // Public getter for the age, allowing read access to the private variable
    public int getAge(){
        return this.age;
    }

    // Public setter for the age, allowing write access, to the private variable
    public void setAge(){
        this.age = age;
    }

    // Public method to display the Cat's attributes
    public void displayInfo(){
        System.out.println(this.name + " is " + this.age + " year(s) old.")
    }
}