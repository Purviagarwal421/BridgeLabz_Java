package CorePrograms.String.Level1;

import java.util.Scanner;

public class ShowStringIndexOutOfBoundsException {
    //method to generate error
    static void generateError(String string){
        System.out.println(string.charAt(string.length()));
    }
    // method to handle exception
    static void handleError(String string){
        try{
            System.out.println(string.charAt(string.length()));
        } catch (Exception e){
            System.err.println("StringIndexOutOfBoundsException");
        }
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // to take input
        String string=sc.next();

        // to generate error
        //generateError(string);

        // to handle error
        handleError(string);

    }

}
