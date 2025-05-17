import java.util.Scanner;

public class SimpleCalculator {
     public float displayResult(int num1,int num2,String operator){
        switch (operator) {
            case "+":
                return num1+num2;
            
            case "/":
                if(num2==0)
                    System.out.println("Not Divisible by Zero");
               
                return num1/num2;
           
            case "-":
                return num1-num2;
           
            case "*":
                return num1*num2;
            
            case "%":
                 if(num2==0)
                    System.out.println("Not Divisible by Zero");
       
                 return num1%num2;
         

            default:
                System.out.println("Enter Coorect Opreator");
                return 0;
        }
    }
       public static void main(String[] args) {
        String operator;
        int num1,num2;

        System.out.println("Enter 2  numbers :");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        
        System.out.println("Enter a Operator (+,-,*,/,%) :");
        operator=sc.next();
        sc.close();
        SimpleCalculator calculate=new SimpleCalculator();
        System.out.println("Result :" +calculate.displayResult(num1,num2,operator));

    }
   
    }


