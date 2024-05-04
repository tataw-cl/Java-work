class Car{
    Type type;
    public enum Type {
        SEDAN, HATCHBACK, TRUCK
    }
    String Matriculation;
    int numberOfDoors;
    int horsePower;
    class Owner{
        String firstName;
        String surName;
        char gender;
        String phoneNumber;
    }

    protected void startEngine(){
        System.out.println("Engine started");
    }
    protected void stopEngine(){
        System.out.println("Engine stopped");
    }
    protected void accelerate(){
        System.out.println("Car is accelerating");
    }
    protected void brake(){
        System.out.println("Car is braking");
    }
    protected void turnLeft(){
        System.out.println("Car is turning left");
    }
    protected void turnRight(){
        System.out.println("Car is turning right");
    }
}
// Path: TaskD.java main method
    public class TaskD{
        public static void main(String[] args){
            Car c1 = new Car();
            c1.type = Car.Type.SEDAN;
            c1.startEngine();
            c1.accelerate();
            c1.turnLeft();
            c1.turnRight();
            c1.brake();
            // c1.stopEngine();
        }
    }