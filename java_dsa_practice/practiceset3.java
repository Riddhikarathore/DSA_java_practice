public class practiceset3
{
    public static void main (String args[])
    {
                        // QUESTION NO. 1
        System.out.println("solution no. 1 : ");
        String name = "SEJAL";
        System.out.println(name.toLowerCase());

                         // QUESTION NO. 2
        System.out.println("solution no. 2 : ");
        String name2 = " sejal is my       sister name ";
        System.out.println(name2.replace(" ", "_"));

                         // QUESTION NO. 3
        System.out.println("solution no. 3 : ");
        String letter = " DEAR <|NAME|>, thank a lot";
        letter = letter.replace("<|NAME|>","sejal");
        System.out.println(letter);

                            //QUESTION NO. 4
        System.out.println("solution no. 4 : ");
        String sentance = "hello my  name is   riddhika ";
        System.out.println(sentance.indexOf("  "));
        System.out.println(sentance.indexOf("   "));

                                   //QUESTION NO. 5
        System.out.println("solution no. 5 : ");
        String feedback= "Dear riddhika \nthis Java course is nice \nthanks ! ";
        System.out.println(feedback);






    }
}
