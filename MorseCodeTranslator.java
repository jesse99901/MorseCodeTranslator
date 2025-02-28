import java.util.HashMap;

public class MorseCodeTranslator {
    // Morse code mappings for letters, numbers, and space
    private static final HashMap<Character, String> textToMorseMap = new HashMap<>();
    private static final HashMap<String, Character> morseToTextMap = new HashMap<>();

    static {
        // Initialize the text-to-Morse mappings
        textToMorseMap.put('A', ".-");
        textToMorseMap.put('B', "-...");
        textToMorseMap.put('C', "-.-.");
        textToMorseMap.put('D', "-..");
        textToMorseMap.put('E', ".");
        textToMorseMap.put('F', "..-.");
        textToMorseMap.put('G', "--.");
        textToMorseMap.put('H', "....");
        textToMorseMap.put('I', "..");
        textToMorseMap.put('J', ".---");
        textToMorseMap.put('K', "-.-");
        textToMorseMap.put('L', ".-..");
        textToMorseMap.put('M', "--");
        textToMorseMap.put('N', "-.");
        textToMorseMap.put('O', "---");
        textToMorseMap.put('P', ".--.");
        textToMorseMap.put('Q', "--.-");
        textToMorseMap.put('R', ".-.");
        textToMorseMap.put('S', "...");
        textToMorseMap.put('T', "-");
        textToMorseMap.put('U', "..-");
        textToMorseMap.put('V', "...-");
        textToMorseMap.put('W', ".--");
        textToMorseMap.put('X', "-..-");
        textToMorseMap.put('Y', "-.--");
        textToMorseMap.put('Z', "--..");
        textToMorseMap.put('0', "-----");
        textToMorseMap.put('1', ".----");
        textToMorseMap.put('2', "..---");
        textToMorseMap.put('3', "...--");
        textToMorseMap.put('4', "....-");
        textToMorseMap.put('5', ".....");
        textToMorseMap.put('6', "-....");
        textToMorseMap.put('7', "--...");
        textToMorseMap.put('8', "---..");
        textToMorseMap.put('9', "----.");
        textToMorseMap.put(' ', "/");

        // Initialize the Morse-to-text mappings
        for (Character key : textToMorseMap.keySet()) {
            morseToTextMap.put(textToMorseMap.get(key), key);
        }
    }

    // Translate text to Morse code
    public static String textToMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        text = text.toUpperCase(); // Convert text to uppercase for consistency

        for (char c : text.toCharArray()) {
            if (textToMorseMap.containsKey(c)) {
                morseCode.append(textToMorseMap.get(c)).append(" ");
            } else {
                morseCode.append(c); // Keep non-mapped characters as is
            }
        }
        return morseCode.toString().trim();
    }

    // Translate Morse code to text
    public static String morseToText(String morseCode) {
        StringBuilder text = new StringBuilder();
        String[] words = morseCode.split(" / "); // Split into words

        for (String word : words) {
            String[] letters = word.split(" "); // Split into letters
            for (String letter : letters) {
                if (morseToTextMap.containsKey(letter)) {
                    text.append(morseToTextMap.get(letter));
                } else {
                    text.append(letter); // Keep non-mapped Morse code as is
                }
            }
            text.append(" "); // Add space between words
        }
        return text.toString().trim();
    }
}