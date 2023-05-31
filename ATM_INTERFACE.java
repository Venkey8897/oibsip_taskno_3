import java.util.Scanner;  
class ATM_INTERFACE
{  
	public static void main(String args[])  
	{  
		int balance = 100000;
		int withdraw;
		int deposit;  
		Scanner sc = new Scanner(System.in);
		String User_id = "Venkey";
		int User_pin = 12345;
		System.out.print("Enter your user id:");
		String id = sc.nextLine();
		System.out.print("Enter your user pin:");
		int pin = sc.nextInt();
		if(User_id.equals(id) && User_pin==pin)
		{

			while(true)  
			{  
            		System.out.println("Select any option from below");
				System.out.println("Choose 1 for Withdraw");  
            		System.out.println("Choose 2 for Deposit");  
            		System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 to Transfer Money"); 
            		System.out.println("Choose 5 for EXIT"); 
				System.out.println("======================================================="); 
            		System.out.print("Choose the operation you want to perform: ");  
            		int choice = sc.nextInt();  
            		switch(choice)  
            		{  
				case 1:  
					System.out.print("Enter money to be withdrawn: ");  
					withdraw = sc.nextInt();  
					if(balance >= withdraw)  
					{
						balance = balance - withdraw;  
            				System.out.println("Please collect your money " +withdraw);  
        				}  
					else  
       				{  
            				System.out.println("Insufficient Balance");  
       				}  
        				System.out.println("");  
        				break;  
   
				case 2:  
					System.out.print("Enter money to be deposited: "); 
        				deposit = sc.nextInt();  
        				balance = balance + deposit;  
        				System.out.println("Your Money "+ deposit +" has been successfully deposited");  
        				System.out.println("");  
        				break;  

				case 3:  
        				System.out.println("Available Balance : " +balance);  
        				System.out.println("");  
       				break;  

				case 4:
					System.out.print("Enter Account number to be transferred: ");
					int Account_no = sc.nextInt();
					System.out.print("Enter amount to be transfered:");
					int amount = sc.nextInt(); 
					System.out.println("Amount transfered successfully to "+Account_no);
					balance = balance-amount;
					System.out.println("");
					break;

				case 5:  
        				System.exit(0);

					
				}  
			}  
		}
		else
		{
			System.out.println("Enter a valid user_id and User_pin");
		}  
	}  
}