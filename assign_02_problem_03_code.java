//Nermeen khaled 20216111 
import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in) ;
        int x =input.nextInt(); 
        int i , j; 
        for ( i = 1 ; i <= x; i ++ ) 
        {    
            for ( j = 1 ; j <= i ; j++) {
            
            System.out.print("*") ; }
            System.out.println();
        }
        
    }
}
