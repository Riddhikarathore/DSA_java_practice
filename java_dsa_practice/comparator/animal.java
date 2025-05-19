package comparator;

public class animal implements Comparable<animal>{
    int rollnumber ;
    String name ;

    public animal(String name, int rollnumber) {
        this.name = name;
        this.rollnumber= rollnumber;
    }

    @Override
    public String toString() {
        return "animal{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(animal that) {
        return this.rollnumber - that.rollnumber;
    }
}
