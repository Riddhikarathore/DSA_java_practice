import java.util.Scanner;
public class chapter4conditions
{
    public static void main(String args[])
    {
       /*            //example of if-else statement
       int a = 2;
        if (a > 18)
            System.out.println("you can drive");

       else System.out.println("you can not drive ");

                   //relational operators example in if else statement

        int b = 1;
        if (b >= 5)
           System.out.println("you child");

       int c = 45;
                if (c!=67)
                   System.out.println("you are going change your life");

                int d= 3;
                        if (d==3)
                           System.out.println("hello");

                        //logical operator example
        //AND operator

boolean k=true;
boolean t=true;

        if(k && t)
            System.out.println("riddhika i love you ");
        else System.out.println("riddhika i hate you");

        //OR operator
        boolean s=true;
                boolean r= false;
                if (s || r)
       System.out.println("riddhika is a good girl");
        else System.out.println("riddhika is A super great girl i ever seen ");

        //NOT operators
        System.out.print("not(s) is ");
        System.out.println(!s);
        System.out.println(!r);

        //else if clouse
        Scanner op = new Scanner (System.in);
        System.out.println("please enter here your number");
        int age= op.nextInt();
        if (age>24){
            System.out.println("riddhika");}

            else if (age==44){
            System.out.println("sejal");}

            else {System.out.println("no one is great here");
*/              int age;
                     Scanner op = new Scanner (System.in);
        System.out.println("enter here your age :");
                     age=op.nextInt();



                switch (age)
                {
                    case 18:
                        System.out.println("you are adult");
                        break;
                    case 24:
                        System.out.println("you are ready to join job");
                        break;
                    case 56:
                        System.out.println("you are retire now");
                        break;
                    default:
                            System.out.println("enjoy your life");



                }


    }
}


