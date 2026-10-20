package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Distance{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double distanceFeet=sc.nextDouble();
        double distanceYard=distanceFeet*3;
        double distanceMiles=distanceYard/1760;
        System.out.println(distanceFeet+" ,in yard "+distanceYard+" ,in miles "+distanceMiles);

    }
}
