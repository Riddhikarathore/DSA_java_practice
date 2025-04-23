public class inheritance extends complex{
    public static void main(String[] args) {
        inheritance i1 = new inheritance();
        //yaha dekh sakte h jo properties thi complex k pass vo direct hum le sakte h inheritance m
        i1.print();
        i1.b=3;
        i1.a=6;
        i1.start();

    }
    void start(){
        System.out.println(a+b);
    }

    // isme overriding hoti h
    //overriding matlab hota h ki koi cheez parent m ho uske baad bhi child khud se usko bna raha ho
    // toh vo overriding ho jati h
    // jese oopsbasic m start already bna hua tha pr yaha humnr firse bnaya


}
