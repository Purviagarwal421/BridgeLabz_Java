package CorePrograms.BasicQuestions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String wd="";
        for(int i=str.length()-1;i>=0;i--){
            wd = wd + str.charAt(i);
        }
        //method 2 : using StringBuilder

//        StringBuilder rev=new StringBuilder();
//        for(int i=str.length()-1;i>=0;i++){
//            rev.append(str.charAt(i));
//        }
        System.out.println("Reverse String: "+wd);

    }
}
