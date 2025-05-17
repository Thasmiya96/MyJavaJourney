import java.util.Scanner;
import java.util.Arrays;
public class E_Commerce_Order_Processing {
    public static void main(String[] args) {
        int order_time[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter processing Time of Each order : ");
    
        for(int i =0; i<order_time.length;i++){
            order_time[i]=sc.nextInt(); }
        
        sc.close();
        Arrays.sort(order_time);
        System.out.println("Fastest Processing: "+order_time[0] +" minutes ");
        System.out.println("Slowest Processing: "+ order_time[order_time.length-1]+" minutes "); 
        int count = 0 ;
        for (int time : order_time) {
            if (time <= 30) count++;
        }
        System.out.println("Orders completed within 30 minutes: " + count);
       
        int length=order_time.length;
        int medium=length/2;
        if(length > 0){
            if(length % 2==0)
                System.out.println("Median Processing Time: "+order_time[medium-1]+" And "+order_time[medium]+" Minutes");
            else
               System.out.println(order_time[medium]);
        
        }
        
    }
    
}
