package array;

public class CountEvenAndOddNumberOfElement {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,4,10,11,13,14};
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
                evenNumber=evenNumber+1;
            }else {
                oddNumber=oddNumber+1;
            }

        }

        System.out.println("total even number are "+evenNumber);
        System.out.println("total odd number are "+oddNumber);
    }
}
