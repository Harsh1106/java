import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Replace punctuation marks with spaces
        input = input.replaceAll("[^a-zA-Z0-9\\s]", " ");

        // Split the string into words
        String[] words = input.split("\\s+");

        // Print the word count
        System.out.println(words.length);

        // Print each word on a new line
        for (String word : words) {
            System.out.println(word);
        }
    }
}
