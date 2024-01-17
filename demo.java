class A
{
A()
{

System.out.println("CONSTRUCTOR");
}
void display()
{
System.out.println("abc");
}

}


class demo
{

public static void main(String args[])
{
System.out.println("hi welcome to java");
A a = new A();
a.display();
}
};