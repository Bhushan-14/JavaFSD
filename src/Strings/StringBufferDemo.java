package Strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        String name = "Sagar";
        StringBuffer s = new StringBuffer(name);
        System.out.println("Reversed using StringBuffer: " + s.reverse());
        char[] newName = new char[name.length()];
        for (int i = 0; i < name.length(); i++) {
            newName[i] = name.charAt(name.length() - 1 - i);
        }
        String reversedName = new String(newName);
        System.out.println("Reversed using char array: " + reversedName);

        System.out.println(name.concat(" Don"));
        System.out.println(s.capacity());
        System.out.println(s.length());
        s.setCharAt(1, 'b');
        System.out.println(s);

    }
}
