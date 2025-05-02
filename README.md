
💳 ATM Project (Java)
This Java-based ATM Project is a simple console application that simulates the basic functionalities of an ATM machine. It allows users to interact with their bank account using a menu-driven interface. The main features of the project include:
STEP 1:
💳 ATM  (Java)
* Firstly we can create a class named as (Atm)
* They are in private condition then we initialize setters and getters and parameterized constructor and default constructor.
* We create a default constructor
* In this case we doesn't use the parameterized constructor.
* They can use with setters and getters.
* later we can use genterate a toString method
* public class Atm {
	private double balance;      //declare a variable
	private double depositAmount;
	private double withdrawAmount;
	// they are in private condition then we initialize setters and getters and parameterized constructor and default constructor
	// firstly we create a default constructor
	
	public Atm() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	// in this case we doesn't use the parameterized constructor
	// they can use with setters and getters
	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	
	
	

}


STEP 2 :
💳 ATM INTERFACE(Java)
* We know that how the atmINterface will be pictured.
* we can create public class (AtmInterface)
* make them on public void viewbalance();
* And withdrawAmount , depositAmount, view miniStatement will be declared
* These are all are abstarct methods then we provide a body
* public interface AtmInterface {
    public void viewBalance();
    public void withdrawAmount(double withdrawAmount);
    public void depositAmount(double depositAmount);
    public void viewMinistatement();
    
    
}

STEP 3 :
💳 ATM OPERATION(java)
* In this operation the ATM OPERATION implements the ATM INTERFACE.
* In this we can add unimplemented methods
* View Balance: Check the current balance of your account.
* Withdraw Amount: Withdraw a specific amount from your account (if sufficient balance is 
  available). On this we can implement if else method
* Deposit Amount: Deposit money into your account.
* View Mini Statement: Display a short history of recent transactions (deposits and withdrawals).
* import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Atmoperationimpl implements AtmInterface {
    Atm atm=new Atm();
    Map<Double,String> ministmt=new HashMap<>();
    public void viewBalance() {
        System.out.println("Available Balance:" + atm.getBalance());
    }

    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%500==0){
            if(withdrawAmount<=atm.getBalance()){
                System.out.println("collect  tthe cash"+withdrawAmount);
                atm.setBalance(atm.getBalance()-withdrawAmount);
                ministmt.put(withdrawAmount,"amount withdrawn");

                viewBalance();
            }
            else{
                System.out.println("insufficent balance");
            }
        }
        else{
            System.out.println("enter the amount in terms of 500");
        }
    }


    public void depositAmount(double depositAmount) {
        System.out.println("depositedAmount is:" +depositAmount);
        atm.setBalance(atm.getBalance()+depositAmount);
        ministmt.put(depositAmount,"deposited succesfully");
        viewBalance();
    }

    @Override
    public void viewMinistatement() {
       Set<Double> set=ministmt.keySet();
       for(Double d:set){
        System.out.println(d+"="+ministmt.get(d));
       }
    }
    
}

 

STEP 4 : 
💳 USER INTERFACE (Java) :
* we can create main class method .
* we can create a new object named as scan and impl
* In the Interface the ATM have a corrected ATM NUMBER and ATM PIN .We should give a proper ATM NUMBER /ATM PIN . Otherwise it leads to an INCORRECT PIN / ATM NUMBER
* If the input statement is correct then we should implent an if and if else method we should initialized
* we should intialized the while loop while the condition is true the code will executed . otherwise it is INCORRECTED.
* import java.util.Scanner;

public class UserInterface {
    private static int status;
    public static void main(String[] args) {
        Atmoperationimpl impl=new Atmoperationimpl();
        try (Scanner scan = new Scanner(System.in)) {
            int atmnumber=123456;
            int atmpin=123;
            System.out.println("Enter the Atm Number");
            int atmnum2=scan.nextInt();
            System.out.println("enter the atm pin");
            int atmpin2=scan.nextInt();
            if (atmnumber==atmnum2 && atmpin==atmpin2){
                while ((true)) {
                System.out.println("viewAvailable\n 2.withdrawAmount\n 3.depositAmount\n 4.viewMinistatement\n 5.exit");
                System.out.println("enter the choice:");
                int ch=scan.nextInt();
                if(ch==1){
                    impl.viewBalance();
                }
                else if (ch==2){
                    System.out.println("enter the amount to be withdrawn");
                    double withdrawAmount=scan.nextDouble();
                    impl.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("enter the amount to deposit");
                    double depositAmount=scan.nextDouble();
                    impl.depositAmount(depositAmount);
                }
                else if(ch==4){
                    impl.viewMinistatement();
                }
                else if (ch==5){
                    System.out.println("Collect your ATM card \n Thank you");
                    System.exit(status);
                }
                }
            }
            else{
                System.out.println("incorrect atm number or pin");
            }
        }
    }
}



	


