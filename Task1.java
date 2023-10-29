// Random number game: Task1

import java.util.*;

class Task1{
    public static void main(String args[]){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int maxattempts=7;
       
        int attempts=0;
        int anum;
        int tattempts=0;
        int total=0;
  

        System.out.println("Number guesser game begins");
        System.out.println("your guess number should be between 0 to 100");
        System.out.println("enter 1 to start the game");
        int option=sc.nextInt();
        
        while(option==1){
        int randomnum=r.nextInt(100);
      
         do
            {
                
                System.out.println("enter your guess ");
                int num=sc.nextInt();
                attempts++;
                if(num==randomnum){
               
                total=attempts+tattempts;
                System.out.println("your gussed number is coorect ");
                System.out.println("you guessed the correct number in :"+total+"  attempts");
                break;
                }
                else if(attempts==maxattempts){
                    System.out.println("u were not able to guess the correct number");
                    break;
                }
                else if(num<randomnum){
                    System.out.println("too low");
                }
                
                else if(num>randomnum){  
                System.out.println("too High");
                }

            }while(attempts<maxattempts);
            System.out.println("enter any num if u want to exit the game");
            System.out.println("Press 1 to play again");
            anum=sc.nextInt();
            if(anum==1){
                option=1;
                attempts=0;
            }
            else{
                option=0;
            }
        }
        sc.close();
    }

}