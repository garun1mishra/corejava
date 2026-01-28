package april;

class Animal {

	  // default or no-arg constructor of class Animal
	  Animal() {	
	    System.out.println("I am an animal");
	  }
	  
	// parameterized constructor
	  Animal(String type) {
	    System.out.println("Type: "+type);
	  }
	}

	class Dog extends Animal {

	  // default or no-arg constructor of class Dog
	  Dog() {

	    // calling default constructor of the superclass
//	    super();

	    System.out.println("I am a dog");
	  }
	}




public class MainClassExample {

	public static void main(String[] args) {
//		 Dog dog1 = new Dog();
		 Animal an = new Animal();
	}

}
