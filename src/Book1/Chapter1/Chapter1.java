package Book1.Chapter1;

public class Chapter1 {
    public static void main(String[] args){
        println("Hello Java!");

        double x = 5.02;
        double y = 0.01;
        double z = x + y;
        println(z);
    }

    // printf()
    public static void printf(Object o){
        System.out.printf("%s\n", o);
    }

    // print()
    public static void print(Object o){
        System.out.print(o);
    }

    // println()
    public static void println(Object o){
        System.out.println(o);
    }

}
