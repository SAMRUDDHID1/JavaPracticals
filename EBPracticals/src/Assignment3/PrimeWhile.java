package Assignment3;

public class PrimeWhile {

	public static void main(String[] args) {

		 int i,m=0,flag=0;      
		 int n=8;//it is the number to be checked    
		 m=n/2;     
		 i=2;
		 if(n==0||n==1)
		 {  
		   System.out.println(n+" is not prime number");      
		 }
		 else{  
		   
			 while(i<=m){      
		     if(n%i==0)
		     {      
		     System.out.println(n+" is not prime number");
		     i++;
		     flag=1;      
		     break;      
		     }      
		    }      
		   if(flag==0) 
		   { System.out.println(n+" is prime number"); }  
		  }
		}    
		
	

	}


