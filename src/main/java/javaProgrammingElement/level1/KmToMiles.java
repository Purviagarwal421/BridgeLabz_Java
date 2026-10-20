package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class KmToMiles{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
//        float distance= 10.8F;
//        float miles=distance/1.6F;
//        System.out.println("The distance "+distance+"km in miles is "+miles);
        float distance=sc.nextFloat();
        float miles=distance/1.6F;
        System.out.println("The distance "+distance+"km in miles is "+miles);
    }
}