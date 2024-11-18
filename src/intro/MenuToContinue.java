package intro;

import java.util.Scanner;
//User chooses species and class, one by one down a path? Or let the user choose where to start?

public class MenuToContinue {
    private void menuSpecies() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now, choose a species:  " + "\nHuman" + "\nElf" + "\nDwarf" + "\nHalfling" + "\nGnome" +
                "\nHalf-Elf" + "\nHalf-Orc" + "\nTiefling or " + "\nDragonborn");
        String species = sc.nextLine();
        System.out.println(species + "is an excellent choice!");

    }

    private void menuClass() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Now choose a class: " + "\nBarbarian" + "\nBard" + "\nCleric" + "\nDruid" + "\nFighter" +
                "\nMonk" + "\nPaladin" + "\nRanger" + "\nRogue" + "\nSorcerer" + "\nWarlock" + "\nWizard");
        String characterClass = sc.nextLine();
        System.out.println(characterClass + ", huh? Sounds like fun!");
    }
}
