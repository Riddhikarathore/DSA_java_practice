package fameworks;

import java.util.Collection;
import java.util.Iterator;
import java.util.*;

public class queueinterface {
    //first in first out

    public static void main(String[] args) {
        //methods of queue

//        Queue<Integer> q = new LinkedList<>();
//        q.offer(10);
//        q.offer(40);
//        q.offer(50);
//        q.offer(10);
//        q.offer(60);
//
//        System.out.println(q);
//
//        //collection interface method implements here also
//        q.add(30);
//        System.out.println(q);
//        //ye add kr dega element ko last m
//        q.offer(20);
//        System.out.println(q);
//        //ye bhi element ko last m add krega
//        q.remove(60);
//        System.out.println(q);
//        //ye simple remove kr dega
//        System.out.println(q.poll());
//        System.out.println(q);
//        //ye element ko last se remove krega
//        System.out.println(q.element());
//        //ye exeption dega aagr queue empty hoga toh
//        //ye btayega ki next kya remove hone wala h
//        System.out.println(q.peek());
//        //ye bs btayega ki next kya remove hoga krega nhi bs btayega
//        //ye null de dega aagr empty hua toh
//
//
//        //ab iteration dekhte h
//
//        //while use krke hoga
//
//        while(!q.isEmpty()){
//            System.out.println("iteration by while "+q.poll());
//        }
//        //isme bhi aage se element niklte jayenge


        //ab smjhte h deque

        //isme hum dono side se element ko nikal or add kr sakte h

        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(10);
        d1.add(20);
        d1.add(40);
        d1.add(50);

        System.out.println(d1);

        //aage add krna ho toh

        d1.addFirst(60);
        System.out.println(d1);
        d1.offerFirst(70);

        System.out.println(d1);

        //aagr last m add krna ho toh

        d1.addLast(5);
        System.out.println(d1);
        d1.offerLast(0);

        System.out.println(d1);
        System.out.println("remove");

        //aagr first se remove krna ho toh
        System.out.println("first remove");
        d1.removeFirst();
        System.out.println(d1);

        d1.pollFirst();
        System.out.println(d1);

        //aagr last se remove krna ho toh
        System.out.println("last remove");
        d1.removeLast();
        System.out.println(d1);

        d1.pollLast();
        System.out.println(d1);

        //aagr accessing krna ho value ko
        System.out.println("aagr aage se dekhna ho toh");

        System.out.println(d1.getFirst());
        System.out.println(d1.peekFirst());

        System.out.println("aagr peeche se dekhna ho toh");

        System.out.println(d1.getLast());
        System.out.println(d1.peekLast());


        //so that's all about queue methods

        //now
        //stack and queue using arraydeque

        //stack operation
        //push nd pop

        //queue operation
        //add or offer
        //remove or poll
        System.out.println("stack and queue using arrayqueue");

        ArrayDeque<Integer> a1 = new ArrayDeque<>();

        a1.push(10);
        a1.push(20);
        a1.push(30);

        System.out.println("stack "+a1);

        System.out.println(a1.pop());
        System.out.println(a1);
        System.out.println(a1.peek());

        ArrayDeque<Integer> a2 = new ArrayDeque<>();

        a2.offer(40);
        a2.offer(50);
        a2.offer(60);

        System.out.println("queue"+a2);

        System.out.println(a2.poll());
        System.out.println(a2.remove(50));
        System.out.println(a2);
        System.out.println(a2.peek());


        //so that's how we can use queue and stack method  ussing arrayqueue


        //by default jiski value sbse chhoti h vo pehle bahar niklta h
        //hum change bhi kr sakte yh comparators ka use krke






    }


}
