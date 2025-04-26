package oops.encapsulation;
// importing a package
//like kisi package se hum ko kuch import kr wana h ya access kr ana h toh hum import krte h
//aagr sb kuch import krna h kisi package se toh
//aagr kuch hi cheeze ya kuch specific import kr wana h toh simple

import org.w3c.dom.ls.LSOutput;

//java m import statement class or package k beech m hi likhte h
// access modifier are used to set the accessibility
//first public access modifier
public class teachers {
    //jo sb jgh access ho sakta h i mean sb package m sb class m sb jgh

    public int age ;
    //ab ye dusre class m or dusre package m chl jayega

    //second is private
    private String name;
    // ab ye sirg yaha hi chalega bahar kisi class m nhi or na hi kisi package m kyuki ye private h

    //third is default
    String subject;
    //ye ab default acees modifier h ye bs iss hi package m chaelga bahar kahi nhi
    // default ko hum package private bhi bolte h

    //fourth is protected

    protected int count ;
    // iska matlab h ki ye bs waha chalega jaha parent class ko access kiya ho bs wahi
    // jese aagr dusri koi package ho or usne iss class ko inherit kr liya ho toh ye access ho jayega


    // ab dekhte h main encapsulation kyu use kr rahe h hum
    //basically access modifier se hi humko encapsulation smjh aayega
    //encapsulation tb krte h jb humko kuch ko access dena hota h or kuch ko nhi ye ab humare hath m hota
    //ki humare package ki class or methods kaha kaha access ho sakti h or kon kr sakta h


    //jese aagr mene diya public int table toh iska matlab m chahti hu sb access kr paye
    //pr aage mene private likh diya toh bs mera package hi use kr payega bs
    //or aagr dusre package m use krna  ho toh hum uska alternative bna lete h
    //jese public void print method bnalo jisme table ko hum print krwa sakte h
    //dusri package m kyuki vo public h
    // toh isse hum ye smjhe ki ye data ko hide krne m bhi help krta h


    // now the last in encapsulation is the static keyword

    //so static keyword use krne se hume uska object nhi bnana padhta h
    //so basically if we want to acees class members without creating an instance of the class
    //we need to declare the class member static

    static void print(){
        System.out.println("riddhika");
        //ab ye static h isliye koi obj ki need nhi h isko access krne k liye
    }

}
