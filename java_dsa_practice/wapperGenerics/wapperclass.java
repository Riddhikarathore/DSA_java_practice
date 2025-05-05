package wapperGenerics;

public class wapperclass {
    public static void main(String[] args) {
        //wapper class bs hummare primitive data ho wrap krke rakhti h ye ek class hoti h isme obj hote h
        //like Integer , Long , Boolean

        //autoboxing - ye humare int ko Integer m convet kr deta h

        Integer obj1 = new Integer(12);
        //12 ko ye integer m kr dega

        Integer obj2 = new Integer("122223");
        //ye string ko bhi int m kr dega

        System.out.println(obj2*2);
        //ye bhi chl jayega ab kyuki ab obj2 convert ho gya integer m


        //outboxing -ye humare Integer ko wapis se int m convert kr deta h

        int age = obj2;
        //ye ab wapis string bn jayega
        int age2 = obj1;
        //ye wpis se jese the wese ho jayenge

//ye hoti h wapper class






    }
}
