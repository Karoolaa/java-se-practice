package pl.globallogic.exercises.intermediate.Polymorfism;

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return this.getName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return this.getName() + " -> brake()";
    }
}