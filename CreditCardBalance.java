
import java.util.Scanner;

public class CreditCardBalance
{
    public static void main(String[] args)
    {
        double prevBalance = 0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the monthly payment");
        double monthlyPayment= keyboard.nextDouble( );
        double totalPayment = monthlyPayment;
        int month= 1;
        double balanceDue= 1000;
        
        while(balanceDue>0){
            balanceDue= balanceDue+balanceDue*(1.5/100)-100;
            System.out.println("PrevBalance: " + prevBalance);
            if (balanceDue < 0){
                totalPayment = totalPayment+prevBalance;
            } else {
                totalPayment= totalPayment+monthlyPayment;
                prevBalance=balanceDue;
                
            }
            System.out.println("Month:" + month + "    balance:" +balanceDue + "  total payments:" + totalPayment);
            month++;
            
        }
        month--;
      System.out.println("Final payment in the " + month + " the month:"+ prevBalance);
    }
    
    
    /**
     input: 11.5
     output:PrevBalance: 0.0
Month:1    balance:915.0  total payments:201.0
PrevBalance: 915.0
Month:2    balance:828.725  total payments:301.5
PrevBalance: 828.725
Month:3    balance:741.155875  total payments:402.0
PrevBalance: 741.155875
Month:4    balance:652.273213125  total payments:502.5
PrevBalance: 652.273213125
Month:5    balance:562.057311321875  total payments:603.0
PrevBalance: 562.057311321875
Month:6    balance:470.4881709917031  total payments:703.5
PrevBalance: 470.4881709917031
Month:7    balance:377.54549355657866  total payments:804.0
PrevBalance: 377.54549355657866
Month:8    balance:283.20867595992735  total payments:904.5
PrevBalance: 283.20867595992735
Month:9    balance:187.4568060993263  total payments:1005.0
PrevBalance: 187.4568060993263
Month:10    balance:90.26865819081618  total payments:1105.5
PrevBalance: 90.26865819081618
Month:11    balance:-8.377311936321576  total payments:1195.7686581908163
Final payment in the 11 the month:90.26865819081618


input:200
output:PrevBalance: 0.0
Month:1    balance:915.0  total payments:400.0
PrevBalance: 915.0
Month:2    balance:828.725  total payments:600.0
PrevBalance: 828.725
Month:3    balance:741.155875  total payments:800.0
PrevBalance: 741.155875
Month:4    balance:652.273213125  total payments:1000.0
PrevBalance: 652.273213125
Month:5    balance:562.057311321875  total payments:1200.0
PrevBalance: 562.057311321875
Month:6    balance:470.4881709917031  total payments:1400.0
PrevBalance: 470.4881709917031
Month:7    balance:377.54549355657866  total payments:1600.0
PrevBalance: 377.54549355657866
Month:8    balance:283.20867595992735  total payments:1800.0
PrevBalance: 283.20867595992735
Month:9    balance:187.4568060993263  total payments:2000.0
PrevBalance: 187.4568060993263
Month:10    balance:90.26865819081618  total payments:2200.0
PrevBalance: 90.26865819081618
Month:11    balance:-8.377311936321576  total payments:2290.268658190816
Final payment in the 11 the month:90.26865819081618

input:-100
output:PrevBalance: 0.0
Month:1    balance:915.0  total payments:-200.0
PrevBalance: 915.0
Month:2    balance:828.725  total payments:-300.0
PrevBalance: 828.725
Month:3    balance:741.155875  total payments:-400.0
PrevBalance: 741.155875
Month:4    balance:652.273213125  total payments:-500.0
PrevBalance: 652.273213125
Month:5    balance:562.057311321875  total payments:-600.0
PrevBalance: 562.057311321875
Month:6    balance:470.4881709917031  total payments:-700.0
PrevBalance: 470.4881709917031
Month:7    balance:377.54549355657866  total payments:-800.0
PrevBalance: 377.54549355657866
Month:8    balance:283.20867595992735  total payments:-900.0
PrevBalance: 283.20867595992735
Month:9    balance:187.4568060993263  total payments:-1000.0
PrevBalance: 187.4568060993263
Month:10    balance:90.26865819081618  total payments:-1100.0
PrevBalance: 90.26865819081618
Month:11    balance:-8.377311936321576  total payments:-1009.7313418091838
Final payment in the 11 the month:90.26865819081618
 **/
}