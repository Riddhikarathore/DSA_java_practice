package oops.abstraction;

public class interfaces {
    public static void main(String[] args) {
       // line obj1 = new line ;
        //ye yaha error dega kyuki ye bhi object nhi bnata h jese abstract nhi bnata h

        rectangle obj1= new rectangle ();
        System.out.println(obj1.count());
        obj1.draw();
        obj1.lenght();
        System.out.println(obj1.num());


    }
}

//ab ye ek interface class h
interface line {
    //void draw(){
        //ye yaha hum define nhi krenge as abstract class
   // }

    void draw();
    // yaha ye method khud se hi abstract h humko likhne ki need nhi h kyuki ye humasha abstarct hi rahegi
    //or public likhne ki bhi need nhi h ye public hi rahegi otherwise hum isjko use kese krengwe

    int num();
    //ye yaha static rahega pehle se hi
    // or public bhi
}

//now ab hum ek or interface class bnate h

interface diagonal{

    void lenght();
    int count();

}

//ab the main concept was ki hum interface ki help se 2 ya 2 se jyada class ko implement kr sakte h ek sath
//interface m extends ki jgh hum impliment likhte h

//now make a child class so that we can use our parent classes

class rectangle implements line,diagonal{
    //ye yaha humne dono ko sath m kr liya
    //but ye error de raha h kyuki humne abhi implement nhi kiya methods ko
    //ab implement kro
    @Override
    public void draw() {
        System.out.println("drawing");
    }

    @Override
    public int num() {
        int num = 3;
        return num;
    }

    @Override
    public void lenght() {
        System.out.println("bohot bda");

    }

    @Override
    public int count() {
        int count = 20;
        return count;
    }
    //so ab hum inka object bna sakte h or use kr sakte h interfaces ko

}
// so these is all about the interface
//it is similar to abstarct but interfaces can take 2 or more classes

