package pl.globallogic.exercises.intermediate.Polymorfism;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.name + " -> startEngine()";
    }

    public String accelerate() {
        return this.name + " -> accelerate()";
    }

    public String brake() {
        return this.name + " -> brake()";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
