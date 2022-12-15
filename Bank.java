import java.util.*;
public class Bank
{
public static void main(String[] args)
{
    try (Scanner obj = new Scanner(System.in)) {
		int t = 10000, w, n, d;
		// t = total, w = withdraw, d = deposit
		System.out.println("Enter 1 if you want to withdarw or Enter 2 if you want to deposit");
		n = obj.nextInt();
		switch(n)
		{
		  case 1:
		    	
		System.out.println("Enter the amount you want to withdraw");
		w = obj.nextInt(); 
		if (w<t)
		{
			t = t-w;
			System.out.println("You have withdraw " +w+ " rupees");
			System.out.println("Remaining amount in your account is: "+t);
		}
		if (w>t)
		{
			System.out.println("Insuficent balanc");
		}
		case 2:
		
		if (n==2)
		{
			System.out.println("Enter the amount you want to deposit");
			d = obj.nextInt(); 
			t = t+d;
			System.out.println("You have deposited " +d+ " rupees");
			System.out.println("Now your account balance is "+t);
		}		
		}
	}
}
}