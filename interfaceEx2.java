package Interface;
public class interfaceEx2 {
         public static void main(String[] args) {
        	 Car car = new Car();
             Bicycle bicycle = new Bicycle();
             Ship ship = new Ship();
             submarine submarine = new submarine();
             System.out.println("Testing Car:");
             car.start();
             car.drive();
             car.stop();
             System.out.println(); // Add an empty line for better readability
             System.out.println("Testing Bicycle:");
             bicycle.start();
             bicycle.drive();
             bicycle.stop();
             System.out.println(); // Add an empty line for better readability
             System.out.println("Testing Ship:");
             ship.start();
             ship.floatOnWater();
             ship.stop();
             System.out.println(); // Add an empty line for better readability
             System.out.println("Testing Submarine:");
             submarine.start();
             submarine.floatOnWater();
             submarine.stop();
         }
     }
     interface Vehicle {
     void start();
     void stop();
}
    interface LandVehicle extends Vehicle {
    void drive();
}
    interface SeaVehicle extends Vehicle {
    void floatOnWater();
}

    class Car implements LandVehicle {
    @Override
    public void start() {
    System.out.println("Car is starting.");
    }
    @Override
    public void stop() {
    System.out.println("Car is stopping.");
    }
    @Override
    public void drive() {
    System.out.println("Car is driving.");
    }
}
    class Bicycle implements LandVehicle {
    @Override
    public void start() {
    System.out.println("Bicycle is starting.");
    }
    @Override
    public void stop() {
    System.out.println("Bicycle is stopping.");
    }
    @Override
    public void drive() {
    System.out.println("Bicycle is driving.");
    }
}
    class Ship implements SeaVehicle {
    @Override
    public void start() {
    System.out.println("Ship is starting.");
    }
    @Override
    public void stop() {
    System.out.println("Ship is stopping.");
    }
    @Override
    public void floatOnWater() {
    System.out.println("Ship is floating on water.");
    }
}
    class submarine implements SeaVehicle {
    @Override
    public void start() {
    System.out.println("Submarine is starting.");
    }
    @Override
    public void stop() {
    System.out.println("Submarine is stopping.");
    }
    @Override
    public void floatOnWater() {
    System.out.println("Submarine is floating on water.");
    }
}

