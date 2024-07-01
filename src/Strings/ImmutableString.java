package Strings;
public final class ImmutableString {
    private final char[] value;

    public ImmutableString(String value) {
        this.value = value.toCharArray();
    }
    public int length() {
        return value.length;
    }

    public ImmutableString concat(ImmutableString other) {
        char[] newValue = new char[value.length + other.value.length];
        System.arraycopy(value, 0, newValue, 0, value.length);
        System.arraycopy(other.value, 0, newValue, value.length, other.value.length);
        return new ImmutableString(new String(newValue));
    }

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {
        ImmutableString str1 = new ImmutableString("Hello");
        ImmutableString str2 = new ImmutableString(" World");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        ImmutableString concatenated = str1.concat(str2);
        System.out.println("Concatenated: " + concatenated);

        System.out.println("Are str1 and concatenated are same object:  " + (str1 == concatenated));
        System.out.println("Do str1 and concatenated String are same:   " + str1.equals(concatenated));
    }
}

