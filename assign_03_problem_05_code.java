//Nermeen khaled 20216111
import java.util.* ;
public class Main
{
	public static void main(String[] args) {
	    int sum = 0;
		Scanner input = new Scanner(System.in);
		int x = input.nextInt(); 
		for (int i =0 ; i < x ; i++) {
		   sum=0;
		    int y = input.nextInt(); 
		    int z = input.nextInt(); 
		    int max =Math.max(y,z);
		      int min =Math.min(y,z);
		    for (int j =min+1 ; j<max ; j++){
		        if (j%2 !=0){
		            sum = sum+j ;
		            
		        }
		    }
		    System.out.println(sum);
		}
	}
}
