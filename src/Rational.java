public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        this(0,1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int den) {
        if (den==0){
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        if (den<0){
            throw new IllegalArgumentException("Negative is stored in the numerator. Make Denominator Positive.");
        }
        this.denominator = den;
    }
    public void setNumerator(int num) {
        this.numerator = num;
    }

    public String toString()
    {
        this.reduce();
        if (numerator>denominator) {
            int whole;
            int remainder;
            remainder = numerator%denominator;
            whole = (numerator-remainder)/denominator;
            return whole + " and " + remainder + "/" + denominator;
        } else {
            return numerator + "/" + denominator;
        }
    }

    public void reduce(){
        if (numerator == 0){
            denominator = 1;
        } else {
            int check;
            boolean found = false;
            if (numerator < denominator) {
                check = numerator;
            } else {
                check = denominator;
            }
            while (check>0 && !found){
                if((numerator%check==0) && (denominator%check==0)){
                    numerator = numerator/check;
                    denominator = denominator/check;
                    found = true;
                }
                check--;
            }
        }
    }

    public Rational(int n, int m){
        if (m==0){
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        if (m<0){
            throw new IllegalArgumentException("Negative is stored in the numerator. Make Denominator Positive.");
        }

        numerator = n;
        denominator = m;
    }
}
