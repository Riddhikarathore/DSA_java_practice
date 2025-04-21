//public class chapter2operator
//{
   // public static void main(String args[])
   // { //question 1
       //float a= 7/4.0f* 9/2.0f;
       //System.out.println("the solution is : " +a);

        //question 2
       // char grade = 'B';
        //grade = (char) (grade + 8 );
        //System.out.println(grade);

        // decrypting the grade
        // grade = (grade - 8 );
        //System.out.println(grade)
        
        //question 3
        //Scanner sr = new Scanner (System.in);
        //int num = sr.nextInt();
        //System.out.println(num>9);

        // question 4
        //int a= ('v'*2 - 'u'*2)/2*'a'*'s';
        //System.out.println(a);
       // float a = 2, s = 2, v = 8, u = 2;
        //float exp = (v*v - u*u) / (2*a*s);
        //System.out.println(exp);

        // question 5
        //int x= 7;
          //      int a= 7* 49/7 + 35/7;
            //            System.out.println(a);

   // }

//}

import java.util.*;
public class chapter2operator{

public static void main(String[] args){

        System.out.println("Enter rows in table: ");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println("Enter col in table: ");

        int y = input.nextInt();

        int array[][]= new int[x][y];


        System.out.println("Enter array: ");


        for(int row=0; row<x ;row++){
        for(int col = 0; col<y ; col++) {

        array[x][y]=input.nextInt();

        }
        }

        System.out.println("Array is : ");

        for(int row=0; row<x ;row++){
        for(int col = 0; col<y ; col++) {

        System.out.println(array[x][y] + "\t");

        }
        System.out.println();

        }



        }
        }
