package fameworks;
//basically collection framework hume interfaces or classes provide krta h to implement various data structure and algo

import java.util.ArrayList;
import java.util.List;

public class collectioninterface {
    public static void main(String[] args) {
        //ab yaha hum ek list bna kr dekhte h jo arraylist ko impliment kr rahi h

        List<Integer> l1 = new ArrayList<>();
        //ye generic use krta h
       // matlab ek class m hum kitne bhi data type de sakte h which paramtieced data
        //yaha wapper class hi allow hoti h
        //matlab yaha hum int nhi use kr sakte wapper class hi
        //so basically ye kaam toh array se bhi ho raha tha pr waha ek problem tha ki
        //hum array ki size ko change nhi kr sakte the
        //or yaha aaraylist m hum size apne hisab se bda sakte h or km bhi kr sakte h
        //isliye arraylist use krna jyada effective hota h
        //example
      //  int a[] = new int[5];
        //ab yaha size fix ho gya h isliye hum arraylist use krna chahiye
        //ab elements add krne k liye hum add ka use krenge

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);

        System.out.println(l1);
        //ye array k jese dikhega output same wesa aayega
        //kyuki ye internolly toh array ko hi chal raha h

//so ab method use kre collection ki

        List<Integer> l2 = new ArrayList<>();
        l2.add(20);
        l2.add(70);
        l2.add(90);
        l2.add(10);
        l2.add(20);


        //first

        System.out.println(l1.size());

        //second

        System.out.println(l1.isEmpty());

        //third

        System.out.println(l1.contains(50));

        //fourth

        System.out.println(l1.add(60));
        System.out.println(l1);

        //sixth

        System.out.println(l1.remove(3));
        System.out.println(l1);

        //seventh

     //   System.out.println((l2));

        //eigth

        System.out.println(l1.addAll(l2));

        //ninth

        System.out.println(l1.removeAll(l2));

        //tenth

        System.out.println(l1.retainAll(l2));

        //eleventh

        l1.clear();

//ab aage ka dekhte h

    }
}




