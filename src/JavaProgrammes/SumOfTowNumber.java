package JavaProgrammes;

import java.util.Scanner;

public class SumOfTowNumber {
    public static void main(String[] args) {
        SumOfTowNumber obj = new SumOfTowNumber();
        obj.Sum();
    }
    public void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = in.nextInt();

        System.out.print("Input second number: ");
        int n2 = in.nextInt();
        System.out.println(n1 + " + " + n2 + " = " +
                (n1 + n2));

        System.out.println(n1 + " - " + n2 + " = " +
                (n1 - n2));

        System.out.println(n1 + " x " + n2 + " = " +
                (n1 * n2));

        System.out.println(n1 + " / " + n2 + " = " +
                (n1 / n2));

        System.out.println(n1 + " mod " + n2 + " = " +
                (n1 % n2));
    }

}


