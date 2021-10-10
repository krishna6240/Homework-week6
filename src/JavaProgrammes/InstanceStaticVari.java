package JavaProgrammes;

public class InstanceStaticVari {
    int x = 10;//Instance variable
    int y = 20;//second Instance variable
    static int c = 20;//Static variable
    static int f = 40;//Second Static variable
    public static void main(String[] args) {
        // Call both instance and static methods into main method
        InstanceVariables obj = new InstanceVariables();
        InstanceVariables obj1 = new InstanceVariables();
        System.out.println(obj.x);//10
        System.out.println(obj1.y);//20

        MyMethod(); //20 and 40

    }

    public void test() {
        //Instance area
        System.out.println(x);
        System.out.println(y);
    }

    public static void MyMethod() {
        //Static area
        System.out.println(c);
        System.out.println(f);
    }
}

