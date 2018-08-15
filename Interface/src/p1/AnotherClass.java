package p1;
import java.util.Scanner;

class AnotherClass implements p1.Callback
{
    String name;
    Scanner sc = new Scanner(System.in);

    public void Information()
    {
        System.out.print("Whats your name : ");
        name = sc.nextLine();
        System.out.println("Hello World\nMy name is "+name+".\nMy age is "+age);
    }
}
