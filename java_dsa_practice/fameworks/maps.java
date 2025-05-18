package fameworks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class maps {

    //sbse pehle toh iske upar koi collection interface nhi hoga
    //jisse hum collection wali methods use nhi kr sakte

    //isme 2 cheeze store hoti h
    //peghli key or dusra value
    //keys jo hogi vo unique hogi
    //values same ho sakte h pr keys kabhi same nhi

    //map duplicate keys ko accept nhi jkrega
    //kek key ek single value se associate hogi

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        //jese yaha bs ek hi value h integer

        //pr hum map m 2 lete h ek key hoti h or ek value hoti

        Map<String,String> m1 = new HashMap<>();
        //left side pr interface likha then right side pr jis jis class ne usko implement kitya h hum usko likhte h

        //now methods

        //ab yaha add metthod nhi chalega
        //toh yaha bs map ki methods chalti h
        //or yaha element add krne k liye put ka use hota h


        m1.put("rc","chitra");
        m1.put("ru","utsavi");
        m1.put("rs","shreya");
        m1.put("rd","devi");
        m1.put("rs","sanskari");
        //ab ye key humne rteapeat krdi toh ye ab yaha nhi chalegi




        System.out.println(m1);
        //ab yha randum form m data aayega
        //or aagr humne same key pass kiya h toh pehle wali value nhi baad wali value assing hogi




    }



}
