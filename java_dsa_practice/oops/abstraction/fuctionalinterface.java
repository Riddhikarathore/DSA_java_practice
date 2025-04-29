package oops.abstraction;

public class fuctionalinterface {
    //fuctional interface vo jisme ek hi method ho
    //an iterface that contain exactly one abstract method is known as functional interface
    public static void main(String[] args) {
//        suparinterface obj = new suparinterface() {
//            @Override
//            public void interfacemethod() {
//                System.out.println("method method one method ");
//
//            }
//        };
        //now these can replace by lamda expression
        suparinterface obj =() -> {

        };
    }

}
@FunctionalInterface
interface suparinterface{
    void interfacemethod();
    //ye ek hi method hogi toh hum bolenege isko functional interface

   // void method2();
    //ye error bhi dega aagr @functional interface lga hua h toh
    //ab aagr hum ek or method de dete h toh ye functonal interface nhi hogi
}
