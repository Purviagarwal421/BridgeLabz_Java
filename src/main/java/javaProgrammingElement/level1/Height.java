package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Height{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height in cm: ");
        double height=sc.nextDouble();
        double heightInches=height/2.54;
        double heightFeet=heightInches/12;
    }

}
