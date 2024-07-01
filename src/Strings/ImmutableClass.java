package Strings;

public final class ImmutableClass {
    private final String author;
    private final String body;
    public ImmutableClass(String author, String body) {
        this.author = author;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Message{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
    public static void main(String[] args) {
        ImmutableClass message1 = new ImmutableClass("Sagar", "Hello");
        ImmutableClass message2 = new ImmutableClass("sandip", "Goodbye");
        System.out.println(message1);
        System.out.println(message2);
        System.out.println(message1 == message2);
        System.out.println(" " + message1.equals(message2));
    }
}
