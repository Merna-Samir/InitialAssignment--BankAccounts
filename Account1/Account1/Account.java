package Account1;
import java.util.Scanner;
public class Account {

		public static void main(String[] args) {

	int number=0;

	int balance = 5000 ;

	Scanner input = new Scanner(System.in);

	while(number!=4 ) {

		System.out.println(" 1.Withdraw the money \n 2.Deposit the money \n 3.Check the balance \n 4.Exit ");

		System.out.print(" choose the operation:");
		 number = input.nextInt();

		if (number==1){

			System.out.print(" Enter money to be Withdraw:");
		    int Withdraw = input.nextInt();
		    
		    if(Withdraw > 0 && Withdraw < balance  ) {

		    balance = balance - Withdraw ;	
		    
		    System.out.println(" Collect your money \n"); 
		   }
		    else if (Withdraw > balance) {
		    	System.out.println(" balance is not sufficient \n");
		  
		    }
		    	else 
		    		System.out.println(" Error \n");
		      }	
		
		else if(number==2){
	    	
			System.out.print(" Enter money to be deposited:");
		    int deposited = input.nextInt();

		    if (deposited > 0) {
		    balance = balance + deposited ;	

		    System.out.println(" Your money has been deposited successfully \n");
	}
		    else 
	    		System.out.println(" Error \n");
		}

		
		else if (number==3) 
		
			System.out.println(" Your Balance:" + balance + "\n");
		
	}
	       System.out.println(" Thank You"); 
		}

	}


