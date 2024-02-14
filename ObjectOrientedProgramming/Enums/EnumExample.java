package ObjectOrientedProgramming.Enums;

public class EnumExample {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are constants. Each are public, static and final.
        //Since it's final, cannot create childs.
        //Type is week.

        Week() {
            System.out.println("A Constructor for " + this);
        } //This is neither public not protected, only private or default.


    }
    public static void main(String[] args) {
        Week week;
        week = Week.Monday; //When trying to access one, all types will be printed.

//        for (Week day: Week.values()) {
//            System.out.println(day);
//        }
//        System.out.println("\n" + week);
//        System.out.println(week.ordinal());
    }

}
