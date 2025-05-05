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

        public static void main (String args[]){

          dog<String> d1 = new dog<>("riddhika");
            System.out.println(d1.name);
          dog<Integer> d2 = new dog<>(123);
            System.out.println(d2.name);
          dog<Boolean> d3 = new dog<>(false);
            System.out.println(d3.name);
          //yah sb tarah k data type chl jayenge
          //pr ye dyan rakhna ki wapper class hi chalega
          //primitive type nhi chalega

        }
        //ab generic class bnate h

    static class dog<E>{
            E age ;
            E name ;
            E id;

           public dog(E name){
                this.name = name ;

            }
    }



}




