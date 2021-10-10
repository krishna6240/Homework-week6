package JavaProgrammes;


import java.util.Scanner;

public class UpperTOLower {
    private static Scanner sc;
    public static void main(String[] args) {
        UpperTOLower obj = new UpperTOLower();
            obj.UpperLower();
    }
    public void UpperLower(){
        String UpperStr;

        sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("\n Enter Uppercase String = ");
        UpperStr = sc.nextLine();
        String UpperStr1 = UpperStr.toLowerCase();
        System.out.println("\n The Lowercase String = " + UpperStr1);
    }
}
