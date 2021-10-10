package JavaProgrammes;

public class InstanceStaticVariable {
    int x = 10;//Instance variable
    static int c = 20;//Static variable

    public static void main(String[] args) {
        // Call both instance and static methods into main method
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.x);//10
        //System.out.println(StaticVariables.c);//0
        MyMethod(); //20

    }

    public void test() {
        //Instance area
        System.out.println(x);
    }

    public static void MyMethod() {
        System.out.println(c);
    }
}