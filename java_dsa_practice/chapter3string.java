                                                     //STRINGS
public class chapter3string
{
    public static void main (String args[])
    {
                                   //STRINGS METHODS

        String name = "Sejal";

                                // 1ST METHOD

        System.out.println("1st method name.length() :");
        System.out.println(name.length());

                                //2nd method

        System.out.println("2nd method name.toLowerCase :");
        System.out.println(name.toLowerCase());

                                //3rd method

        System.out.println("3rd method name.toUpperCase :");
        System.out.println(name.toUpperCase());

                                //4rd method

        String name2 = "     RIDDHIKA     ";
        System.out.println("4th method name.trim :");
        System.out.println(name2);
        System.out.println(name2.trim());

                                 //5th method

        System.out.println("5th method name.substring(int start) :");
        System.out.println(name.substring(3));
        System.out.println(name.substring(1));

                                //6th method

        System.out.println("6th method name.substring(int start , int end)");
        System.out.println(name.substring(0,2));

                                 //7th method

        System.out.println("7th method name.replace(old char, new char) :");
        System.out.println(name.replace('e','@'));

                                   //8th method

        System.out.println("8th method name.startWith() :");
        System.out.println(name.startsWith("jl"));
        System.out.println(name.startsWith("se"));

                                    //9th method

        System.out.println("9th method name.endWith() :");
        System.out.println(name.endsWith("al"));
        System.out.println(name.endsWith("jl"));

                                    //10th method

        System.out.println("10th method name.charAt() :");
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));

                                //11th method

        System.out.println("11th method name.indexOf() :");
        System.out.println(name.indexOf('S'));
        System.out.println(name.indexOf('s'));

                                 //12th method

        System.out.println("12th method name.indexOf(char,starting from index) :");
        System.out.println(name.indexOf('a',2));
        System.out.println(name.indexOf('a',4));
        System.out.println("here default value is -1 ");

                                //13th method

        String name3 = "riddhika";
        System.out.println("13th method name.lastIndexOf() :");
        System.out.println(name3.lastIndexOf('d'));

                                //14th method

        System.out.println(" 14th method name.lastIndexOf('i',2) :");
        System.out.println(name3.lastIndexOf('i',7));

                                 //15th method

        System.out.println("15th method name.equals() :");
        System.out.println(name.equals("riddhika"));
        System.out.println(name.equals("Sejal"));
        System.out.println(name.equals("sejal"));

                                 //16th method

        System.out.println("16th method name.equalsIgnoreCase()");
        System.out.println(name.equalsIgnoreCase("sejal"));



    }
}
