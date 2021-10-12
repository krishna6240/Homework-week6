package JavaProgrammes;

import java.util.Scanner;

public class Final_calulator {

    //A Java programme for a calculator with addition,subtraction,multiplication and division.
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = myobj.nextInt();
        System.out.println("Enter second number:");
        int b = myobj.nextInt();
        //int answer = 0;
        Final_calulator obj = new Final_calulator();
        System.out.println("Addition");
        obj.addition(a, b);
        System.out.println("Subtraction");
        obj.sub(a, b);
        System.out.println("Multiplication");
        multi(a, b);
        System.out.println("Division");
        divide(a, b);



    }

    public void addition(int a, int b) {
        System.out.println(a + b);


    }

    public void sub(int a, int b) {
        System.out.println(a - b);


    }

    public static void multi(int a, int b) {
        System.out.println(a * b);


    }

    public static void divide(int a, int b) {
        System.out.println(a / b);


    }
}






