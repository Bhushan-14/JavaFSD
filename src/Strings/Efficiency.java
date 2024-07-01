package Strings;

public class Efficiency {
    public static void main(String[] args) {
        String input = "Sagar";
        int n = 10000;

        long startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            String str = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                str = str + input.charAt(i);
            }
        }
        long endTime = System.currentTimeMillis();
        long durationString = endTime - startTime;
        System.out.println("Time taken by String: " + durationString + " ms");

        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            StringBuilder stringBuilder = new StringBuilder(input);
            stringBuilder.reverse();

        }
        endTime = System.currentTimeMillis();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + durationStringBuilder + " ms");

        startTime = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            StringBuffer stringBuffer = new StringBuffer(input);
            stringBuffer.reverse();
        }
        endTime = System.currentTimeMillis();
        long durationStringBuffer = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + durationStringBuffer + " ms");
    }
}
