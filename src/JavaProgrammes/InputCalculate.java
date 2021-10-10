package JavaProgrammes;


import java.util.Random;
import java.util.Scanner;

public class InputCalculate {
/*The three numbers as input to calculate and
print the average of the numbers*/
    public static void main(String[] args) {

       // Scanner in = new Scanner(System.in);
        InputCalculate obj = new InputCalculate();
        obj.average();

    }
    public void average() {
        System.out.print("Input first number: ");
        Scanner in = new Scanner(System.in);
        float n1 = in.nextInt();

        System.out.print("Input second number: ");
        float n2 = in.nextInt();

        System.out.print("Input third number: ");
        float n3 = in.nextInt();

        System.out.println("Average of Three numbers is: " +
                (n1 + n2 + n3) / 3);

    }
    }


