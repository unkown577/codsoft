import java.util.Scanner;
public class Task2 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            double avg,num;
            double sum=0;

            System.out.println("enter the number of subjects:");
            int numofs=sc.nextInt();
            for(int i=1;i<=numofs;i++){
            System.out.println("enter the marks of subject :"+i);
            num=sc.nextInt();
            sum=sum+num;
            }
            avg=sum/numofs;
            double percentage=avg;
            System.out.println("the average is:"+avg);
            System.out.println("the percentage is:"+percentage+"%");
            if(percentage>=90)
            {
            System.out.println("YOUR grade is :A");
            }
            else if(percentage<90 && percentage>75)
            {
            System.out.println("YOUR grade is :B");
            }
            else if(percentage<=75 && percentage>60)
            {
            System.out.println("YOUR grade is :C");
            }
            else{
            System.out.println("YOUR grade is :D");
            }
            sc.close();
        }
}
