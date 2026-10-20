package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class AthleteRuns {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3= sc.nextInt();
        int perimeter=side1+side2+side3;
        int totalRounds=(int)Math.ceil(5000.0/perimeter);
        System.out.println("The total number of rounds the athlete will run is "+totalRounds+" to complete 5 km");
    }
}
