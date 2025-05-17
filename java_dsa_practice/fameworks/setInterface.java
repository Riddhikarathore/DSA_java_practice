package fameworks;

import java.util.*;

public class setInterface {
    //ENUM

    enum colour {

        RED,GREEN,BLUE,ORANGE
        //BS YE HI SUPPORT KREGA

    }

    public static void main(String[] args) {
        //ENUM

        System.out.println(colour.BLUE);

        //aagr iska set bnana ho toh vo bhi bn jayega


        EnumSet<colour> color = EnumSet.allOf(colour.class);



        //set interface use hota h time complexity km krne k liye
        //duplicate allow nhi horte yaha

        //set implement krta h
        //enumset
        //hashset
        //linkedhashser
        //treeset


        //let's go with hashset
        //hashset - duplicate not allowed
        //        - random elements aayenge


        Set<String> s1 = new HashSet<>();

        //add krte h elements ko

        s1.add("riddhika");
        s1.add("riddhi");
        s1.add("riddha");
        s1.add("riddhi");
        s1.add("ridhi");
        s1.add("rathore");
        //duplicate allow nhi hoga yaha riddhi ek bar hi print hoga
        //or random form m element milenge


        System.out.println(s1);

        //ab linkedhashset dekhte h


        Set<Integer> s2 = new LinkedHashSet<>();

        s2.add(1);
        s2.add(6);
        s2.add(9);
        s2.add(3);
        s2.add(2);
        s2.add(1);

        //yaha bhi duplicate nhi chalega
        //but ye systametically jesa humne diya wesa hi element aayenge us hi form m

        System.out.println(s2);


        //ab treeset dekhte h

        Set<Integer> s3 = new TreeSet<>();

        s3.add(23);
        s3.add(35);
        s3.add(55);
        s3.add(22);
        s3.add(67);
        s3.add(23);

        //ye bhi duplicate allow nhi krega
        //but yaha elemnt sorted form m hote h
        //chhote se bda

        System.out.println(s3);


        // ab enum dekhte h or ye jyada use m nhi aata wese

        //jb hum chate h ki bs koi ye hi support kre
        //jese ki koi teen colouyr ko hi support kre











    }
}
