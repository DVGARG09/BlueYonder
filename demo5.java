class A
{
    int a = 100;
    A()
    {
        System.out.println("abc");
    }

}
class B extends A
{
 B()
 {
     System.out.println("bcd");
 }
}
public class demo5{
    public static void main(String args[])
    {
        B b = new B();
    }
}