import java.sql.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name="HELLO";
        String reverse="";

        for (int i=name.length()-1; i>=0;i--){
            reverse=reverse+name.charAt(i);
        }
        System.out.println("Original "+name);
        System.out.println("reverse "+reverse);


        /*
        Using array
         */
        char[] arrayChar=name.toCharArray();
        System.out.println("orginal ");
        System.out.println("array size is"+arrayChar.length);
        reverse="";
        for (int i=arrayChar.length-1;i>=0;i--){
            reverse=reverse+arrayChar[i];
        }
        System.out.println("reverse "+reverse);
    }
}
