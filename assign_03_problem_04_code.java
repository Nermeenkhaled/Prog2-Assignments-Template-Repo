//Nermeen khaled 20216111
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int x = SC.nextInt();
        int arr[]=new int[x];
        int result =0 ;
        for(int i =1 ; i<=x; i++){
            int z=SC.nextInt();
            int y=SC.nextInt();
            if(z%2==1){
                int result1;
                int k =0;
                for (int j = 0; j < y ; j++){
                    k = k+ z + 2*j;
                }
                result1 = k;
                result = result1;
            }
            else{
                int result2;
                int m =0;
                z+=1;
                for (int j = 0; j < y ; j++){
                    m = m + z + 2*j;
                }
                result2 = m;
                result =result2;
            }
            arr[i-1]=result;
        }
        Arrays.stream(arr).forEach(System.out::println);   
    }
}
