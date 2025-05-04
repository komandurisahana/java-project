public class AnimalKingdom 
{
   public static void main(String[] args) 
   {
      // Create an array of Animal objects
      
      Animal animals [] = new Animal[3];
   
      // Add different types of animals to the array
      
      Animal eagle = new Bird("Eagle");
      animals[0] = eagle;
      Animal goldfish = new Fish("Goldfish");
      animals[1] = goldfish;
      Animal lion = new Mammal("Lion");
      animals[2] = lion;
   
      // Loop through each animal and test their behaviors
      
      for (int i = 0; i < animals.length; i++) {
         System.out.println("Testing " + animals[i].getName() + ":");
         animals[i].makeSound();
         animals[i].move();
         System.out.println();
      }
         
      // Call unique methods for each type of animal
      System.out.println("Unique activities:");
      for(int i = 0; i < animals.length; i++) {
         if (animals[i] instanceof Bird) {
            ((Bird)animals[i]).laysEggs();
         }
         
         if (animals[i] instanceof Fish) {
            ((Fish)animals[i]).swimsSchool();
         }
         
         if (animals[i] instanceof Mammal) {
            ((Mammal)animals[i]).nursesYoung();
         }
      }

   } // main
} // end of AnimalKingdom_shell


// Base class: Animal
class Animal 
{
   private String name;

   // Constructor
   public Animal(String name) {
      this.name = name;
   }

   // Getter for name
   public String getName() {
      return name;
   }

   // Method to be overridden
   public void makeSound() {
      System.out.println(name + " makes a sound.");
   }

   // Method to be overridden
   public void move() {
      System.out.println(name + " moves around.");
   }
} // end of Animal


// Subclass: Bird
class Bird extends Animal 
{
   // Constructor
   
   public Bird (String name) {
      super(name);
   }

   // Overriding makeSound
   
   public void makeSound() {
      System.out.println(getName() + " chirps.");
   }

   // Overriding move

   public void move() {
      System.out.println(getName() + " flies through the air.");
   }

   // Unique method
   
   public void laysEggs() {
      System.out.println(getName() + " lays eggs in a nest.");
   }

}  // end of Bird

// Subclass: Fish
class Fish extends Animal {
   
   // Constructor
   
   public Fish (String name) {
      super(name);
   }

   // Overriding makeSound
   
   public void makeSound() {
      System.out.println(this.getName() + " bubbles.");
   }

   // Overriding move

   public void move() {
      System.out.println(getName() + " swims through the water.");
   }

   // Unique method
   
   public void swimsSchool() {
      System.out.println(getName() + " swims in a school.");
   }

}
// Subclass: Mammal
class Mammal extends Animal {
   // Constructor
   
   public Mammal (String name) {
      super(name);
   }

   // Overriding makeSound
   
   public void makeSound() {
      System.out.println(getName() + " growls.");
   }

   // Overriding move

   public void move() {
      System.out.println(getName() + " walks on land.");
   }

   // Unique method
   
   public void nursesYoung() {
      System.out.println(getName() + " nurses its young.");
   }
}
