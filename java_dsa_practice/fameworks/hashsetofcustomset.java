package fameworks;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class customclass{

int rollnumber;
String name ;

    public customclass(int rollnumber , String name) {
        this.rollnumber = rollnumber;
        this.name = name ;
    }
    //equlas ko bnana padhega ye btane k liye ki rollnumber same h to same h not allowed

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        customclass that = (customclass) o;
        return rollnumber == that.rollnumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollnumber);
    }


    //tostring bhi bnalo


    @Override
    public String toString() {
        return "customclass{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                '}';

    }
}
public class hashsetofcustomset {


    public static void main(String[] args) {


        Set<customclass> c1 = new HashSet<>();
        //yaha hum primitive data type ki jgh humara customclass dal sakte h
        //pr ye duplicate ko support kr dega
        //jo hum nhi chahte
        //toh hume yaha equals() or hashcode() ka use krna hoga

        customclass e1 = new customclass(1,"ram");
        customclass e2 = new customclass(3,"rahul");

        System.out.println(e1.equals(e2));




        c1.add(new customclass(1,"riddhika"));
        c1.add(new customclass(1,"ram"));
        c1.add(new customclass(1,"rahul"));

        System.out.println(c1);
        //ye duplicate ko support kr dega
        //nhi support krwane k liye hum equals or hashcode ka use krenge
        //lgane k baad ek hi bar aayga duplicate support nhi krega rollnumber same hoga toh



    }

}
