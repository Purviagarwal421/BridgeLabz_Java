package CorePrograms.BasicQuestions;

import java.util.Scanner;
public class WordCount {
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.isEmpty()){
            System.out.println("Word Count: "+0);
            System.exit(0);
        }
        String []word=str.trim().split("\\s+");
        System.out.println("Word count: "+word.length);
    }
}
