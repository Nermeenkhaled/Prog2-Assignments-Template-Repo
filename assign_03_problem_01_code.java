// Nermeen khaled 20216111
import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) {
	 int x  ; 
	 Scanner input = new Scanner(System.in);
	 x = input.nextInt();
	 for ( int i = 1 ; i <= x ; i++) // i for rows
	 {
	     for (int j = 1 ; j <= x-i; j++) // j for spaces
	     { 
	         System.out.print(" ") ;}
	         for (int k = 1 ; k <= (i*2-1) ; k++) // k for columns 
	         {
	             System.out.print("*");
	         }
	        System.out.println();
	     }
	     
	 
} 
}