package fameworks;

import java.util.*;

public class listinterfaces {
    //let's practice all methos of collection on list

    public static void main(String[] args) {

//        //creating a list by using arraylist
//
//        List<Integer> list = new ArrayList<>();
//
//        //now add elemnts
//
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(60);
//        list.add(90);
//
//        System.out.println(list);
//
//        //now perform methods of collection
//
//        System.out.println(list.size());
//        System.out.println(list.contains(60));
//        System.out.println(list.contains(2));
//        //System.out.println(list.remove(1));
//
//        System.out.println(list);
//
//
//        //now these are the method of collection interface whicvh are present in list,queue,stack
//
//
//        //now let's see the list interface methods
//
//
//        System.out.println(list.get(3));
//        list.set(0,5);
//        //ye replace krega
//        System.out.println(list);
//        list.add(1,10);
//        //ye replace nhi krega ye baki k element ko right m kr dega
//        System.out.println(list);
//        System.out.println(list.indexOf(30));
//        list.set(4,30);
//        System.out.println(list);
//        System.out.println(list.lastIndexOf(30));
//        //list.iterator(2);
//        System.out.println(list.subList(0,3));
//        //zero wala included h but 3 wala nhi rahega
//
//
//        //ab iterators dekhte h
//
//        //first method for iterator
//
//        for(int i=0;i< list.size();i++){
//            System.out.println("for loop use kiya "+list.get(i));
//        }
//
//
//        //second method for iterator
//
//        for(int number: list){
//            System.out.println("ye for each se hua "+number);
//        }
//
//        //third method for iterators
//
//        Iterator<Integer> numbers = list.listIterator();
//        while(numbers.hasNext()){
//            System.out.println("ye iterators use krke hua"+numbers.next());
//        }

//aagr string m ho list toh hum
        //Iterator<String> numbers = list.listIterator();
        //integar ki jgh string likh lenge

        //or aagr hume sublist nikalni ho toh
      //  List<String> smallstring = list.sublist();
       // ese hum kr sakte h

        //so that's all about the list interface method
        //**note that collection interface mathods are used in list but list interface method are not
        //use in collection interface**



        // ab stack smjhte h
        //stack lilst ko implement krta h

        //stack ,elements are stored and accessed in last in first out manner
        //add top pr hoga
        //remove bhi top se hoga

        //method jo stack m hoti h


        Stack<String> s1 = new Stack<>();
        s1.push("riddhika");
        s1.push("riddhi");
        s1.push("riddhu");
        s1.push("riddha");
        s1.push("riddhi piddhi");
        System.out.println(s1);
        //push method se hum add kr rahe h

        s1.pop();
        System.out.println(s1);
        //uppar wala element gayab kr dega
        //matlab jo sbse last m h vo remove hoga

        System.out.println(s1.peek());
        //ye bs btayega ki next kya pop hoga remove nhi krega bs btayega

        System.out.println(s1.empty());
        //ye btayega stack kahli toh nhi h


//so that's all about list
        //list implements
        //arraylist
        //vector
        //stack
        //linkedlist

    }

}
