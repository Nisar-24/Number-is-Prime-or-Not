import java.util.Scanner;
public class Practice{
public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner read=new Scanner(System.in);
	    int num=read.nextInt();
	    boolean isprime=true;
	     
	     if(num<=1){
	         isprime=false;
	     }
	     else{
	         for(int i=2;i<num;i++){
	             if(num%i==0)isprime=false;
	             break;
	         }
	     }
	     if(isprime){
	         System.out.println("Its a prime number");
	     }
	     else{
	         System.out.println("Not prime number");
	     }	     
	}
}
