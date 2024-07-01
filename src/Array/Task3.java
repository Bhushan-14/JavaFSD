package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of First array");
        int n=sc.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the array first element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the size of second array");
        int m=sc.nextInt();
        int brr[] =new int[m];
        System.out.println("Enter the array second element");
        for(int i=0;i<brr.length;i++){
            brr[i]=sc.nextInt();
        }
        int count=0;
        if(m==n){
            for(int i=0;i<n;i++){
                if(arr[i]==brr[i]){
                    count++;
                }
            }
        }


        if(count==n){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }



    }
}