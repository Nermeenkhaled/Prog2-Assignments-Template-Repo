import java.util.Scanner ;
//Nermeen khaled 20216111
public class Main
{
	public static void main(String[] args) {
	    
	     int a = 0 , b = 1 ; 
	     Scanner input = new Scanner(System.in);
	     int x = input.nextInt();
	     if ( x == 1) System.out.println(a) ;
	     else if( x==2) System.out.println(a + " "+ b + " ") ;
	     else {
	         System.out.print(a + " " + b + " "); 
	     for ( int i = 2 ; i < x ; i++){
	        int result = a +b ;
	        System.out.print(result + " ");
	        a=b ;
	         b = result; 
	     }
	     }
	     
	    
    
}
}
