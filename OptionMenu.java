import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;


public class OptionMenu extends Account{
	Scanner sc = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x = 1;
		do {
			try {
				data.put(952141, 191904);
				data.put(989947, 71976);
				
				System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your customer number:");
				setCustomerNumber(sc.nextInt());
				System.out.println("Enter your pin number:");
				setPinNumber(sc.nextInt());
				
			}
			catch(Exception e) {
				System.out.println("\n"+"Invalid character(s).only Numbers"+"\n");
				x=2;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			
			if(data.containsKey(cn) && data.get(cn)==pn) {
				getAccountType();
			}
			else {
				System.out.println("\n"+"Wrong Entry."+"\n");
			}
		}while(x==1);
	}
	
    public void getAccountType() {
    	System.out.println("Select the account you want to access: ");
    	System.out.println("Type 1 - Checking Account");
    	System.out.println("Type 2 - Saving Account");
    	System.out.println("Type 3 - Exit");
    	 
    	int selection = sc.nextInt();
    	switch(selection) {
    	case 1:
    		getChecking();
    		break;
    		
    	case 2:
    		getSaving();
    		break;
    		
    	case 3:
    		System.out.println("Thank you for using ATM!");
    		break;
    		
    	default:
    		System.out.println("\n"+"Please try again."+"\n");
    		getAccountType();
    	}
    	
    }	
	
    public void getChecking() {
    	System.out.println("Checking Account.");
    	System.out.println("Type 1- Withdraw fund");
    	System.out.println("Type 2- Deposit fund");
    	System.out.println("Type 3- Exit");
    	System.out.println("Choice: ");
    	
    	int selection = sc.nextInt();
    	switch(selection) {
    	
    	case 1:
    		getCheckingWithdrawInput();
    		getAccountType();
    		break;
    		
    	case 2:
       		getCheckingDepositInput();
    		getAccountType();
    		break;
    		
    	case 3:
    		System.out.println("Thank you for using ATM!");
    		break;
    		
    	default:
    		System.out.println("\n"+"Please try again."+"\n");
    		getAccountType();
    	}
    }
    
    public void getSaving() {
    	System.out.println("Welcome to Saving Account.");
    	System.out.println("Type 1- Withdraw fund");
    	System.out.println("Type 2- Deposit fund");
    	System.out.println("Type 3- Exit");
    	System.out.println("Choice: ");
    	
    	int selection = sc.nextInt();
    	switch(selection) {
    	
    	case 1:
    		getSavingWithdrawInput();
    		getAccountType();
    		break;
    		
    	case 2:
       		getSavingDepositInput();
    		getAccountType();
    		break;
    		
    	case 3:
    		System.out.println("Thank you for using ATM!");
    		break;
    		
    	default:
    		System.out.println("\n"+"Please try again."+"\n");
    		getAccountType();
    	}
    }


}
