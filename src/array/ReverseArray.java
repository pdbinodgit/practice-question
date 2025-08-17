package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {2,4,1,4,5,7,9};
        int n=arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
