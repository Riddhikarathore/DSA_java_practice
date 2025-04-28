package oops.abstraction;
//
//public class vehicle {
//    public static void main(String[] args) {
//        bike obj1 = new bike();
//        //so ye basically yaha chal jayega
//    }
//
//}
// class bike{
//    //ye normal class h
//}

//ye bina error k chalega

//on the other hand

public class vehicle{
    public static void main(String[] args) {
       // car obj1 = new car;
        //ab ye yaha meko error dega kyuki ye ek abstract class ka obj h
        //or abstract class ka koi obj nhi hota
        //vo bs simple concept hote h

        bike obj1 = new bike ();
        //ab obj bna sakte h hum
        obj1.speed();
      //  obj1.sound();
        //ye aaram se chalega bina error k

    }
}
abstract class car{
    //ye ek abstract class h
    // isme hum bs declare kr sakte h
    //but define nhi kr sakte
    //basically hum bs concept dete h

//    abstract void speed(){
//        //ye error dega
//        //kyuki yaha hum bs declare krte h define nhi kr sakte
//    }

    // so we have to only declare it
    abstract void speed();
    //for defined it and use these abstract class we have to create a child class
    //bye using extends

    //ab hum yaha abstract class k andar non abstract class bhi bna sakte h
   // void sound();
    //ab ye erroe isliye kyuki ab yaha non abstract ko define krna hoga yahi pr
    //yahi iska implement yahi ho jayega

//    void sound(){
//        System.out.println("broom broom");
//        //ab ye humne yahi implement kr diya so child class m need nhi h implement krne ki
//        //but ya change kr sakte h
//    }

   // abstract void model();
    //so basically aagr hum ek hi ko child m implement krenge toh vo error dega isliye humko
    //sari class ko implement krna hota h

}

//to use those abstract class we make child class
//class bike extends car {
    //ab yaha bhi ye ek error de raha h kyuki
    //is class ko tumko ya toh abstract krna hoga
    //ya fir hume isko implement krna hoga

    //aagr hum abstract krte h koi koi sence nhi bnega kyuki same usko bhi hum use nhi kr payenge

//}

//toh hum kya krenge hum implement kr denge jitne bhi methods h usme
//ye compulsory hota h

//so again

class bike extends car {
//yaha hum right click krke implement wale option se sare methos ko implement krwa sakte h
    //ye khud intellij kr deta h humare liye
    //yaha ye override isliye likh raha h kyuki ye method humne wapis likhi h upar wali class se
    //which basically overriding
    @Override
    void speed() {
//yaha hum declare kr sakte h aaram se

        System.out.println("very fast");
    }

//    @Override
//    void model() {
//
//    }
    //ye khud intellij kr dega
    //ab hum iska obj bhi bna sakte h or use bhi kr sakte h

//    @Override
//    void sound(){
//        System.out.println("droom droom ");
//    }
    //so if we change here the implementation so output will came with these only
}

// hum ek normal class k andar ek abstract class nhi  bna sakte h
//but ek abstract class k andar hum normal method bna sakte h
//lets make a normal class

//class bus{
    //ye toh h apni normal method
   // void lights(){
     //   System.out.println("dim dim ");
   // }
//ye chalega


    //ab hum abstract method bhi bna sakte h
   // abstract void seats()
    //ye error de dega kyuki normal class m abstract method nhi chalega

    //ab ye error na aaye isliye humko class ko bhi abstract krna hoga
//}

//so these is all about the java abstract class
//so similar to abstarct class we have java interface
//basically abstract k andar hum ek hi class ko extends kr sakte h
//but in interface hum ek se jyada classes ko implement kr sakte h
// lets see interface in another class
