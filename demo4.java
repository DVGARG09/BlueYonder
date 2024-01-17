import java.util.Scanner;
class emp
{
    int id;
    String name;
    int age;
    boolean dv = false;
        int salary ;
    String desg;
    emp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        id = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        System.out.println("Enter Age");
        age = sc.nextInt();

    }
    void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+desg);
    }
    void update(float a)
    {
        if(dv==false) {
            salary = salary + (int) (salary * a);
        dv = true;
        }
        else {
            System.out.println("CAN BE UPDATED ONLY ONCE");
        }
    }
}

class Developer extends emp
{

    Developer() {
         salary = 50000;
         desg = "Developer";
    }
//    void dev(int a) {
////        salary = 50000;
//        salary = salary + a*salary;
//        desg = "Developer";
//    }

}
class Tester extends emp
{
//    int id;
//    String name;
//    int age;
//    int salary ;
//    String desg;
    Tester() {
        int salary = 40000;

        String desg = "Tester";
    }
//    void dev(int a) {
////        int salary = 40000;
//        salary = salary + a*salary;
//        String desg = "Tester";
//    }


}
class Clerk extends emp {
    //    int id;
//    String name;
//    int age;
//    int salary ;
//    String desg;
    Clerk()
    {
    int salary = 10000;
    String desg = "Clerk";

}
//    void dev (int a)
//    {
////        int salary = 10000;
////        String desg = "Clerk";
//        salary = salary + a*salary;
//    }
}
class Manager extends emp {
    //    int id;
//    String name;
//    int age;
//    int salary ;
//    String desg;
    Manager(){
     salary = 100000;
     desg = "Manager";
}
//   void dev(int a){
//     //   salary = 100000;
//        desg = "Manager";
//        salary = salary + a*salary;
//    }


}

class demo4 {

    public static void main(String args[]) {
        Developer abc = null;
//        abc=null;
        Tester test = null;
        Manager man = null;
        Clerk cl = null;
        int ch2 = 0;
        do {
            System.out.println("Enter Input");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            Scanner sc = new Scanner(System.in);
            ch2 = sc.nextInt();
            if (ch2 == 1) {


                int ch = 0;
                do {
                    System.out.println("Enter Input to Create");
//                    Scanner sc = new Scanner(System.in);
                    System.out.println("1. Developer");
                    System.out.println("2. Clerk");
                    System.out.println("3. Manager");
                    System.out.println("4. Tester");
                    System.out.println("5. Back to Selection");
                    ch = sc.nextInt();
                    if (ch == 1) {
                        Developer d = new Developer();
                        //  d.Developers();
                        abc = d;
                    }
                    if (ch == 2) {
                        Clerk d = new Clerk();
                        ///   d.Developers();
                        cl = d;
                    }

                    if (ch == 3) {
                        Manager d = new Manager();
                        //   d.Developers();
                        man = d;
                    }

                    if (ch == 4) {
                        Tester d = new Tester();
                        //  d.Developers();
                        test = d;
                        //   Developer d = new Developer(50000,"developer");
                        // d.display();
                    }


                }
                while (ch != 5);
            }
            if (ch2 == 2) {


                int ch = 0;
                do {
                    System.out.println("Enter Input to Display");
                    System.out.println("1. Developer");
                    System.out.println("2. Clerk");
                    System.out.println("3. Manager");
                    System.out.println("4. Tester");
                    System.out.println("5. Back to Selection");
//                    Scanner sc = new Scanner(System.in);
                    ch = sc.nextInt();
                    if (ch == 1) {
                        if (abc == null) {
                            System.out.println("ERROR!!");
                            break;
                        }
                        abc.display();
//                        abc = d;
                    }
                    if (ch == 2) {
//                        Clerk d = new Clerk();
                        if (cl == null) {
                            System.out.println("ERROR!!");
                            break;
                        }
                        cl.display();
//                        cl = d;
                    }

                    if (ch == 3) {
//                        Manager d = new Manager();
                        if (man == null) {
                            System.out.println("ERROR!!");
                            break;
                        }
                        man.display();
//                        man = d;
                    }

                    if (ch == 4) {
//                        Tester d = new Tester();
                        if (test == null) {
                            System.out.println("ERROR!!");
                            break;
                        }
                        test.display();
//                        test = d;
                        //   Developer d = new Developer(50000,"developer");
                        // d.display();
                    }


                }
                while (ch != 5);
            }
            if (ch2 == 3) {

                int ch = 0;
                do {
                    System.out.println("Enter Input to update");
//                    Scanner sc = new Scanner(System.in);
                    System.out.println("1. Developer");
                    System.out.println("2. Clerk");
                    System.out.println("3. Manager");
                    System.out.println("4. Tester");
                    System.out.println("5. Back to Selection");
                    ch = sc.nextInt();
                    if (ch == 1) {
                        abc.update(0.15f);
                    }
                    if (ch == 2) {
                        cl.update(0.2f);
                    }

                    if (ch == 3) {
                        man.update(0.4f);
                    }

                    if (ch == 4) {
                        test.update(0.1f);
                        //   Developer d = new Developer(50000,"developer");
                        // d.display();
                    }

                }
               while(ch!=5);
//                   break;
            }


        }
        while(ch2!=4);
    }
}
