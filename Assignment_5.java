import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q1 - Write a program to print Fibonacci series of n terms where n is input by user.
        int n = sc.nextInt();
        int a=1;
        int b=0;
        int fibonacci=0;
        for (int i=1;i<=n;i++) {
            fibonacci=a+b;
            a=b;
            b=fibonacci;
            System.out.println(fibonacci);
        }

//        Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
//        negative or zero. Calculate the sum of numbers until a negative number is encountered. I
//        f the input is a negative number, current sum is discarded and print -1.

        int sum = 0;
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n>=0){
                sum+= n;
            } else {
                sum = -1;
                break;
            }
        }
        System.out.print(sum);


//        Q3- Write a program to calculate the factorial of a number.
        
        int num= sc.nextInt();
        int factorial=1;
        for (int i=2;i<=num;i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);


//        Q5 – Write a program to print the cross pattern given below (in the shape of X):
        
          int n = sc.nextInt();
          for (int i=0; i<n; i++){
              for (int j=0; j<n; j++){
                  if (i==j || i+j==n-1){
                      System.out.print("*");
                  }else {
                      System.out.print(" ");
                  }
              }
              System.out.println();
          }


//        Q6- Write a program to print alphabet diamond pattern:
        
        int n = 5;
        int alpha=65;
        int num=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i*2-1;j++){
                System.out.print((char)(alpha + num++));
            }
            num=0;
            System.out.println();
        }
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=(n-i)*2-1;j>=1;j--){
                System.out.print((char)(alpha + num++));
            }
            num=0;
            System.out.println();
        }


//        Q7- Write a program to print pattern given below :
        
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==n/2){
                    System.out.print("*");
                } else if (j==n/2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
