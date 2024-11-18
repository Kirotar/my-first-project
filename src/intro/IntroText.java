package intro;
import java.util.Scanner;
//Greeting and explaining what the program does, asking for name

public class IntroText {
    private void introText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Greetings, traveller! I see you have found this humble Dungeond and Dragons character creator. " +
                 "\nTo start, tell me what is your characters name?");
        String name= sc.nextLine();
        System.out.println(name + " is a great name!");
    };
}
