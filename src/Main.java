public class Main {
    public static void main(String[] args) {
        Rational r1;
        Rational r2;
        boolean eq;
        Rational r3;
        r1 = new Rational(4,10);
        r2 = new Rational(2,7);

        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        eq = r1.equals(r2);
        System.out.println("Equal?: " + eq);
        r3 = r1.add(r2);
        System.out.println("r1+r2: " + r3);
        r3 = r1.subtract(r2);
        System.out.println("r1-r2: " + r3);
        r3 = r1.multiply(r2);
        System.out.println("r1*r2: " + r3);
        r3 = r1.divide(r2);
        System.out.println("r1/r2: " + r3);
        r1.reduce();
        r2.reduce();
        System.out.println("r1 reduced: " + r1);
        System.out.println("r2 reduced: " + r2);

    }
}