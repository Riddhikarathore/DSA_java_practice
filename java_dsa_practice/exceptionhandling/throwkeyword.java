package exceptionhandling;
import java.util.*;

public class throwkeyword {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
        System.out.println("write age ");
     //   int age = sc.nextInt();

        //ab let's suppose hum chahte h ki jiski age 100 se jyada ho waha execption aa jaye
        //toh ab hum yaha hum humara khudka execption de rahe h
        //throw ki help se

       // if(age>100){
         //   throw new Exception();
            //ab ye yaha error dega kyuki ya toh apn ko ye try catch k andar likhna hoga
            //ya fir hum main method k sath throws krde exception ko

// ab try ki help se krke dekhte h

            try {
                int age = sc.nextInt();
                if (age > 100) {
                    throw new Exception();
                }
            }
                catch(Exception e){
                    System.out.println("no allowed");

            }
        }

    }

