package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparators {
    public static void main(String[] args) {
        animal a1 = new animal("bruno",11);
        animal a2 = new animal("druno",13);
        animal a3 = new animal("kruno",12);
        animal a4 = new animal("sruno",18);
        animal a5 = new animal("oruno",16);

        List<animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

        System.out.println(dogs);

        Collections.sort(dogs);
        System.out.println(dogs);




    }
}
