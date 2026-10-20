package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Triangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double base=sc.nextDouble();
        double height=sc.nextDouble();
        double areaCm=0.5*base*height;
        double areaInches=areaCm/2.54;
        System.out.println("Area in cm: "+areaCm+", Area in inches: "+areaInches);

    }

}