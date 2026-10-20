package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false

 */

public class SpringSeason {
    boolean isSpringSeason(int month,int date){
        if((month==3 && date>19) || (month==4)|| (month==5 )|| (month==6 && date<21)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take inputs month,date
        int month=sc.nextInt();
        int date=sc.nextInt();

        // to call method
        SpringSeason time=new SpringSeason();
        boolean result=time.isSpringSeason(month,date);

        // to print the outcome
        if(result){
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

    }
}
