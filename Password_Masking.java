import java.util.*;
import java.lang.StringBuffer;

public class Password_Masking {
    public static void main(String aaa[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Password");
        StringBuffer pwd = new StringBuffer(sc.nextLine());
        StringBuffer temp = new StringBuffer(pwd);
        
         for(int i=0;i<pwd.length();i++){
          pwd.setCharAt(i,'*');
        }
        System.out.println("Masked password is :");
        System.out.println(pwd);
        System.out.println("Do you want to reveal password (Yes/No)");
        String opt =sc.next();
        sc.close();
        if(opt.equals("Yes")){
         System.out.println(temp);
        }
        
           
       
    }
    
}
