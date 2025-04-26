package oops.encapsulation;

public class person {
public static void main (String args[]){

    teachers.print();
    //ye mene seedha class k naam se hi access kr liye kyuki ye static tha or koi obj ki need nhi h isme
    //or the main thing is ki ye sb jgh same rahega aagrr m yaha riddhika ki jgh rathore krungi toh sb jgh rathore
    //ho jayega kyuki static h or sb jgh same hota h

    // hum final bhi lga sakte h static k sath so that ki suki value koi change na kr paye
    //example jese humare pass math.pi hota h ye static final hota h

    teachers p1 = new teachers();
    // ab jese humne age public di thi isliye hum usko access kr pa rahe h
    p1.age=12;
    System.out.println(p1.age);

    // ab aagr hum name ko access krwana chahe toh nhi hoga kyuki vo private h
   // p1.name= "riddhika";
    //ye eeroe dega kyuki ye private bnaya h humne

    p1.subject= "java";
    //ye yaha toh chl gya default waha but ab hum isko dusri package  m chala kr dekhte h

    p1.count=3;
    //ye protected h toh iss class m toh chalega hi

    System.out.println(Math.max(3,6));
    //toh yaha math ek static h kyuki iske liye hume koi object nhi bnana padha



}
}
