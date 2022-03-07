package MissNumbers;
import java.util.*;

public class MissedNumbers {
    public static int[] sort(int arr[]){
        int k =arr.length;

        for(int i=0;i<k-1;i++){
            int min_index = i;

            for(int j=i+1;j<k;j++)
            {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void missing_number(int arr1[],int sum1)
    {
        int max = arr1[arr1.length-1];
        int min = arr1[0];

        int g = max - min + 1;
        int true_total = g*(max+min)/2;

        if(g == arr1.length)
        {
            System.out.print("There is no missing numbers");
        }
        else
        {
            int miss = true_total-sum1;
            System.out.print("Missing Number is "+miss);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sequence size");
        int n = in.nextInt();

        System.out.println("Enter the sequence");
        int d[] = new int[n];
        int sum = 0;

        for(int i=0;i<n;i++){
            d[i] = in.nextInt();
            sum = sum + d[i];
        }

        int k[] = sort(d);
        missing_number(k,sum);
    }


}
