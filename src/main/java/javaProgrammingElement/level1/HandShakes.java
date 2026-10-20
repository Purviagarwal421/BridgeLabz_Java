package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class HandShakes{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int numberOfStudents=sc.nextInt();
        int maximumHandShakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("Maximum no of handshakes "+maximumHandShakes+" where no of students "+numberOfStudents);

    }
}
