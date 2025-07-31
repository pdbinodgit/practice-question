
import java.util.Arrays;
import java.util.List;

public class HighestNumberInList {
    public static void main(String[] args) {
        List list= Arrays.asList(1,3,2,6,4,9,1,89);

        int length=list.size();
        int largeNumber=0;
        int i;
        System.out.println("List is "+list);
        System.out.println("length of list "+length);

        for ( i=0;i<length;i++){
            if (i==0){
                largeNumber= (int) list.get(i);
            }else {
                int number = (int) list.get(i);
                if (number>largeNumber){
                    largeNumber= (int) list.get(i);
                }
            }
        }
        System.out.println("Large number is "+largeNumber);
    }
}
