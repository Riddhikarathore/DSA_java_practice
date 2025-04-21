

// question no. one


//import java.util.*;
//public class questions {
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        int num = sc.nextInt();
//
//        int a = num % 2 ;
//        if(a==0){
//            System.out.println("the number is even number!");
//        }
//        else {
//            System.out.println("the number is odd! ");
//        }
//    }
//
//}

//question 2
//
//import java.util.*;
//public class questions {
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        String name = sc.next();
//        System.out.println("hey "+name+" how are you?");
//
//    }
//
//}

//import java.util.*;
//public class questions {
//    public static void main (String args []){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("write principal here: ");
//        int principal = sc.nextInt();
//        System.out.println("write time here: ");
//        int time = sc.nextInt();
//        System.out.println("write rate here: ");
//        int rate = sc.nextInt();
//        int B = 1+rate*time;
//        float A = principal*B;
//
//        System.out.println("the simple interest is :"+ A);
//
//    }
//}

// question 3
//
//import java.util.*;
//public class questions {
//    public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("choose operator (+ ,- ,* ,% ,/ )");
//        char operator = sc.next().charAt(0);
//        System.out.println("write the first number:");
//        int number1 = sc.nextInt();
//        System.out.println("write the second number here: ");
//        int number2 = sc.nextInt();
//
//        if (operator == '+') {
//            System.out.println(number1 + number2);
//            System.out.println("the sum of these number is : ");
//        }
//            if (operator == '-') {
//                System.out.println(number1 - number2);
//                System.out.println("the subtraction of these number is :");
//            }
//                if (operator == '*') {
//                    System.out.println(number1 * number2);
//                    System.out.println("the multiplication of these number is :");
//                }
//                    if (operator == '%') {
//                        System.out.println(number1 % number2);
//                        System.out.println("the modular of these number is :");
//                    }
//                        if (operator == '/') {
//                            System.out.println(number1 / number2);
//                            System.out.println("the division of these number is :");
//                        }
//
//    }
//}
//
//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("write the first number: ");
//        int num1 = sc.nextInt();
//        System.out.println("write the second number: ");
//        int num2 = sc.nextInt();
//
//
//        if(num1>num2){
//            System.out.println("num1 "+ num1 + "is greater then num2 "+ num2);
//        }
//
//        else{
//            System.out.println("num2 "+ num2 + " is greater then num1 "+ num1);
//        }
//
//class Main {
//    public static void main(String[] args) {
//
//        int num = 3553, reversedNum = 0, remainder;
//
//        // store the number to originalNum
//        int originalNum = num;
//
//        // get the reverse of originalNum
//        // store it in variable
//        while (num != 0) {
//            remainder = num % 10;
//            reversedNum = reversedNum * 10 + remainder;
//            num /= 10;
//        }
//
//        // check if reversedNum and originalNum are equal
//        if (originalNum == reversedNum) {
//            System.out.println(originalNum + " is Palindrome.");
//        }
//        else {
//            System.out.println(originalNum + " is not Palindrome.");
//        }
//    }
//}
//
//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("height");
//        int height = sc.nextInt();
//        System.out.println("base");
//        int base = sc.nextInt();
//
//    int area= base*height/2;
//        System.out.println("area is :"+area);
//
//    }
//}


//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("length");
//        int length = sc.nextInt();
//        System.out.println("width");
//        int width = sc.nextInt();
//
//        int area= (length*width);
//        System.out.println("area is :"+area);
//
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the number :");
//        int num = sc.nextInt();
//
//        for(int i = 1; i<=num;i++){
//        if(num%i == 0)
//            System.out.println(i+ " ");
//        }
//    }
//
//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter a number:");
//        int num = sc.nextInt();
//
//        int a = 0;
//        while(num!=0){
//            int sum= a+num;
//            System.out.println(sum);
//            a++;
//        }
//
//    }
//}
//class Sum{
//    public static void main(String[] args) {
//        System.out.println("Enter the number to know their sum & Press 0 to get the Sum");
//                Scanner sc = new Scanner(System.in);
//        int s = 0;
//        int n;
//
//        do {
//            n = sc.nextInt();
//            s = s + n;
//        }while (n!=0);
//        System.out.println("Sum = " + s);
//    }
//}
//import java.util.*;
//public class questions {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("write the number");
//        int num = sc.nextInt();
//
//        for (int i = 1; i <= num; i++) {
//            if (num % i == 0) System.out.println(i+ " ");
//        }
//    }
//}
//import java.util.*;
//public class questions {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number:");
//        int num = sc.nextInt();
//        int sum =0;
//        while(num>0){
//            if(num>0) {
//                sum+=num;}
//
//            else {
//                break;
//            }
//            num=sc.nextInt();
//        }
//        System.out.println(sum);
//    }
//
//import java.util.*;
//public class questions{
    //public static void main (String args[]){
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter the numbers ");
//        int num = sc.nextInt();
//        int max = 0;
//
//        while(num>=0){
//            if(num>max){
//                max=num;
//            }
//            else{
//                break;
//            }
//            num= sc.nextInt();
//        }
//        System.out.println(max);
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main(String args[]){
//        Scanner sc= new Scanner (System.in);
//        System.out.println("enter the nth number");
//        int nth = sc.nextInt();
//        int firstnum= 0;
//        int secondnum= 1;
//        int count= 2;
//
//        while(count<=nth){
//            int fibo= secondnum;
//            secondnum=secondnum+firstnum;
//            firstnum=fibo;
//            count++;
//        }
//        System.out.println(secondnum);
//
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main(String args[]){
//        Scanner sc= new Scanner (System.in);
//        System.out.println("enter the numbers");
//        int num = sc.nextInt();
//        int max= 0;
//
//
//        while(num>=0){
//            if (num>max){
//                max=num;
//            }
//         else{
//             break;
//            }
//            num= sc.nextInt();
//        }
//        System.out.println(max);
//    }
//}
//import java.util.*;
//public class questions{
//public static void main (String args[]){
// Scanner sc = new Scanner (System.in);
//        System.out.println("enter the numbers ");
//        int num = sc.nextInt();
//        int max = 0;
//
//        while(num!=0){
//            if(num>max)
//               max=num;
//           num= sc.nextInt();
//        }
//     System.out.println(max);
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main (String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number ");
//        int num= sc.nextInt();
//        int factorial=1;
//
//        for (int i =1 ;i<=num;i++) {
//            factorial = factorial * i;
//
//
//        }
//        System.out.println(factorial);
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("enter your current meter reading");
//        int current = sc.nextInt();
//        System.out.println("enter your previous meter reading");
//        int previous = sc.nextInt();
//        int tariffRate = 6 ;
//        float GST = 0.05f;
//        int fixedCharges = 100;
//        //unit consumed
//        int uc= current - previous;
//        System.out.println("uc"+uc);
//        int tr= uc*tariffRate;
//        System.out.println("tr"+tr);
//        float gst = tr*GST;
//        System.out.println("gst"+gst);
//
//        float totalBill = tr+gst+fixedCharges;
//
//        System.out.println(totalBill);
//
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the numbers: ");
//        int numbers = sc.nextInt();
//        int sum= 0;
//
//        while(numbers>0){
//            if(numbers>0){
//                sum=sum+numbers;
//            }
//
//            int nunbers= sc.nextInt();
//            System.out.println(sum);
//        }
//
//        int length = (int) (Math. log10(numbers) +1);
//        int average = sum/length;
//        System.out.println("average = "+average);
//    }
//}
//import java.util.*;
//public class questions{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter thr nth number ");
//        int num = sc.nextInt();
//        int i ;
//        int firstNum= 0;
//        int secondNum= 1;
//        while(i<=num){
//            System.out.println(firstNum+",");
//        }
//        int nextNum;
//        nextNum = firstNum+secondNum;
//        firstNum= secondNum;
//        secondNum=nextNum;
//        i++;
//
//    }
//}

import java.sql.SQLOutput;
import java.util.*;
//public class questions{
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("value of A");
//        int a = sc.nextInt();
//        System.out.println("value of B");
//        int b = sc.nextInt();
//        System.out.println("value of C");
//        int c = sc.nextInt();
//
//        double discriminant ;
//        discriminant = b^2-4*a*c;
//
//        if(discriminant>0){
//            double root = -b +-
//        }
//
//
//    }
//}
//import java.util.Scanner;
//public class questions{
//    public static void main (String args []){
//        System.out.println("write the number you want to end ");
//        Scanner sc = new Scanner (System.in);
//        int num = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//
//       while( i <= num){
//           sum = sum+i;
//
//           i++;
//        }
//        System.out.println(sum);
//
//        }
//    }
import java.util.*;
//public class questions{
//    public static void main (String arg[]){
//        int i ;
//        int j;
//        int space;
//        int num=1;
//        for(i=1;i<=4;i++){
//            for(space=1;space<=4-i;space++){
//                System.out.print(" ");
//            }
//            for(j=1;j<=i;j++){
//                System.out.print(num+" ");
//                num++;
//            }
//            System.out.println();
//        }
//        }
//    }
// methods

//public class questions{
//
// static boolean getLeapYear(int year){
//     if(year%4==0 && year%100!=0 || year%400==0){
//         return true;
//     }
//     else{
//         return false;
//     }
//
//
// }
//    public static void main (String args[]){
//     if(getLeapYear(2001)){
//         System.out.println("its a leap year");
//     }
//
//     else {
//         System.out.println("it is not an leap year");
//     }
//    }
//}
//
//public class questions {
//    public static void main (String args[]){
//int nums[]= {1,3,6,3,7,4,5};
//int target=7;
//for(int num:nums){
//    if(num==target){
//        System.out.println("yes it is present");
//    }
//
//}
//    }
//}

//Array – 10 Easy Questions:
//        Find the largest element in an array.
//
//        Find the smallest element in an array.
//
//        Calculate the sum of all elements.
//
//        Count how many times a specific number appears.
//
//        Reverse the array.
//
//        Print all even numbers in the array.
//
//        Copy the array to another array.
//
//        Check if a number exists in the array.
//
//        Find the average of array elements.
//
//        Print array elements in reverse order.
//
//        🔶 Array – 5 Medium Questions:
//        Remove duplicates from an array.
//
//
//
//        Rotate array to the left/right by k steps.
//
//        Count pairs with a given sum.
//
//        Merge two sorted arrays.
//
//        ✅ String – 10 Easy Questions:
//        Count the number of vowels in a string.
//
//        Reverse a string.
//
//        Convert string to uppercase/lowercase.
//
//        Check if a string is a palindrome.
//
//        Count the number of words in a sentence.
//
//        Replace a character with another.
//
//        Compare two strings (equals or not).
//
//        Print each character of a string.
//
//        Remove all white spaces from the string.
//
//        Check if two strings are anagrams.
//
//        🔶 String – 5 Medium Questions:
//        Find the first non-repeating character.
//
//        Check for repeated substrings.
//
//        Compress the string (like "aaabb" to "a3b2").
//
//        Check if one string is a rotation of another.
//
//        Find the longest word in a sentence.
//


//public class questions {
//    public static void main(String args[]) {
//        int nums[] = {8,7,6,5,4,3,8};
//       for(int i = nums.length-1;i>=0;i--){
//           System.out.print(nums[i]);
//       }
//    }
//}
//
//public class questions {
//    public static void main(String args[]) {
//        int nums[] = {8, 7, 6, 5, 4, 3, 5};
//
//        int start = 0, end = nums.length - 1;
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//
//        // print reversed array
//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//    }
//}


//public class questions{
//    public static void main (String args[]){
//        int nums[]={4,6,7,9,8};
//        int max = nums[0];
//
//        for(int i = 1;i<nums.length-1;i++){
//            if(nums[i]>max);
//            max=nums[i];
//        }
//        System.out.println(max);
//
//    }
//}

//public class questions {
//    public static void main(String args[]) {
//        String name = "riddhika";
//        int vovels = 0;
//        int consonent = 0;
//        System.out.println(name.length());
//        System.out.println(name.substring(0, 8));
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.charAt(i);
//      if(ch >= 'a' && ch<= 'z'){
//          if(ch == 'a'|| ch== 'e'||ch== 'i'|| ch=='o'|| ch=='u'){
//              System.out.println(name.charAt(i)+" vovels");
//              vovels++;
//          }
//          else{
//              System.out.println(name.charAt(i)+" consonent");
//              consonent++;
//          }
//      }
//        }
//        System.out.println("vovels are "+ vovels);
//        System.out.println("conconenet are "+ consonent);
//    }
//}


public class questions {
    public static void main(String args[]) {
        String name = "madam";
        String str ="";

        for(int i = name.length()-1;i>=0;i--){
            str+= name.charAt(i);
        }
if(str.equals(name)){
    System.out.println("its palindrom ");
}
else{
    System.out.println("its not an palindrom");
}
    }
}