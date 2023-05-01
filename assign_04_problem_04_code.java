//Nermeen Khaled 20216111
import java.util.* ;
public class Main
{
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); 
		int [] arr = new int [n];
		for (int i =0 ; i < n ; i++) {
		   arr[i]= input.nextInt();}
		   
		    for (int i = 0 ; i<n; i++){
		        for (int j =i+1 ; j < n ; j++){
		            if (arr[j]<arr[i])
		            {
		                int a =0;
		                 a= arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
		                
		            }      
		       }
		        }
		        
		        
		          for (int i =0 ; i<n ;i++)
		          {
		              System.out.print(arr[i]+" ");
		          }  
	}		         
		    
}
