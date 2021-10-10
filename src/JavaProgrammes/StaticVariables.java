package JavaProgrammes;

public class StaticVariables {

    public static int c;
    static int a = 10;// static variable
    static int b = 20;// static variable

    public static void main(String[] args) {

        //System.out.println(a);
        System.out.println(StaticVariables.a);//10
        //System.out.println(b);
        System.out.println(StaticVariables.b);//20
        MyMethod();
    }

    public static void MyMethod() {
        System.out.println(a);//10
        //System.out.println(StaticVariables.a);
        System.out.println(b);//20
        //System.out.println(StaticVariables.b);

    }

}
