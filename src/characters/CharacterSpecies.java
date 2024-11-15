package characters;

import java.util.ArrayList;
import java.util.List;

public class CharacterSpecies {
    //Here user can select character race.
    //Change some attributes automatically depending on selection?
    //Name. Intro text. Bonuses, penalties. HD - roll in attributes? Languages
    String name;
    String description;
    String bonus;
    String size;
    int speed;

    public CharacterSpecies(String name, String description, String bonus, String size, int speed) {
        this.name = name;
        this.description = description;
        this.bonus = bonus;
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Species: " + name + "\n" +
                "Description: " + description + "\n" +
                "Bonus to attribute: " + bonus + "\n" +
                "Size: " + size + "\n" +
                "Speed: " + speed + "\n";
    }

    public static void creatingSpecies() {
        String[] classNames = {""};
        String[] descriptions = descriptionsForSpecies();
        String[] bonus = {"."};
        String[] size = {"."};
        int[] speed = {30};

        List<characters.CharacterSpecies> characterSpecies = new ArrayList<>();
        for (int i = 0; i < classNames.length; i++) {
            characterSpecies.add(new characters.CharacterSpecies(classNames[i], descriptions[i], bonus[i], size[i], speed[i]));
        }
    }

    private static String[] descriptionsForSpecies() {
        return new String[]{
                "."
        };
    }
}
