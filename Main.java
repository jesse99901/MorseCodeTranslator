import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMorse Code Translator");
            System.out.println("1. Text to Morse Code");
            System.out.println("2. Morse Code to Text");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter text to translate to Morse code: ");
                    String text = scanner.nextLine();
                    String morseCode = MorseCodeTranslator.textToMorse(text);
                    System.out.println("Morse Code: " + morseCode);
                    break;

                case 2:
                    System.out.print("Enter Morse code to translate to text: ");
                    String morseInput = scanner.nextLine();
                    String translatedText = MorseCodeTranslator.morseToText(morseInput);
                    System.out.println("Translated Text: " + translatedText);
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}