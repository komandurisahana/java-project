public class DrugExpiry.java
{
    public static void main(String[] args)
    {
        double remainingEffect=100;
        int month=0;
        while( remainingEffect>50){
            System.out.println("month:"+month+"   effectiveness:"+ remainingEffect); 
                month++;
                remainingEffect=remainingEffect*0.96;
        }
        System.out.println("month:"+month+"   effectiveness:"+ remainingEffect+"DISCARDED"); 
    }
}
