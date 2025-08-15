package array;

import java.util.Arrays;

public class SumAllArrayElement {

    public static void main(String[] args) {
        int[] marks={20,23,12,34,89};
        int sum=0;

        //array gives sum method

      /*  sum= Arrays.stream(marks).sum();
        System.out.println(sum);*/



        for (int i=0 ; i<marks.length; i++){
            sum=sum+marks[i];
        }
        System.out.println(sum);
    }
}
