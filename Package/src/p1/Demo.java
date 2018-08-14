package p1;

import p1.Derived;
import p1.Protection;
import p1.SamePackage;

public class Demo
{
    public static void main(String args[])
    {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
