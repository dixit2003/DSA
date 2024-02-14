package ObjectOrientedProgramming.PackagesAndSingletonClass.StaticExample;

//Initialize static Variables
public class StaticBlock {
    static  int a = 4;
    static int b;

    //Will only run once when the object is created, i.e., when the class is loaded for the first time.
    static {
        System.out.println("In static block!");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock ob = new StaticBlock(); //Once the class is loaded, all the static elements will get executed first
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
//
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
