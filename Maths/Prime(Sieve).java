import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
	    int a=10;
	    int n=30;
		boolean arr[]=new boolean[n+1];
	    Arrays.fill(arr,true);
		arr[0]=false;
		arr[1]=false;
	
		for(int i=2;i<=Math.sqrt(n);i++){
		    if(arr[i]){
		        for(int j=i*i;j<=n;j=j+i)
		        arr[j]=false;
		    }
		}
		for(int i=a;i<n+1;i++){
		    if(arr[i])
		    System.out.print(i+" ");
		}
		
	}
}

//removing all multiples except it's first occurence.Left out elements are prime.
