import java.util.Random;
import java.util.Scanner;

public class Number_Guessing_Game{
    int noofguesses=0;
    int userinput;
    int computerguess;
    Scanner sc=new Scanner(System.in);
    public Number_Guessing_Game(){
        Random random=new Random();
         computerguess=random.nextInt(50);
    }

    public int getnoofguesses(){
       return noofguesses;
    }
    public void  setnoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }

    public void getUserInput(){
        
        System.out.println("Guess the Number or 111 to exit :");
        userinput=sc.nextInt();
        
    }

    public boolean isCorrectNumber(){
        noofguesses ++;
        if(userinput==111){
            System.out.println("Exiting Game ..... Thanks for playing ! ");
            return false;
        }
        if(userinput == computerguess){
            
            System.out.println("You Win !...");
            System.out.format("The number is %d\n and your guessed attempts %d",computerguess,noofguesses);
            return true;
        }
        else if (userinput > computerguess){
            System.out.println(userinput+" is Greather... ");
            return false;
        }
        else if(userinput < computerguess){
            System.out.println(userinput+" is less ..");
            return false;
        }
        else{
            System.out.println("Sorry your input is invalid ..");
        
        }
        
        return false;
        }
    public static void main(String[] args) {
            Number_Guessing_Game game=new Number_Guessing_Game();
      
            while(true)
            {
                game.getUserInput();
              boolean result=  game.isCorrectNumber();
              if(result || game.userinput==111){
                System.out.println("Exiting game .. Thanks for playing....");
                    break;
              }
            }
     
    }
    

}