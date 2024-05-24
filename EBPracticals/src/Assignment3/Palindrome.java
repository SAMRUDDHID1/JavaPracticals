package Assignment3;

public class Palindrome {

	public static void main(String[] args) {
      
		int num,r,rev=0;
		int value;
        num =543;
        value=num;
        
        while(num>0) 
        
        {
        	r = num %10;
        	rev = rev*10+r;
        	num = num/10;
       }
        System.out.println("reverse is: "+rev);
        
        if(rev == value)
        System.out.println("number is palindrome");
        else
        System.out.println("number is not a palindrome");
	
	   
        	
	}

}
