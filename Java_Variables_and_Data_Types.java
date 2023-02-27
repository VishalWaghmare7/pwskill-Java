
//Q1 - Take 2 integer values in two variables x and y and print their product. (Easy)
//        Sample Input : x=2, y=4 (Both integers)
//        Sample Output : 8
public class Multiplipiication {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        System.out.println(a*b);
    }
}
//---------------------------------------------------------------------------------------------------

//Q2 - Print the ASCII value of character ‘U’. (Easy)
//        Sample Input : already mentioned as ‘U’
//        Sample Output : 85
public class ASCII {
    public static void main(String[] args) {
        int x= 'U';
        System.out.println("ASCII :"+ x);
    }
}
//---------------------------------------------------------------------------------------------------

//Q3 - Write a Java program to take the length and breadth of a rectangle and print its area. (Easy)
//        Sample Input : 7, 4
//        Sample Output : 28
public class area_of_rectangle {
    public static void main(String[] args) {
        int length = 6;
        int breadth = 5;
        int area;
        System.out.println("The length is :" + length);
        System.out.println("The breadth is :"+ breadth);
        System.out.println("The area is :"+ length*breadth);
    }
}
//----------------------------------------------------------------------------------------------------

//Q4 - Write a Java program to calculate the cube of a number. (Easy)
//        Sample Input : 4
//        Sample Output : 64
//        The sizeof(bool) : 1 bytes
public class cube {
    public static void main(String[] args) {
        int x=4;
        System.out.println(x*x*x);
    }
}
//----------------------------------------------------------------------------------------------------

//Q5 - Write a Java program to swap two numbers with the help of a third variable.
//        Sample Input : 2,3
//        Sample Output : 3,2
public class swapNumber {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int temp;

        temp=a;
        a=b;
        b=temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
//-----------------------------------------------------------------------------------------------------
