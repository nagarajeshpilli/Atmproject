import java.util.HashMap;
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
