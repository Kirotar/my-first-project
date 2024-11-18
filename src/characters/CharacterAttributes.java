package characters;

import utils.DiceRoller;

public class CharacterAttributes {
    //random dice roller or selection?
    //Or roll a nr of times, then select from those?
    //Takes info from Class, Race
    public static void main(String[] args) {

          DiceRoller d6=new DiceRoller(6);
        int oneRoll = d6.rollingDice();
        System.out.println(oneRoll);
    }
    private void rollingAttributes() {
        System.out.println("Now we can roll stats for your attributes - Strength, Intelligence, Wisdom, Constitution, Dexterity, and Charisma.");
    }
    }
