package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint =>
Write a method to Generate a 6-digit OTP number using Math.random()
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
 */

public class OTP {
    // method to Generate a 6-digit OTP number
    public static long otpGenerator(){
        long otp=(long)(Math.random()*900000)+100000;
        return otp;
    }
    // method to check whether the OTP is unique
    public static boolean isUniqueOtp(long[]otps,long currentOtp,int count){
        for(int i=0;i<count;i++){
            if(otps[i]==currentOtp){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        // to create an array to store 10 OTPs
        long []otps=new long[10];

        // to generate 10 unique OTPs
        for(int i=0;i<10;i++){
            long currentOtp=otpGenerator();
            if(isUniqueOtp(otps,currentOtp,i)){
                otps[i]=currentOtp;
            }
            else{
                i--;
                continue;
            }
        }
        // to print the OTPs
        System.out.println("10 unique OTPs:");

        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

    }
}
