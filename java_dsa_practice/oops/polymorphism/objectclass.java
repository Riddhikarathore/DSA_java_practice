package oops.polymorphism;

//public class objectclass {
   // public static void main(String[] args) {
    // train obj = new train(2022,"A1");
    // train obj2 = new train(2022,"A1");
     //so basically toString obj ko human readable  string formate m krdeta h
        //System.out.println(obj.toString());
        //nhi likhoge toh bhi ye toString objectclass se extends khud se ho kr implement ho jayegi




        //ab equals() dekhte h
        //basically eqals bs btata h ki obj same h ya nhi
        //System.out.println(obj==obj2);
        //toh wese toh isko true dena chahiye kyuki model or year same h
        //pr nhi ye false dega kyuki dono obj alag alag memory m allocate hue h
        //dono ka referance aalag h
        //toh ye false dega

 // but hum aagr chahte h ki nhi year or medal k basis pr hi compare ho toh
        //humko overriding krke generate krna hoga
      //  System.out.println(obj.equals(obj2));
        //ab true dega kyuki humne generate kiya h




        //ab hashcode() dekhte h
        //hashcode basically har obj  ka apna aalag ek code hota h
      //  System.out.println(obj.hashCode());
      //  System.out.println(obj.hashCode());
        //yaha aalag aalag hashcode aaye h
        //hashcode or equals ka ek contact bhi hota h
        //see aagar do obj same h toh unke equals same dega
        //aagr do obj same h toh unka hashcode bhi same hona chahiye

        //hashcode basically ek unique identity h obj ki
        //aagr do obj k hashcode same ho jaye toh hum consider krte h ki collision ho gya h
        //or vo hum kabhi nhi chahte
        //hum chahte h ki aalag aalag hashcode aaye obj k


  //  }
//}

//class train{
   // int year;
   // String model;

   // public train(int year,String model) {
      //  this.year = year;
      //  this.model = model;
   // }
        //we can generat our tostring also

//        @Override
//        public String toString(){
//            return"train"+model+"year"+year;
//
    //}

    // ab humko equals krwana h model or year k basis pr
    //toh hum overriding kr sakte h
//    @Override
// public boolean equals(Object obj){
//        train that = (train)obj;
//        if(this.model.equals(that.model) && this.year == that.year ){
//            return true;
//        }
//        return false;
//
// }


    //ab dekhte h hashcode ko overriding krwate h
    //kyuki hum nhu chahte ki collision ho
    //toh ab generate krte h hashcode ko
//public int hashcode(){
    //    int num = 79;
     //   num += year;
     //   num += model.hashCode();
     //   return num;
//ye hashcode ko generat kr diya humne

//}

//}


// ab polymorphism dekhte h
//so polymorphism allow us to perform a single action in different ways
//in other words ,polymorphism allow you to define one interface and have multiple implimentation

// polymorphism are of 2 types

//compile time polymorphism --> ye overloading hoti h
//matlab isko hum compuile time m hi check kr lete h


//public class objectclass{
//    public static void main(String[] args) {
//        //compile time polymorphism
//        //pehle hi dikh jata h konsa method use hoga
//        //overloading ki wjh se
//        compiletime c1 = new compiletime();
//        c1.salary();
//        //ye yahi se smjh aa gya ki bhai ye konsa method lega or kya output aayega
//        c1.salary();
//        //ye samne dikh raha h ki parameter diya h matlab konsa method use hoga or kya output aayega
//    }
//}
//class compiletime{
//    void salary (){
//        System.out.println("km h bhai");
//    }
//
//    void salary (int num ){
//        System.out.println("km h bhai"+num);
//    }
////    ab ye overloading ho gyi
//    //kyuki humne same naam ka method liya pr iske parameter change kr diye
//}

//ab dekhte h type 2
//run time polymorphism

//ye overriding hota h basically
//means aagr humne do class bnai ek parent or ek child
//or dono m ek method same de dedi kuch change krke
//toh vo overriding hua
// ab ye run time pr pta chlta h ki konsa method call hua h

class runtime{
    void method2(){
        System.out.println("riddhika");
    }

}
//or ab iski child class bnai

class runtimechild extends runtime{
    void method2(){
        System.out.println("rathore ");
    }

        }
        //or ab m main method m call kru toh..

public class objectclass{
    public static void main(String[] args) {
        runtime r1 = new runtimechild();
        r1.method2();
        //ye humko just upar wali class ka output dega matlab child class ka
        //iska output rathore aayega

        //these called run time polymorphism
    }
}

//ye tha polymorphism ka concept
