package comparator;

public class animal {
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
}
