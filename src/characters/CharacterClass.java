package characters;
//Here I make character classes user can select.

import java.util.ArrayList;

public class CharacterClass {
    String name;
    String description;
    int hitdie;

    public CharacterClass(String name, String description, int hitdie) {
        this.name = name;
        this.description = description;
        this.hitdie = hitdie; //Compare int in attributes to generate the random number

    }

    public static void main(String[] args) {
        String[] text = descriptions();
        CharacterClass Barbarian = new CharacterClass("Barbarian", text[0], 12);
        CharacterClass Bard = new CharacterClass("Bard", text[1], 8);
        CharacterClass Cleric = new CharacterClass("Cleric", text[2], 8);
        CharacterClass Druid = new CharacterClass("Druid", text[3], 8);
        CharacterClass Fighter = new CharacterClass("Fighter", text[4], 10);
        CharacterClass Monk = new CharacterClass("Monk", text[5], 8);
        CharacterClass Paladin = new CharacterClass("Paladin", text[6], 10);
        CharacterClass Ranger = new CharacterClass("Ranger", text[7], 10);
        CharacterClass Rogue = new CharacterClass("Rogue", text[8], 8);
        CharacterClass Sorcerer = new CharacterClass("Sorcerer", text[9], 6);
        CharacterClass Warlock = new CharacterClass("Warlock", text[10], 8);
        CharacterClass Wizard = new CharacterClass("Wizard", text[11], 6);
    }

    private static String[] descriptions() {
        String[] descriptions = {
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
        return descriptions;
    }
}
