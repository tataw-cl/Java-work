package Submit;
//enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
class Car{
    public enum Type {//enum declaration inside a class
        SEDAN, HATCHBACK, TRUCK
    }
    Type type;//enum variable called type
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
            Car c1 = new Car();//creating an object of the class Car
            c1.type = Car.Type.SEDAN;//assigning a value to the enum variable type
            c1.startEngine();
            c1.accelerate();
            c1.turnLeft();
            c1.turnRight();
            c1.brake();
            // c1.stopEngine();
        }
    }