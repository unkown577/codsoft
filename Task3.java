import java.util.Scanner;
public class Task3 {
    static Scanner sc=new Scanner(System.in);
    static double Balance;
    public static void main(String Args[]){
      
        System.out.println("****************Welcome To YGR'S Bank*****************");
        System.out.println("LIST OF OUR SERVICES IS GIVEN BELOW ");
        System.out.println("1:DEPOSIT");
        System.out.println("2:WITHDRAW");
        System.out.println("3:BALANCE");
        System.out.println("4:EXIT");
        int option;
        do{
        System.out.println("Enter your option");
         option=sc.nextInt();
            double amount;
            switch(option){
                case 1:{
                System.out.println("Enter the amount to be deposited");
                amount=sc.nextInt();
                Deposit(amount);
                break;
                }
                case 2:{
                System.out.println("Enter the amount to be Withdrawn");
                amount=sc.nextInt();
                Withdraw(amount);
                break;
                }
                case 3:{
           
                AccBalance();
                System.out.println("Your balance is:"+AccBalance());
                break;
                }
            }
        }while(option<=3 && option>0);
    }    
    public static double AccBalance(){
    return Balance;
    }
    public static void Deposit(double a){
    Balance=Balance+a; 
    }
    public static void Withdraw(double b){
    Balance=Balance-b;
    }
}
