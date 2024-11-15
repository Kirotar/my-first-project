package characters;
//Here I make character classes user can select.

public class CharacterClass {
    String name;
    String description;
    int hitdie;

    public CharacterClass(String name, String description, int hitdie) {
        this.name = name;
        this.description = description;
        this.hitdie = hitdie; //Compare int in attributes to generate the random number
    }

    String textBar = "Barbarians are mighty warriors who are powered by primal forces of the multiverse that manifest as a Rage.";
    String textBard = ;
    String textCle = ;
    String textDru = ;
    String textFig = ;
    String textMo = ;
    String textPal = ;
    String textRan = ;
    String textRog = ;
    String textSor = ;
    String textWar = ;
    String textWiz = ;

    CharacterClass Barbarian = new CharacterClass("Barbarian", textBar, 12);
    CharacterClass Bard = new CharacterClass("Bard", textBard, 8);
    CharacterClass Cleric = new CharacterClass("Cleric", textCle, 8);
    CharacterClass Druid = new CharacterClass("Druid", textDru, 8);
    CharacterClass Fighter = new CharacterClass("Fighter", textFig, 10);
    CharacterClass Monk = new CharacterClass("Monk", textMo, 8);
    CharacterClass Paladin = new CharacterClass("Paladin", textPal, 10);
    CharacterClass Ranger = new CharacterClass("Ranger", textRan, 10);
    CharacterClass Rogue = new CharacterClass("Rogue", textRog, 8);
    CharacterClass Sorcerer = new CharacterClass("Sorcerer", textSor, 6);
    CharacterClass Warlock = new CharacterClass("Warlock", textWar, 8);
    CharacterClass Wizard = new CharacterClass("Wizard", textWiz, 6);

}
