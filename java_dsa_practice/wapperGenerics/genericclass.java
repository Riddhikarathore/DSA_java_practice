package wapperGenerics;

public class genericclass {

  //  public void main(String[] args) {
//
//
//        dog d1 = new dog ("yolo");
//        //ye toh chalega lekin what if hume chahiye ki nhi name int bhi chl sakta h
//        //toh us case m ab humko nyi class bnani padhegi
//        //pr generic class se ye possible h ki hum ek hi class m sare primitive data typr dal sakte h
//
//
//
//    }
//    class dog{
//        int id;
//        String name ;
//
//        public dog(String name){
//            this.name = name ;
//        }

//        public static void main (String args[]){
//
//          dog<String> d1 = new dog<>("riddhika");
//            System.out.println(d1.name);
//          dog<Integer> d2 = new dog<>(123);
//            System.out.println(d2.name);
//          dog<Boolean> d3 = new dog<>(false);
//            System.out.println(d3.name);
//          //yah sb tarah k data type chl jayenge
//          //pr ye dyan rakhna ki wapper class hi chalega
//          //primitive type nhi chalega
//
//        }
//        //ab generic class bnate h
//
//    static class dog<E>{
//            E age ;
//            E name ;
//            E id;
//
//           public dog(E name){
//                this.name = name ;
//
//            }
     //hum ek ki bjaye do bhi paramatised data pass kr sakte


    public static void main (String args[]){
        genericmethod("riddhika");

        dog<Integer,String,String> d1 = new dog<>(12,"riddhika","ghat54");
        System.out.println(d1.age);
        System.out.println(d1.name);
        System.out.println(d1.id);
        dog<Integer,String,String> d2 = new dog<>(123,"riddhi","12rgat");
        System.out.println(d2.name);
        dog<Integer,String,String> d3 = new dog<>(435,"chhotu","gust56");
        System.out.println(d3.name);
        //yah sb tarah k data type chl jayenge
        //pr ye dyan rakhna ki wapper class hi chalega
        //primitive type nhi chalega

    }
    //ab generic class bnate h

    static class dog<E,V,C> {
        E age;
        V name;
        C id;

        public dog(E age,V name,C id ) {
            this.name = name;
            this.age= age;
            this.id=id;



        }



//method bhi generic ho sakti h


        }
    static <T> void genericmethod(T data){
        System.out.println(data);
    }

}




