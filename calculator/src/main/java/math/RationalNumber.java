package math;

import java.util.Objects;

public final class RationalNumber {

    private int numerator;
    private int denominator = 1;

    private void reduction(int newNumer, int newDeno) {
        int gcd = 0;
        for(int i = 2; i <= newNumer && i <= newDeno; i++)
        {
            if(newNumer%i==0 && newDeno%i==0)
                gcd = i;
        }
        this.numerator = (gcd == 0)? newNumer : newNumer/gcd;
        this.denominator = (gcd == 0)? newDeno : newDeno/gcd;
    }


    public RationalNumber(final int numerator){
        this.numerator = numerator;
    }

    public RationalNumber(int numerator, int denominator) {
        if (denominator == 0) throw new IllegalArgumentException();
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.reduction(numerator, denominator);
        equals(this);
    }


    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    public RationalNumber negative(){
        return new RationalNumber(-this.numerator,this.denominator);
    }

    public RationalNumber reciprocal(){
        return new RationalNumber(this.denominator, this.numerator);
    }

    public RationalNumber add(RationalNumber y){
        int newNumer = (this.numerator*y.denominator)+ (this.denominator*y.numerator);
        int newDeno = this.denominator*y.denominator;
        this.reduction(newNumer, newDeno);
        return this;
    }

    public RationalNumber subtract(RationalNumber y){
        int newNumer = (this.numerator*y.denominator) - (this.denominator*y.numerator);
        int newDeno = this.denominator*y.denominator;
        this.reduction(newNumer, newDeno);
        return this;
    }

    public RationalNumber multiply(RationalNumber y){
        int newNumer = (this.numerator*y.numerator);
        int newDeno = (this.denominator*y.denominator);
        this.reduction(newNumer, newDeno);
        return this;
    }

    public RationalNumber divide(RationalNumber y){
        RationalNumber r = this;
        return r.multiply(y.reciprocal());
    }



    @Override
    public String toString() {
        if (this.denominator == 1) {
            return this.numerator + "";
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber number = (RationalNumber) o;
        return numerator == number.numerator &&
                denominator == number.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

}
