package Vehicle;

class Vehicle {
 public void drive() {
     System.out.println("Đã uống rượu bia, không lái xe");
 }
}

class Car extends Vehicle {
	
 @Override
 public void drive() {
     System.out.println("Repairing a car");
 }
}

