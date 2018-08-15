package p1;

public class ExceptionMain
{
    public static void main(String args[])
    {
       int num1 = 100, num2 = 0;

       try
       {
           System.out.println(num1/num2);
       }

       catch(ArithmeticException e)
       {
           System.out.println("Division by zero!");
       }
    }
}
