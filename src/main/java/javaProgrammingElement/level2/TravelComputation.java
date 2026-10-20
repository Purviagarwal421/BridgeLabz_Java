package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class TravelComputation {
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.print("Enter your current city: ");
        String fromCity=sc.next();
        System.out.print("Enter  your via city: ");
        String viaCity=sc.next();
        System.out.print("Enter your designated city: ");
        String toCity=sc.next();
        System.out.print("Enter distance between fromCity to viaCity: ");
        double distanceFromToVia=sc.nextDouble();
        System.out.print("Enter distance between viaCity to toCity: ");
        double distanceViaToCity=sc.nextDouble();
        System.out.print("Enter time taken fromCity to viaCity(in min): ");
        int timeFromToVia=sc.nextInt();
        System.out.print("Enter time taken viaCity to toCity(in min): ");
        int timeViaToFinalCity=sc.nextInt();
        int totalTime=timeFromToVia+timeViaToFinalCity;
        double totalDistance=distanceFromToVia+distanceViaToCity;
        System.out.println("The Total Distance travelled by " + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");

    }
}
