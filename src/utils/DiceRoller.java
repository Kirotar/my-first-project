package utils;

public class DiceRoller {
    int sides; //number of sides

    public DiceRoller(int sides) {
        this.sides = sides;
    }

    public int rollingDice() {
        return (int) ((Math.random() * sides) + 1);
    }
}
