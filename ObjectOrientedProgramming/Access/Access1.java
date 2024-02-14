package ObjectOrientedProgramming.Access;

import ObjectOrientedProgramming.Interfaces.A;

public class Access1 {
    private int num;
    String name;
    int[] arr;
    public Access1(int num, String name) {
        this.name = name;
        this.num = num;
        this.arr = new int[num];
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public static void main(String[] args) {
        Access1 a = new Access1(3, "dis");
        System.out.println(a.num);
    }
}
