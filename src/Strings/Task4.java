package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter a String: ");
        String name = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: " + entry.getKey() + " || value: " + entry.getValue());
        }
    }
}
