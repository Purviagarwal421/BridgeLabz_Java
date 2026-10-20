package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double Celsius=sc.nextDouble();
        double fahrenheitResult= Celsius *((double) 9 /5)+32;
        System.out.println("The "+Celsius+" Celsius is "+fahrenheitResult+" fahrenheit");
    }
}
