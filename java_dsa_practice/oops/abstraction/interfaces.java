package oops.abstraction;

//public class interfaces {
//    public static void main(String[] args) {
//       // line obj1 = new line ;
//        //ye yaha error dega kyuki ye bhi object nhi bnata h jese abstract nhi bnata h
//
//        rectangle obj1= new rectangle ();
//        System.out.println(obj1.count());
//        obj1.draw();
//        obj1.lenght();
//        System.out.println(obj1.num());
//        obj1.cross();
//
//
//    }
//}
//
////ab ye ek interface class h
//interface line {
//    //void draw(){
//        //ye yaha hum define nhi krenge as abstract class
//   // }
//
//    void draw();
//    // yaha ye method khud se hi abstract h humko likhne ki need nhi h kyuki ye humasha abstarct hi rahegi
//    //or public likhne ki bhi need nhi h ye public hi rahegi otherwise hum isjko use kese krengwe
//
//    int num();
//    //ye yaha static rahega pehle se hi
//    // or public bhi
//
//    // so in future if we want to add one more method
//    //and it is seems to be impossible to make implementation of 100 plus classes
//                                                 //so we basically make a default method
//    //which implements itself in interface class
//
//    default void  cross(){
//        System.out.println("crossing ");
//        //hum yahi implement krenge so that ki baki sari na jane kitni classes m aalga aalga ja kr na krna padhe
//    }
//}
//
////now ab hum ek or interface class bnate h
//
//interface diagonal{
//
//    void lenght();
//    int count();
//
//}
//
////ab the main concept was ki hum interface ki help se 2 ya 2 se jyada class ko implement kr sakte h ek sath
////interface m extends ki jgh hum impliment likhte h
//
////now make a child class so that we can use our parent classes
//
//class rectangle implements line,diagonal{
//    //ye yaha humne dono ko sath m kr liya
//    //but ye error de raha h kyuki humne abhi implement nhi kiya methods ko
//    //ab implement kro
//    @Override
//    public void draw() {
//        System.out.println("drawing");
//    }
//
//    @Override
//    public int num() {
//        int num = 3;
//        return num;
//    }
//
//    @Override
//    public void lenght() {
//        System.out.println("bohot bda");
//
//    }
//
//    @Override
//    public int count() {
//        int count = 20;
//        return count;
//    }
//    //so ab hum inka object bna sakte h or use kr sakte h interfaces ko
//
//}
// so these is all about the interface
//it is similar to abstarct but interfaces can take 2 or more classes

                                           //inner class and nested static class

public class interfaces {

    // ye ek inner class kyuki ye ek class k andar bni h
    class riddhi {
int age;
    }

    //now if we put static class then that's a nested static class h

    static class rathore {
        int members;

    }


    public static void main(String[] args) {

        // ab aagr yaha class ka obj bnana h toh hume pehle otter clas ka object bnana hoga
        //riddhi obj1 = new riddhi();
        //ye error dega kyuki hum direct class ka obj nhi bna sakte kyuki ye ek inner class h isliye hume
        //pehle otter class ka object bnana padhega

        interfaces obj1 = new interfaces() ;
        //now ye otte ki bna di ab hume inner ki bnani h
        riddhi obj2 = obj1.new riddhi();
        obj2.age= 20;
        // ye toh ho gya inner class ka


        //ab hum dekhte h nested static classs ka obj kese bnega

        //nested class m hume koi outer class k obj ki need nhi h

        rathore obj3 = new rathore();
        obj3.members= 1;
        //yaha humne direct hi access kr liya


    }

}
//so basically inner class or nested class ka benefit ye h ki isme sb cheeze ek hi jgh mil jati h
//which mean better encapsulation
//and also radable bhi bnata h code ko

//inner class= obj k liye outer class ka bhi object bnana padhega
//nested class = obj k liye koi outer class ki object bnane ki need nhi h