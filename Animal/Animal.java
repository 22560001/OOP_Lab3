package Animal;

class Animal {
 public void makeSound() {
     System.out.println("Lion roaring");
 }
}

class Cat extends Animal {
	
 @Override
 public void makeSound() {
     System.out.println("meow meow meowww");
 }
}
