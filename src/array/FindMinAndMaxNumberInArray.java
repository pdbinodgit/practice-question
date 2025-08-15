package array;

import java.util.Arrays;

public class FindMinAndMaxNumberInArray {
    public static void main(String[] args) {
        int[] arr={10,3,7,3,4,2};
        int min=0;
        int max=0;

        //below loop for minimum value

        for (int i=0; i<arr.length;i++){
            if (i==0){
                min=arr[i];
            }else {
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        System.out.println("min: "+min);

        //below loop for maximum number

        for (int i=0;i<arr.length; i++){
            if (i==0){
                max=arr[i];
            }else {
                if (max<arr[i]){
                    max=arr[i];
                }
            }
        }
        System.out.println("max number is "+max);

    }
}
