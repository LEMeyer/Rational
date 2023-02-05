public class Main {
    public static void main(String[] args) {
        Rational r1;
        Rational r2;
        r1 = new Rational(64,10);
        r2 = new Rational();

        System.out.println(r1);
        r1.reduce();
        System.out.println(r1);


    }
}