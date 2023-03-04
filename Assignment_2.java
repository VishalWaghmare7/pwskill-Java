import java.util.*;

public class assignment_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1 - Input name, roll number and field of interest from user and print in the format below :
//        Name: xyz, Roll number: xyz, Field of interest: xyz

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your Roll_No");
        int roll_no = sc.nextInt();
        System.out.println("Enter Field your interest");
        String interest = sc.next();

        System.out.println("Name: "+ name);
        System.out.println("Roll No: "+ roll_no);
        System.out.println("Field of interest: "+ interest);

//        Q2 - Input two different string and print them in same line.

        System.out.println("Enter first string");
        String one = sc.next();
        System.out.println("Enter second string");
        String second = sc.next();
        System.out.println(one+second);

//        Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of
//                100), write a program to calculate his total marks and percentage marks.

        System.out.println("Enter the mark sub1");
        int sub1 = sc.nextInt();
        System.out.println("Enter the mark sub2");
        int sub2 = sc.nextInt();
        System.out.println("Enter the mark sub3");
        int sub3 = sc.nextInt();
        int total = sub1+sub2+sub3;
        int percentage=(total/3);
        System.out.println("Total marks: "+ total);
        System.out.println("percentage marks: "+ percentage);
    }
}
