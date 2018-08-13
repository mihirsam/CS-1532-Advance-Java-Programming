package p2;

public class OtherPackage
{
    OtherPackage()
    {
        p1.Protection p = new p1.Protection();
        System.out.println("OtherPackage Constructor!");

        System.out.println("n_pub = "+p.n_pub);
    }
}
