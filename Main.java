class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound"); //Imprime lo que hay en el parentesis
  }
}

class Dog extends Animal {
  public void animalSound() {
    super.animalSound(); // Call the parent method
    System.out.println("The dog says: bow wow"); //Imprime lo que hay en el parentesis
  }
}

public class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog(); //Crea un nuevo perro
    myDog.animalSound();
  }
}
