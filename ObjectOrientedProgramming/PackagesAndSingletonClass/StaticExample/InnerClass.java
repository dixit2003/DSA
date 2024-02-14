package ObjectOrientedProgramming.PackagesAndSingletonClass.StaticExample;

public class InnerClass {
    static class Test {
        static String name;
        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Dixit");
        Test b = new Test("Dharshini");
        System.out.println(a.name);
        System.out.println(b.name );
    }
}
