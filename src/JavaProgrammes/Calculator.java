package JavaProgrammes;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
        Calculator obj2 = new Calculator();
        obj2.sub();
        mul();
        div();


    }

    public void add() {

        Scanner in = new Scanner(System.in);
        double f1, f2,ans;

        System.out.print("Enter First Numbers : ");
        f1 = in.nextDouble();
        System.out.print("Enter second Numbers : ");
        f2 = in.nextDouble();
        ans = f1 + f2;

        System.out.println("Result will be display in addition = " + ans);


    }
    public void sub()
    {
            Scanner in = new Scanner(System.in);
            double  f1,f2,ans1;
            System.out.print("Enter First Numbers : ");
            f1 = in.nextDouble();
            System.out.print("Enter second Numbers : ");
            f2 = in.nextDouble();
            ans1 = f1 - f2;

        System.out.println("Result will be display in subtraction = " + ans1);


    }
    public static void mul(){
        Scanner in = new Scanner(System.in);
        double  f1,f2,ans2;
        System.out.print("Enter First Numbers : ");
        f1 = in.nextDouble();
        System.out.print("Enter second Numbers : ");
        f2 = in.nextDouble();
        ans2 = f1 * f2;
        System.out.println("Result will be display in multiplication = " + ans2);

    }
    public static void div(){
        Scanner in = new Scanner(System.in);
        double  f1,f2,ans4;
        System.out.print("Enter First Numbers : ");
        f1 = in.nextInt();
        System.out.print("Enter second Numbers : ");
        f2 = in.nextInt();
        ans4 = f1 / f2;
        System.out.println("Result will be display in division = " + ans4);
    }
}


