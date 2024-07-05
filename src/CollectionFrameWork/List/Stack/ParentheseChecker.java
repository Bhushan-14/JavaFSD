package CollectionFrameWork.List.Stack;
import java.util.Scanner;
import java.util.Stack;
public class ParentheseChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with parentheses: ");
        String input = sc.nextLine();
        if (isBalanced(input)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
    }
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}