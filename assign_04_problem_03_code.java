//Nermeen khaled 20216111
import java.util.* ;
public class Main
{
	public static void main(String[] args) {
         boolean flag = false ; 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); 
		int [] arr = new int [n];
		for (int i =0 ; i < n ; i++) {
		   arr[i]= input.nextInt();}
		   int x =input.nextInt(); 
		    for (int i = 0 ; i<n; i++){
		        if (arr[i] ==x ){
		             System.out.println(i);
		             flag = true;
		             break;
		        }
		        }
		        if ( flag == false )System.out.println(-1);
		    }
}
