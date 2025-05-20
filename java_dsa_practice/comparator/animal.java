package comparator;

public class animal implements Comparable<animal> {
    //compalable ko implement krna padhega then uski methods ko bhi implement krna hoga
    int age;
    String name;
    int weight ;


    public animal(String name, int age ,int weight ) {
        this.name = name;
        this.age= age;
        this.weight= weight ;
    }

    @Override
    public String toString() {
        return "animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+"\n";
    }

    @Override

    // @Override
    // public int compareTo(animal that) {
    //     return this.age - that.age;
    // }

    public int compareTo(animal that) {
        if (this.age == that.age) {
            return this.name.compareTo(that.name);
        }
        //ye check krega ki age aagr same h toh usko name k basis pr sort kr denge
        return this.age-that.age;
        //otherwise ye age k basis pr hi karega

        //ye hota h camparable
        //comparable ko implement krna padhta h then uski method compare to ki help se hum sort krte h
        //pr isme ek problem h ki aagr aage apko fir se sort krna h aalag basis pr toh apko yaha change krnahoga
        //pr aagr is custom class ko koi or use kr raha hoga toh uske liye bhi change ho jayega jo hum nhi chahte
        //isliye hum chahte h ki sirf humare liye sorting condition change ho toh
        //hum comparator use krte h


    }
    }


