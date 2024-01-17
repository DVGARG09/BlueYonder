import java.util.Scanner;
class employee
{String abc;
    int pqr,abcd;
    float abcde;
    employee()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
         abc =         sc.nextLine();
        System.out.println("Enter age");
         pqr =         sc.nextInt();
        System.out.println("Enter id");
         abcd =         sc.nextInt();
        System.out.println("Enter id");
         abcde =         sc.nextFloat();


    }
    void display()
    {

        System.out.println(abc);
        System.out.println(pqr);

        System.out.println(abcd);
        System.out.println(abcde);
    }

}

class demo2
{
    public static void main(String args[])
    {


employee a = new employee();
a.display();






    }

}