package Array.ThreeDArray;
import java.util.Arrays;
import java.util.Scanner;
public class ThreeDDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 3;
        int departments = 3;
        int subjects = 3;
        int[][][] marks = new int[students][departments][subjects];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < departments; j++) {
                for (int k = 0; k < subjects; k++) {
                    System.out.println("Enter marks for Student "+(i+1)+" in Department "+(j+1)+" for Subject "+(k+1)+": ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
        System.out.println("Marks of students:");
        for (int i = 0; i < students; i++) {
            System.out.println("Marks array for Student "+(i+1)+": "+Arrays.deepToString(marks[i]));
        }
        System.out.println(Arrays.deepToString(marks));
    }
}

