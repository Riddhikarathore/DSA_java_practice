package oops.encapsulation.protect;
//ye protect ko access krne k liye
import oops.encapsulation.teachers;
//humko import krna padhega ki hum konsi package se acees lena chahte h
public class main3 extends teachers
//yaha humne prarent teachers se child class bnaya h main3
// ab yaha hum protect access kr sakte h
{
    public static void main(String[] args) {
        main3 h1 = new main3();
        h1.count= 20;
        //ye access ho gya h or yaha humne main3 likha h kyuki vo already extend ho gya h teachers se
        //isliye teachers ka obj nhi bnaya h
    }
}
