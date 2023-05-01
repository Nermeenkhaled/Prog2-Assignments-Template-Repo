// nermeen khaled 20216111 
import java.util.* ;
public class Main
{
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(); 
		int [] arr = new int [x];
		for (int i =0 ; i < x ; i++) {
		   arr[i]= input.nextInt();}
		    for (int i = 0 ; i<x; i++){
		        if (arr[i] <0 ) System.out.print(2 + " ");
		        else if (arr[i] >0 ) System.out.print(1 + " ");
		        else 
		        System.out.print(0 + " ");
		        
		            
		            
		        }
		    }
}
