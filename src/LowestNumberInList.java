import java.util.Arrays;
import java.util.List;

public class LowestNumberInList {
    public static void main(String[] args) {
        List list= Arrays.asList(15,5,3,2,6,9,10);
        int i;
        int lowestNumber=0;
        int length=list.size();


        System.out.println("List is "+list);
        System.out.println("size "+list.size());
        for (i=0;i<length;i++){
            if (i==0){
                lowestNumber=(int)list.get(i);
            }else {
                int number =(int)list.get(i);
                if (number<lowestNumber){
                    lowestNumber=number;
                }
            }
        }
        System.out.println("Lowest number is "+lowestNumber);

    }
}
