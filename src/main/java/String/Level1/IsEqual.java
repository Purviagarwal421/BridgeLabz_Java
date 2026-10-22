package CorePrograms.String.Level1;
import java.util.Scanner;

/*
Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
Hint =>
Take user input using the  Scanner next() method for 2 String variables
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String Built-In method to check if the results are the same and display the result

 */
public class IsEqual {
    //method to compare two strings using the charAt()
    static boolean usingCharAt(String string1,String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        boolean flag=true;
        //to check each letters of the string
        for(int i=0;i<string1.length();i++){
            if(string1.charAt(i)!=string2.charAt(i)){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String string1=sc.next();
        String string2=sc.next();
        // to check using built in functions
        if(string1.equals(string2)){
            System.out.println(string1+" is equal to "+string2);
        }
        else {
            System.out.println(string1+" is not equal to "+string2);
        }
        // to check using charAt()
        boolean result=IsEqual.usingCharAt(string1,string2);
        if(result){
            System.out.println(string1+" is equal to "+string2);
        }
        else {
            System.out.println(string1+" is not equal to "+string2);
        }
    }

}
