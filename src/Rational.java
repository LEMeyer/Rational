public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        this(0,1);
    }

    public Rational add(Rational b){
        Rational sum;
        int sumNum;
        int sumDen;
        sumDen = denominator * b.denominator;
        sumNum = (b.denominator * numerator) + (denominator * b.numerator);
        sum = new Rational(sumNum, sumDen);
        sum.reduce();
        return sum;
    }

    public Rational subtract(Rational b){
        Rational sub;
        int subNum;
        int subDen;
        subDen = denominator * b.denominator;
        subNum = (b.denominator * numerator) - (denominator * b.numerator);
        sub = new Rational(subNum, subDen);
        sub.reduce();
        return sub;
    }

    public Rational multiply(Rational b){
        Rational mult;
        int multNum;
        int multDen;
        multDen = denominator * b.denominator;
        multNum = numerator * b.numerator;
        mult = new Rational(multNum, multDen);
        mult.reduce();
        return mult;
    }

    public Rational divide(Rational b){
        Rational div;
        int divNum;
        int divDen;
        divDen = denominator * b.numerator;
        divNum = b.denominator * numerator;
        div = new Rational(divNum, divDen);
        div.reduce();
        return div;
    }

    public boolean equals(Rational b){
        boolean boolNum;
        boolean boolDen;
        this.reduce();
        b.reduce();
        boolNum = (this.numerator == b.numerator);
        boolDen = (this.denominator == b.denominator);
        return (boolNum && boolDen);
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
        Rational tempRational = new Rational(numerator,denominator);
        tempRational.reduce();
        if (tempRational.numerator>tempRational.denominator) {
            int whole;
            int remainder;
            remainder = tempRational.numerator%tempRational.denominator;
            whole = (tempRational.numerator-remainder)/tempRational.denominator;
            return whole + " and " + remainder + "/" + tempRational.denominator;
        } else {
            return tempRational.numerator + "/" + tempRational.denominator;
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
