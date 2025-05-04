package exceptionhandling;

import java.sql.SQLOutput;

public class finallyblock {
    //finally block chahe exception aaye ya nhi aaye finally block toh chalega hi
    //always execute hoga
    public static void main(String[] args) {
       // int a[] = new int[10];
      //  System.out.println("namaste");

//        try{
//            int result = 35/0;
//
//        }
//        catch(Exception e){
//            System.out.println("error occur "+e.getMessage());
//        }
//        //ab yaha error h or finally block yaha execute hoga
//        finally {
//            System.out.println("always execute ");


        //ab aagr hum koi exception na de toh bhi finally execute hoga
//        try {
//            System.out.println(a[7]);
//        } catch (Exception e) {
//            System.out.println("error h ");
//        } finally {
//            System.out.println("always execute ");
//        }
//        System.out.println("bye guys");


        //apn seddha try k baad finally block bhi lga sakte h

//        try {
//            System.out.println(a[1]);
//        } finally {
//            System.out.println("always run");


        //finally block ek hi lgega or end m lgega


        //ab humare pass ek throws keyword bhi hota h
        //so basically hum usko tb use krte h jb hum ksis function ko bna rahe h or humko lg raha h ki ye exception
        //de sakta h tb toh hum us thows keyword se bta denge
        //so that jb bhi vo fuction ko koi call kre toh usko pta lg jaye ki isme error aa sakta h
        //or vo usko le kr prepare ho jayega
        //or try and catch block se handle kr lega
        int a[] = new int[5];
      // getnumarray(a);
       //ye error dega ab

        //toh ab jb humko pta chl gya ki throws keyword bta raha h error h
        //toh hum ab handle kr lenge

        //try and catch se

        try{
            getnumarray(a);
        }
        catch(Exception e){
            System.out.println("error h bhai error"+ e.getMessage());

        }

    }
    static int getnumarray(int a[]) throws ArithmeticException  {
        //ye method error dega ye btane k liye hum throws keyword ka use kr sakte h
        //so that developer ko pta ho or vo try and catch  se handle kr le
        return a[8];
    }
    //toh ye use hota h throws ka


    //ek or key word hota h jiska naam throw hota h

    //usme hum khdse error ko bta sakte h or throw kr sakte h
    //next class m dekhte h


    }




