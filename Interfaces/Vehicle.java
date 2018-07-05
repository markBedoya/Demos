public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;

    //constructor
    public Vehicle() {}

    //construtor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    protected abstract void drive();

}