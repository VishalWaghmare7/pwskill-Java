import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
//        is taken with 5 and then multiply the resultant value by 5. Display the final result.

        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println(((( x + 8) / 3 ) % 5 ) * 5);

//        Q2 - Swap two numbers without the use of third variable.

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("First = "+a +"\nSecond = "+ b);


//        Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:

        int a = 55;
        int b = 70;
        System.out.println("i) both the conditions 'a < 50' and 'a < b' are true.");
        System.out.println(a < 50 && a < b);
        System.out.println("ii) at least one of the conditions 'a < 50' or 'a < b' is true.");
        System.out.println(a < 50 || a < b);

    }
}
