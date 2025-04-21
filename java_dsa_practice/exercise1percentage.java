
    /**
     * Java program to calculate total, average and percentage of five subjects
     */

    import java.util.Scanner;

    class exercise1percentage
    {
        public static void main(String args[]) {
            float eng, phy, chem, math, comp;
            double total, average, percentage;
            Scanner df = new Scanner(System.in);
            //Input marks of all five subjects
            System.out.println("Enter marks of five subjects:");
            System.out.println("Enter marks of English subjects:");
            eng = df.nextFloat();
            System.out.println("Enter marks of Physics subjects:");
            phy = df.nextFloat();
            System.out.println("Enter marks of chemistry subjects:");
            chem = df.nextFloat();
            System.out.println("Enter marks of maths subjects:");
            math = df.nextFloat();
            System.out.println("Enter marks of computers subjects:");
            comp = df.nextFloat();
            // Calculate total, average and percentage
            total = eng + phy + chem + math + comp;
            average = (total / 5.0);
            percentage = (total / 500.0) * 100;
            if (percentage > 40 && eng > 33 && phy > 33 && chem > 33 && math > 33 && comp > 33)
            {
                System.out.println("congratulations you are pass ");
            }

                else
                {
                System.out.println("oops you are fail sorry");
                }

           System.out.println("Total marks = "+ total);
           System.out.println("Average marks = "+ average);
           System.out.println("Percentage = "+ percentage);


        }
    }


