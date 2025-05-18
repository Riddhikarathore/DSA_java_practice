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


        //ab aagr humko chahiye koi element toh

        System.out.println(m1.get("ru"));

        m1.putIfAbsent("ra","anshi");
        //isse hum ek key or value add kr sakte h aagr vo present nhi h toh

        m1.putIfAbsent("ru","riddhi");
        //ye nhi add hoga kyuki ye toh key already h isliye

        System.out.println(m1);

      //  m1.getOrDefault("rs","ram");

        System.out.println(m1.containsKey("ru"));
        System.out.println(m1.containsKey("up"));
        //ye sb btayega ki key present h ya nhi true ya false


        System.out.println(m1.containsValue("sanskari"));
        System.out.println(m1.containsValue("ram"));
        //ye bs btayega ki value present h ya nhi




        m1.replace("ru","ruhi");
        //ye bs replace kr dega us key ki value ko

        m1.remove("ru");
        //ye delet hi kr dega key ko

        //ab aagr apnko pura aalag se sirf key ya values ka set chahiye ho toh

        Set<String> keys = m1.keySet();
        System.out.println(keys);
        //isse kets ka set mila


       // Set<String> s2 = m1.values();
        //ye collection se hoga kyuki set toh duplicate aloow hi nhi krega isliye collection

        Collection<String> values = m1.values();
        System.out.println(values);
        //ab isse humko values ka set mil jayega

        System.out.println(m1.entrySet());
        //isse bs dono ka set aayega
        System.out.println(m1);


        //ab iteration dekhe


        Set<Map.Entry<String,String>> entries = m1.entrySet();

        for(Map.Entry<String,String> entry : entries){
            System.out.println(entry.getKey()+","+entry.getValue());
        }







    }



}
