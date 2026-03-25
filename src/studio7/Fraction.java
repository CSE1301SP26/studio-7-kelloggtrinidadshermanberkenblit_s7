public class Fraction {

    private int numerator, denominator;

    public Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public Fraction multiplication(Fraction f2){
        int denom = denominator*f2.denominator;
        int num = numerator*f2.numerator;
        return new Fraction(num, denom);
    }

}
