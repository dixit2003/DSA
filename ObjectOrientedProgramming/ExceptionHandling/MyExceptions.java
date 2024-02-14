package ObjectOrientedProgramming.ExceptionHandling;

public class MyExceptions extends Exception{
    public MyExceptions(String msg) {
        super(msg); //Throwable is the parent class for Exception. For Exception, it's throwable.
    }
}

