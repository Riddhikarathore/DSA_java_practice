public class oopsbasics {
//    public static void main(String[] args) {// ab object bnayenge isme class ki sari cheeze impliment ho
//        //ye physical entities hoti h
//        // dog ek non-primitive data type h
//        //hum humare marzi se ab data type bna sakte h oops ki help se
//        dog D1 = new dog();
//        D1.age= 4;
//        D1.name= "leo";
//        D1.bark();
//        D1.walk();
//
//        dog D2 = new dog();
//        D2.name = "reo";
//        D2.walk();
//        D2.bark();
//
//
//
//    }
//
//    static  class dog{// class m properties ,behaviour ,methods aati h or ye logical entities h
//        String name;
//        int age;
//
//        void walk(){
//            System.out.println(name+" is walking");
//        }
//
//        void bark(){
//            System.out.println(name+" is barking");
//        }
//    }
//}


//ek or example dekhte h
// jisme hum complex number bnayenge jo non-primitive hota h
//kyuki complex number na hi int h na hi string isliye
//humme khud se data type bnana padhega
//which is complex jo hum oops classes  ki help se bna sakte h

//public static void main (String arg[]){
//complex C1= new complex ();
//C1.a=3;
//C1.b=4;
//C1.print();
//
//}
// static class complex {
//    int a,b;
//
//    void print(){
//        System.out.println(a+"+"+b+"i");
//    }
//
// }

    // method overload
    // do ya do se jyada same name k function bna sakte h
    // bs usme hume perameter ka dhayn rakhna h
    // perameter 1 ya 2 kr sakte h
    //perameter ka data type change kr sakte h
    //in dono ka difference hoga toh hi hum same name rakh sakte h function ka

//    public static void main (String args[]){
//        greet G1 = new greet();
//        G1.print();
//        G1.print(3);
//        G1.print("riddhi");
//        G1.print(18,5);
//
//    }
//    static class greet{
//        int count ;
//
//        void print (){
//            System.out.println("hello riddhika, good morning ");
//        }
//        // yr same naam ka ek or function bnate h
//        // yaha hum data type de rahe h
//        void print(String name ){
//            System.out.println(name+" good morning");
//
//        }
//        void print(int count){
//            for (int i = 1 ; i<= count ;i++ ){
//                System.out.println("hello good morning ");
//            }
//        }
//        // ab hum perameter bhi badha sakte h
//        void print( int count , int age ){
//            System.out.println(age+"hello"+count+"persons ");
//
//        }
//    }

 // constructor
 //greet G1 = new greet(); yaha () isme jo likhenge vo constructor hota h
    // constructor same name ka hona chahioye jo class ka h
    // constructr ka koi return  type nhi hota

//    public static void main(String args[]){
//        // aagr user definrd construtoe diya h toh default nhi likh sakte
//       // cat C1 = new cat() ;this is wrong when you write user defined constructor
//        cat C1 = new cat(7,8);
//        C1.print();
//        System.out.println(C1.age);
//        System.out.println(C1.count);
//
//
//    }
//    static class cat{
//        int age;
//        int count ;
//
//        void print(){
//            System.out.println("cat's are cute");
//        }
//
//        //default constructor;
////       cat(){
////            age = 4;
////            count = 6;
////           System.out.println("default");
////
////       }
//
//        // user defined constructor
//
//        cat(int a, int b ){
//            age = a;
//            count = b;
//            System.out.println(a+" is age "+b+" is count ");
//        }
//
//    }
                            // constructor overloader
    // we can also overload the constructor

//    public static void main (String args[]){
//        human H1= new human(4,8);
//        H1.talk();
//        System.out.println(H1.age);
//        System.out.println(H1.salary);
//        H1.population(7);
//
//
// same nam ka ek or constructor bnaya tha usko use kiya yaha

//        human H2 = new human("riddhika");
//        H1.talk();
//        System.out.println(H2.age);
//        System.out.println(H2.salary);
//        System.out.println(H2.naam);
//
//    }
//    static class human{
//
//        int age;
//        int salary;
//        String naam ;
//
//        void talk(){
//            System.out.println("human are talking too much");
//        }
//
//        void population(int count ){
//            System.out.println(count+" population are there ");
//        }
//
//        human(int a, int b ){
//            age=a;
//            salary= b;
//
//        }
//        // is hi constructor ko overload kr sakte h
//        //same nam ka ek or constructor bnaya
//        // isme ek data type change kr diya
//        human(String name ){
//            naam = name ;
//        }
//    }




}