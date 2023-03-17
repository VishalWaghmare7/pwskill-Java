import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1 - Write a program which takes the values of length and breadth from user and check if it is
//        a square or not.
        System.out.println("Enter the length");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();
        if (length==breadth) {
            System.out.println("It is square");
        } else {
            System.out.println("It is not square");
        }


//        Q2 - Write a program to print absolute value of a number entered by the user.
        System.out.println("Enter Negetive number");
        int num = sc.nextInt();
        if (num<0) {
            num *= -1;
        }
        System.out.println("The absulute valve: "+num);


//        Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
//        calculate Profit or Loss.
        System.out.println("Enter cost Price");
        double cost_p = sc.nextDouble();
        System.out.println("Enter selling Price");
        double selling_p = sc.nextDouble();
        double amo;
        if (selling_p>cost_p) {
            amo = selling_p - cost_p;
            System.out.println("the profit is :"+amo);
        } else if (cost_p>selling_p) {
            amo=cost_p-selling_p;
            System.out.println("the loss is :"+amo);
        } else {
            System.out.println("no profit no loss");
        }


//        Q4 - Write a program to print positive number entered by the user, if user enters a negative
//        number, it is skipped
        System.out.println("Enter an integer :");
        int num = sc.nextInt();
        if (num<0) {
            System.out.println("The number is negative: "+num);
        } else {
            System.out.println("The number is possitive; "+num);
        }


//        Q5 - Create a calculator using switch statement to perform addition, subtraction, multiplication
//        and division.
        char op;
        double num1;
        double num2;
        System.out.println("Enter your choice (+,-,*,/): ");
        op = sc.next().charAt(0);
        System.out.println("Enter two numver: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        double result;
        switch (op){
            case '+':
                result=num1+num2;
                System.out.println(result);
                break;
            case '-':
                result=num1-num2;
                System.out.println(result);
                break;
            case '*':
                result=num1*num2;
                System.out.println(result);
                break;
            case '/':
                result=num1/num2;
                System.out.println(result);
                break;
            default:
                System.out.println("invalid number");
        }


//        Q6 - Write a program to calculate marks to grades . Follow the conversion rule as given below :
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (100>=marks && marks>=90) {
            System.out.println("Your Grade is: A+");
        } else if (90>=marks && marks>=80) {
            System.out.println("Your Grade is: A");
        } else if (80>=marks && marks>=70) {
            System.out.println("Your Grade is: B+");
        } else if (70>=marks && marks>=60) {
            System.out.println("Your Grade is: B");
        } else if (60>=marks && marks>=50) {
            System.out.println("Your Grade is: C");
        } else if (50>=marks && marks>=40) {
            System.out.println("Your Grade is: D");
        } else if (40>=marks && marks>=30) {
            System.out.println("Your Grade is: E");
        } else {
            System.out.println("Your Grade is: F");
        }
    }
}
