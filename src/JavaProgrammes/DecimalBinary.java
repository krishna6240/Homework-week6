package JavaProgrammes;

import java.util.Scanner;
//A Java program to convert a decimal number to binary number.
public class DecimalBinary {
    public static void main(String[] args) {
        DecimalBinary obj = new DecimalBinary();
        obj.DeBi();
    }

    public void DeBi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Decimal Number : 5");//5
        System.out.println("Binary number is");
        System.out.println(Integer.toBinaryString(5));//101

        // System.out.println();


    }
}
