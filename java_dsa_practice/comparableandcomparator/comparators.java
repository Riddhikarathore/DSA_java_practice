package comparableandcomparator;

import java.util.*;

//comparable m ek problem hoti h ki aagr aage apko fir se sort krna h aalag basis pr
// toh apko yaha change krna hoga
//pr aagr is custom class ko koi or use kr raha hoga toh uske liye bhi change ho jayega jo hum nhi chahte
// hum chahte h ki sirf humare liye sorting condition change ho toh
//hum comparator use krte h

class mycustomcomparator implements Comparator<animal> {
    // ye ek class hum khud se bhi bna sakte h comparator ko implement krke sort krne k liye

    //ab iski method ko bhi implement krna hoga
    //compare method similar hota h compareTo method k
    //yaha do obj pass ho jate h this that nhi krnna padhta
    @Override
    public int compare(animal o1, animal o2) {
        //return o1.age - o2.age;
        //ye age k basis pr sort kr dega

        //ye ek or tarike se hoga jaha hum - nhi lgate Integer likhte h
        //- isko lgane pr kabhi kabhi kuch questions m problem aati h
        //isliye simple Integer wala use krna chahiye

        return Integer.compare(o1.age, o2.age);

    }
    //yaha apne hisab se ab sorting condition de sakte h
    //custom class bna kr


}


//ab aagr hum chahte
    public class comparators{
        public static void main(String[] args) {

            animal a1 = new animal("bruno",2,23);
            animal a2 = new animal("druno",1,45);
            animal a3 = new animal("kruno",2,22);
            animal a4 = new animal("sruno",3,20);
            animal a5 = new animal("oruno",4,19);

            List<animal> dogs = new ArrayList<>();

            dogs.add(a1);
            dogs.add(a2);
            dogs.add(a3);
            dogs.add(a4);
            dogs.add(a5);

            System.out.println(dogs);

            //ab use krte h apni class ko
            //apna object pass krke
            System.out.println("on the basis of age , using custom class object");
            Collections.sort(dogs,new mycustomcomparator());
            //yaha humko dogs k sath humari cass ka object bhi pass krna hoga
            System.out.println(dogs);
            System.out.println("on the basis of weight , directly");
            //ye humko ab age k basis pr sort krke dega



            //ab aggr hum chahe toh bina class bnaye bhi ye kaam kr sakte h
            //aap chahte h ki ab age k basis pr nhi weight k bais pr kre toh
            //hum direct bhi kr sakte h


            Collections.sort(dogs, new Comparator<animal>() {
                @Override
                public int compare(animal o1, animal o2) {
                    return Integer.compare(o1.weight,o2.weight);
                }
            });
            System.out.println(dogs);
            //ab yr humko weight k basis pr sort krke de raha h
            System.out.println("on the basis of name ,directly");


            //if we want ki nhi ab hume toh name k basis pr chahiye toh hum vo bhi kr sakte h directly


            Collections.sort(dogs, new Comparator<animal>() {
                @Override
                public int compare(animal o1, animal o2) {
                    return o1.name.compareTo(o2.name);
                }
            });
            System.out.println(dogs);
            //ab ye name k basis pr sort kr dega



        }
    }







