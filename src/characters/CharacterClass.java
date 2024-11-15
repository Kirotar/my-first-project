package characters;
//Here I make character classes user can select.

import java.util.ArrayList;
import java.util.List;

public class CharacterClass {
    String className;
    String classDescription;
    int hitdie;

    public CharacterClass(String name, String description, int hitdie) {
        this.className = name;
        this.classDescription = description;
        this.hitdie = hitdie; //Compare int in attributes to generate the random number

    }
    @Override
    public String toString() {
        return "Class: " + className + "\n" +
                "Description: " + classDescription + "\n" +
                "Hit Die: " + hitdie + "\n";
    }

    public static void creatingCharacterClasses() {
        String[] classNames = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk",
                "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"};

        int[] hitDie = {12, 8, 8, 8, 10, 8, 10, 10, 8, 6, 8, 6}; //Maybe something can be done here as well?
        String[] descriptions = descriptionsForClasses();
        List<CharacterClass> characterClasses = new ArrayList<>();
        for
        (int i = 0; i < classNames.length; i++) {
            characterClasses.add(new CharacterClass(classNames[i], descriptions[i], hitDie[i]));
        }
    }

    private static String[] descriptionsForClasses() {
        return new String[]{
                "Barbarians are mighty warriors who are powered by primal forces of the multiverse that manifest as a Rage.",
                "Bards are expert at inspiring others, soothing hurts, disheartening foes, and creating illusions.",
                "Clerics draw power from the realms of the gods and harness it to work miracles.",
                "Druids belong to ancient orders that call on the forces of nature.",
                "Fighters rule many battlefields. Questing knights, royal champions, elite soldiers, and hardened mercenaries—as Fighters.",
                "Monks use rigorous combat training and mental discipline to align themselves with the multiverse and focus their internal reservoirs of power.",
                "Paladins are united by their oaths to stand against the forces of annihilation and corruption.",
                "Rangers keep their unending watch in the wilderness. Rangers learn to track their quarry as a predator does.",
                "Rogues rely on cunning, stealth, and their foes’ vulnerabilities to get the upper hand in any situation.",
                "Sorcerers wield innate magic that is stamped into their being.",
                "Warlocks quest for knowledge that lies hidden in the fabric of the multiverse.",
                "Wizards are defined by their exhaustive study of magic’s inner workings."
        };
    }
}
