package p1;

public class LinkedListMain
{
    public static void main(String args[])
    {
        p1.LinkedList head = new p1.LinkedList();
        p1.LinkedList second = new p1.LinkedList();
        p1.LinkedList third = new p1.LinkedList();
        p1.LinkedList temp = new p1.LinkedList();

        int flag = 0;

        head.data = 1;
        head.next = second;
        second.data = 2;
        second.next = third;
        third.data = 3;
        third.next = null;

        temp = head;

        while(true)
        {
            System.out.println("Index "+flag+" : "+temp.data);
            flag++;

            if(temp.next == null)
            {
                break;
            }

            else
            {
                temp = temp.next;
            }
        }
    }
}
