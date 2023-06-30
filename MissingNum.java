import java.io.*;
import java.util.*;
 
class MissingNum 
{
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println("");
        System.out.println("Missing Number is:"+ans);
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 7, 5, 6, 2 };
        System.out.print("Array :");
        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]);
        }
        int n = arr.length;
        findMissing(arr, n);
    }
}