import java.util.Scanner;

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
