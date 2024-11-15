package characters;
//Here we create character species.

import java.util.ArrayList;
import java.util.List;

public class CharacterSpecies {
    String speciesName;
    String speciesDescription;
    String bonus; //This should change attributes automatically
    String size;
    int speed;

    public CharacterSpecies(String name, String description, String bonus, String size, int speed) {
        this.speciesName = name;
        this.speciesDescription = description;
        this.bonus = bonus;
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Species: " + speciesName + "\n" +
                "Description: " + speciesDescription + "\n" +
                "Bonus to attribute: " + bonus + "\n" +
                "Size: " + size + "\n" +
                "Speed: " + speed + "\n";
    }

    public static void creatingSpecies() {
        String[] speciesNames = {"Human", "Elf", "Dwarf", "Halfling", "Gnome", "Half-elf", "Half-orc", "Tiefling", "Dragonborn"};
        String[] speciesDescriptions = descriptionsForSpecies();
        String[] bonus = {"."};
        String[] size = {"."};
        int[] speed = {30};

        List<characters.CharacterSpecies> characterSpecies = new ArrayList<>();
        for (int i = 0; i < speciesNames.length; i++) {
            characterSpecies.add(new characters.CharacterSpecies(speciesNames[i], speciesDescriptions[i], bonus[i], size[i], speed[i]));
        }
    }

    private static String[] descriptionsForSpecies() {
        return new String[]{
                "Humans are versatile and ambitious, thriving in diverse environments with varied cultures.",
                "Elves are graceful and long-lived, deeply attuned to nature and magic.",
                "Dwarves are stout and resilient, skilled in craftsmanship and living in mountain strongholds.",
                "Halflings are cheerful and nimble, finding joy in life's simple pleasures and small adventures.",
                "Gnomes are inventive and curious, with a knack for tinkering and illusions.",
                "Half-elves combine the adaptability of humans with the elegance of elves, often serving as bridges between the two.",
                "Half-orcs are fierce and determined, blending the strength of their orc heritage with human ambition.",
                "Tieflings bear a fiendish ancestry, marked by their infernal heritage and often misunderstood nature.",
                "Dragonborn are proud and honorable, descended from dragons and wielding elemental breath."
        };
    }
}
