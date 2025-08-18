package array;

import java.util.Arrays;

public class RotateAnArray {
    
    // right shift by k number
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=2;
        int size=arr.length;
        int[] rotate=new int[size];

        for (int i=0;i<k;i++){
            rotate[i]=arr[size-k+i];
        }

        for (int i=k;i<size;i++){
            rotate[i]=arr[i-k];
        }
        System.out.println("Right Rotated Array: " + Arrays.toString(rotate));

    }
    
}
