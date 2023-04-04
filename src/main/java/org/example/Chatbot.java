import java.io.IOException;
        import java.util.Scanner;
        import jline.console.ConsoleReader;
        import jline.console.completer.StringsCompleter;
import org.example.Gebruiker;

public class Chatbot {


    public static void main(String[] args) {
        try {
            ConsoleReader reader = new ConsoleReader();
            reader.addCompleter(new StringsCompleter("hello", "how are you", "goodbye"));
            Scanner scanner = new Scanner(reader.getInput());

            while (true) {
                System.out.println("Please type your name:");
                String input = scanner.nextLine();
                scanner.nextLine();
                Gebruiker gebruiker= new Gebruiker(input);
                System.out.print("> ");
                if (input.equals("hello")) {
                    System.out.println("Hello, "+ gebruiker.getNaam()+ "! How can I help you?");
                } else if (input.equals("how are you")) {
                    System.out.println("I'm a chatbot, I don't have feelings!");
                } else if (input.equals("goodbye")) {
                    System.out.println("Goodbye! Have a nice day!");
                    break;
                } else {
                    System.out.println("I'm sorry, I didn't understand what you said.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
