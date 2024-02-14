package ObjectOrientedProgramming.Access;

public class ObjectDemo {
    int num;
    int gpa;
    String name;
    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo(int num, int gpa, String name) {
        this.gpa = gpa;
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() { //Gives number representation of an object
        return super.hashCode();
    }

    public static void main(String[] args) {
//        ObjectDemo obj = new ObjectDemo(5);
//        System.out.println(obj.hashCode());

        ObjectDemo ob1 = new ObjectDemo(3, 9, "Draxz");
        ObjectDemo ob2 = new ObjectDemo(7, 8, "Dharshi");
        if (ob1.equals(ob2)) {
            System.out.println("Yep");
        }
        if (ob1 == ob2) {
            System.out.println("No");
        }

        System.out.println(ob1.getClass());
    }
}
