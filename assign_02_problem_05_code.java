// Nermeen Khaled 20216111 
import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);
    int t , j;
    long x ;
      t = input.nextInt();
    for (int i = 1; i <= t ; i++)
      {
	   x = input.nextLong();
	for ( j = 2; j <= x/2 ; j++)
	  { 
	     
	    if (x % j == 0)
	     
	      break;
	  }
	if (x % j != 0)
	    System.out.println ("Prime");
	  else 	System.out.println ("Not");
	  
	  }
}
}
