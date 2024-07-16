package CollectionFrameWork.set.TreeSet;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }

        System.out.println("Reversed sentence: " + reversedSentence.toString().trim());
    }
}
