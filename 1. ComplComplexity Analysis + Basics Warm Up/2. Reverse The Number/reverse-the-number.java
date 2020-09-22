import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int[] arr = new int[a];
	    for(int i=0; i<a; i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<a;i++){
	        System.out.println(reverse(arr[i]));
	    }
	
	}
	static int reverse(int a){
	    int n=0,lastDigit=0;
	    while(a>0){
	        n=(n*10)+(a%10);
	        a=a/10;
	    }
	    return n;
	}
}
