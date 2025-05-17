import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor_Game {

    static void details(){
        System.out.println("Enter your Choice : \n > 0 . Rock \n > 1 . Paper \n > 2 . Scissor \n > 3 . Exit");

    }
    
    
    
    public static void main(String[] args) {
        Rock_Paper_Scissor_Game game =new Rock_Paper_Scissor_Game();
        Scanner sc =new Scanner(System.in);
        Random random=new Random();
        int userscore=0,computerscore=0,draw=0;
    while (true){
        details();
       System.out.println("");
        int userInput=sc.nextInt();
        
        if (userInput == 3) {
            System.out.println("Exiting the game. Thank you for playing!");
            
            break;
        }
        if (userInput < 0 || userInput > 3) {
            System.out.println("Invalid input. Please try again.");
            continue;
        }
        int computerInput=random.nextInt(3);
        
        if(userInput == computerInput){
            System.out.println("Draw");
            draw++;
        }
        else if(userInput == 0 && computerInput== 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("You WIN ! ...");
            userscore ++;
        }
        else {
            System.out.println("Computer Win !....");
            computerscore ++;
        }
        System.out.println("");

        if(computerInput==0)
            System.out.println("Computer Input : 'Rock'");
        else if(computerInput==1)
            System.out.println("Computer Input : 'Paper'");
        else 
            System.out.println("Computer Input : 'Scissor'");
        System.out.println("    ______ ");
    }
    sc.close();
    System.out.println("Final Score \n"+"User Score :"+userscore+"\nComputer Score :"+computerscore+"\nDraw :"+draw);
    }
}
