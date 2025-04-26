package oops.encapsulation.main;
//ab ye humne nya package bnaya h encapsulation se
//ab hum aage chahe toh encapsulation ki sari cheeze le sakte h
//bs humko import krna padhega
import oops.encapsulation.teachers;
//ese humne access kr liya
public class main2 {
    // let's see humre pass aaya ya nhi encapsulation ka access
    public static void main(String args[]){

        teachers t1 = new teachers();
        t1.age = 34;
        //ye public tha isliye yaha bhi chl gya


       // t1.name = "riddhika";
        //ye yaha bhi error hi dega kyuki ye private h matlb ye bs us hi class m chalega


       // t1.subject = "python ";
        // see ye yaha error de raha h kyuki ye default tha or uske hi package m access ho sakta h yaha wale m nhi


        //t1.count ko lane k liye meko inherit krna padhega teachers class ko
       //protected access modifier
    }

}
