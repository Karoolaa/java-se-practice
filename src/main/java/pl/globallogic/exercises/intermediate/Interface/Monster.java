package pl.globallogic.exercises.intermediate.Interface;

import java.util.ArrayList;
import java.util.List;

class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    // Getters for fields
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    // ISaveable methods
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(name);
        values.add(Integer.toString(hitPoints));
        values.add(Integer.toString(strength));
        return values;
    }

    @Override
    public void read(List<String> savedValues) {

    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() == 3) {
            name = savedValues.get(0);
            hitPoints = Integer.parseInt(savedValues.get(1));
            strength = Integer.parseInt(savedValues.get(2));
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Monster{name='" + name + "', hitPoints=" + hitPoints + ", strength=" + strength + "}";
    }
}