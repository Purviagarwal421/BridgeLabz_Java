package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Write a program Quadratic to find the roots of the equation ax2+ bx + c. Use Math functions Math.pow() and Math.sqrt()
Hint =>
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae
root1 of x = (-b + delta)/(2*a)
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x
root of x = -b/(2*a)
If delta is negative return empty array or nothing
Write a Method to find find the roots of a quadratic equation and return the roots

 */

public class QuadraticRoots {
    // to calculate roots
    public double [] roots(int a,int b,int c){
        int delta=b*b+4*a*c;
        if(delta>0){
            double []results=new double[2];
            results[0]=(-b+Math.sqrt(delta))/(2*a);
            results[1]=(-b-Math.sqrt(delta))/(2*a);
            return  results;
        }
        else if(delta==0){
            double []results=new double[1];
            results[0]=-b/(2*a);
            return results;
        }
        else{
            return new double[0];
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // to take inputs
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c=sc.nextInt();
        // to create object
        QuadraticRoots obj = new QuadraticRoots();

        // to call method
        double[] results = obj.roots(a, b, c);

        // to print the result
        if (results.length == 0) {
            System.out.println("No real roots exist.");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println("Root " + (i + 1) + " = " + results[i]);
            }
        }




    }

}
