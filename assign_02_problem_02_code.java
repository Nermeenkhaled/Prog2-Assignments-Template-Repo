//Nermeen khaled 20216111
import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in) ;
        int x =input.nextInt(); 
        int i ; 
        for ( i = 1 ; i <= 12; i++ ) 
        {    
            System.out.println( x + " " +  "*" + " " + i + " "  + "="  + " " +  x* i ); 
            
            
            
        }
    }
}