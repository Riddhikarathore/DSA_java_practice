package exceptionhandling;

import java.io.IOException;
import java.sql.SQLOutput;

public class Mainclass {
public static void main (String args[]) {
    int a[] = new int[5];
    //toh yaha tk toh theek h koi error nhi
    System.out.println(a[4]);
    //ye aaram se chl jayega kyuki ye aaray index h humare pass

   // System.out.println(a[8]);
    //but ab yaha error aa jayega kyuki apnne toh 5 tk ka array liya or hum call kr rahe h 8 ka jo h hi nhi
    //toh ye error dega ki bhai a[8]toh h hi nhi
    //ye error dega or jo iske baad app likhoge vo execute hi nhi hoga
    //excecution of code yaha ruk jayega
    // or yaha aaray out of bound exception aayega
    System.out.println("good morning ");
    //aagr ye hi line humne eception aane k pehle wali line m likha hota toh ye chl jata
    //pr ye execption k baad h toh ye nhi chalega


//ab hum esa toh nhi chahte ki bhai galti se koi button click ho jaye toh waha error aa kr sb kuch crash ho jaye
    //hum nhi chahte ki chhoti sii error ki wjh se aage ka code execute hi na ho
    //toh isliye yaha hum try and catch block ka use krte h

    //try and catch block

    //ye humare exception ko handled kr lete h
// try m hum us code ko likhte h jisme humko lgta h ki error aa sakta h
//    try {
//        System.out.println(a[8]);
//    }
//    //then catch m hum likhenge humara execption jo aa sakta h
//    //hum catch ki help se hum na excution of nhi rukne denge hum
//    //hum us error ki jgh ek messege pass kr denge then hum aage ki execution hone denge
//    catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("i catch the error its "+e.getMessage());
//    }
//    //ab humko ye messege dikhega
//    //na ki vo red red error
//
//    System.out.println("bye guys");
//    //ye ab chl jayega kyuki error ki jgh humne ek messege pass kr diya
//
    //compile time error

//    try{
//        System.out.println("hello")
//                //yaha humne ; nhi lgaya
//    }
//    //ye error yahi pta chl raha h
//    //ye error build output m hi error de dega yaha try catch nhi kaam ayega
//    catch(RuntimeException){
//        System.out.println("please ignore it ");
//    }
//


    //hum jitna cahe utne catch lga sakte h

//    try {
//        int result = 5/0;
//    }
//  catch(ArrayIndexOutOfBoundsException e){
//      System.out.println("hehehe error ");
//    }
    //see yaha humne exception galat guess kiya toh ye humko error hi dega
    //we have to wite the right exception for the try block code
    //so for that issue you can do one more thing

    //aap jitne apko exception lgta h ki ho sakte aap vo sare likh do
//    //matalb aap jitna marzi utne catch likh sakte ho ek try k liye
//
//    try {
//        int result = 5/0;
//    }
//    catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("limit se bahar ja raha h toh error aayega hi");
//    }
//    catch(ArithmeticException e){
//        System.out.println("error h bhai error simple maths nhi aati teko ");
//    }
//    catch(RuntimeException e){
//        System.out.println("dum dum error ");
//    }
//
//    System.out.println("ho gya");


    //ab aagr sare execption k liye ek hi messege dena ho
    //ya fir ye jo hum aalag aalag catch bna rahe h isse batter h ki hum code toh bda na bnaye or simple ek hi m likhde
//    try{
//        System.out.println(a[9]);
//    }
//    //hum ek sath declare bhi kr sakte h
//    catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
//        System.out.println("padke gye " + e.getMessage());
//    }
  //  System.out.println("chipi chipi capa capa");

    //ab hum ye jo e h isse bhi bohot kuch pass krwa sakte h jese
//
//    try{
//        int result = 5/0;
//    }
//    catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
//        System.out.println(e.getCause());
//        System.out.println(e.getMessage());
//        System.out.println(e.getStackTrace());
//    }
//    System.out.println("hehehahaha");



    //ab hum aagr ek parent class bhi lgaye toh bhi exception catch ho jayega
    //AAP control click krke dekh lo ye exception kis class ka child h
    //fir aagr aap seedha parent class exception likhdo toh catch ho jayegi exception jo sari us parent class m hogi
// expection class m aa jati h sari exceptions
    //runtime class k andar aati h arithmetic exception class
    //toh ab hum aagr seedha parent exception de toh catch ho jayega
    try{
        System.out.println(a[10]);
    }
    catch(Exception e){
        System.out.println("parent exception m h ");
    }
    //ye chl jayega
    System.out.println("tukkur tukkur");
}

}
