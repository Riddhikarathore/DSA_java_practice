package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable {
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

        Collections.sort(dogs);
        System.out.println(dogs);




    }
}
