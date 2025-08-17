package array;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int[] arr={2,4,1,5,2,0,4};
        int n=arr.length;
        int temp;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        System.out.println("array sort ascending order");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("array sort descending order");
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
