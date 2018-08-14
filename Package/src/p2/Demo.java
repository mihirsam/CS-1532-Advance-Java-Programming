package p2;

import p1.Derived;
import p1.SamePackage;

public class Demo
{
    public static void main(String args[])
    {
        Protection2 ob1 = new Protection2();
        //Derived ob2 = new Derived();
        //SamePackage ob3 = new SamePackage();
        OtherPackage ob4 = new OtherPackage();
    }
}
