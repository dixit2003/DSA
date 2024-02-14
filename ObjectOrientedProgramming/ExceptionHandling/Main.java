package ObjectOrientedProgramming.ExceptionHandling;

public class Main {
    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0)
            throw new ArithmeticException("Do not divide by zero!");
        return a / b;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        try {
//           divide(5, 0);
            String name = "Kunal";
            if (name.equals("Kunal"))
                throw new MyExceptions("Name cannot be kim!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This block always runs!");
        }

    }
}
