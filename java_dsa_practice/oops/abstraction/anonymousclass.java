package oops.abstraction;

//public class anonymousclass {

//ab main m call krte h



        // anonymous class ka matlab hota h ki aap ek class k andar dusri class bhi bna sakte ho
        //bina dusri class ko naam diye
        //anonymous matlab koi naam nhi
        //anonymous class ek hi bar use ki ja sakti h

        // ye valid h krna but the thing is ki humko naam dena padh raha child class ko
//    class innerclass extends outerclass{
//        // see ye error nhi dega
//    }
//

public class anonymousclass{
//ab hum isko main method m chala kr dekhte h
public static void main(String[] args) {
    father obj1 = new father();
    obj1.walk();

}






////bina naam diye hum child class bna lenge
//
    father obj1 = new father() {
//        //ab yaha apn dusri methods bhi dal skate h
       public  void talk(){
//            System.out.println("talking talking ");
        }
//
//        //or hum parent wali class m jo method h usko bhi override kr sakte h
//
        public void walk(){
//            System.out.println("walking walking ");
        }
    };
//
}
//
class father{
   public  void walk(){
       System.out.println("walkinggggg");

   }

}
//anonymous class app tb use kr sakte ho jb apko pta ho ki ye ek hi bar use krna h


//so ye toh hua ek tarika ab ek or tarika h anonymous class ka
//interface se bhi hum anonymous class bna sakte h


//lets see
// public class anonymousclass {
//
//
//     //ab aagr m main method m call kru toh sb chal jayega
//
//    public static void main(String[] args) {
//      obj2.standing();
//      obj2.watching();
//      obj2.playing();
//
//
//    }
//
//     // ab yaha hum bina naam diye child class bna denge interface ki bhi
//    //but as we now ki obj nhi bn sakta still hum child class bna lenge
//
//   //mother obj2 = new mother();
//   //ye eorror dega
//   //ye ab hum obj nhi bna sakte h or wese bhi humko class bnani h
//
//   static  mother obj2 = new mother (){
//// pr jese ki hum jante h interface ko imp[lement krna padhta h toh sare methods yaha pehle impliment hounge
//        @Override
//        public void standing() {
//            System.out.println("standing ");
//        }
//
//        @Override
//        public void watching() {
//            System.out.println("watching");
//        }
//
//
//        public void playing(){
//            System.out.println("running");
//        }
//    };
//
//
//}
//
//interface mother {
//   void standing();
//
//   void watching();
//
//    void playing();
//}

//so ye tha anonymous class
// or iska use hum comparators m krte h