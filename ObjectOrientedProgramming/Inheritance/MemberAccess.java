package ObjectOrientedProgramming.Inheritance;

public class MemberAccess {
    int i;
    private  int j;
    void setIJ(int x, int y) {
        this.i = x;
        this.j = y;
    }
}
class B extends MemberAccess {
    int total;
    void sum() {
//        total = super.i + super.j;       // Cannot access private members of super class by subclasses (any class)
    }
}
