package CorePrograms.Methods.Level2;

import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age){
        if (age < 0) {
            return false;
        }
        else if(age>=18){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker obj=new StudentVoteChecker();
        // to take input
        int []studentsAge=new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentsAge[i]=sc.nextInt();

            // to call method
            boolean result = obj.canStudentVote(studentsAge[i]);
            // to print the result
            if (result) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }



    }
}
