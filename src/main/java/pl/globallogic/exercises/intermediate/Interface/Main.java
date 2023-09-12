package pl.globallogic.exercises.intermediate.Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Tim", 10, 15);
        Monster monster = new Monster("Werewolf", 20, 40);

        // Save player and monster data to a list
        List<ISaveable> saveables = new ArrayList<>();
        saveables.add(player);
        saveables.add(monster);

        // Display saved data
        for (ISaveable saveable : saveables) {
            System.out.println("Original: " + saveable);
            List<String> savedValues = saveable.write();
            saveable.read(savedValues);
            System.out.println("After reading: " + saveable);
        }
    }
}