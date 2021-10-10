package JavaProgrammes;

/***
 * Crested by krishna patel
 */
public class InstanceVariables {
    public int first;
    //Declare instance variables
    int x = 10;
    int y = 20;

    public static void main(String[] args) {
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.x);// access by object into static variable
        System.out.println(obj.y);// access by object into static variable
    }

    public  void test(){
        //Instance area
        System.out.println(x);
        System.out.println(y);
    }
}
