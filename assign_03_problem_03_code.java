//Nermeen khaled 20216111
import java.util.Scanner ;
public class Main
{
	public static void main(String[] args) {
	    
	     Scanner input = new Scanner(System.in);
	     int x = input.nextInt();
	     int z = 1 ; 
	     for ( int i = 1 ; i <= x ; i++){
	        if (z % 4 ==0 ){
	            z++ ; 
	            System.out.println("PUM") ;
	            i-- ; 
	            continue;
	            
	        }  
	       
	        System.out.print(z + " ") ;
	           z++; 
	         System.out.print(z + " ") ;
	          z++;
	           System.out.print(z + " ") ;
	           z++;
	     }
           System.out.println("PUM");
	        
	     
	     }
}
