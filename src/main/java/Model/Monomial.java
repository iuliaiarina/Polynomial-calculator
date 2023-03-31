package Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Monomial implements Comparable {
    private int coefficient;
    private int degree;

    public Monomial(int coefficient, int degree) {
        this.coefficient = coefficient;
        this.degree = degree;
    }

    public String toString() {
        String r;
        if(coefficient == 0)
            r="0";
        else if (this.coefficient == 1) {
            if (this.degree == 0) {
                r = "1";
            } else if (this.degree == 1) {
                r = "x";
            } else {
                r = "x^" + this.degree;
            }
        } else if (this.coefficient == -1) {
            if (this.degree == 0) {
                r = "-1";
            } else if (this.degree == 1) {
                r = "-x";
            } else {
                r = "-x^" + this.degree;
            }
        } else {
            if (this.degree == 0) {
                r = "" + coefficient;
            } else if (this.degree == 1) {
                r = coefficient + "*x";
            } else {
                r = coefficient + "*x^" + this.degree;
            }
        }
        return r;
    }

    //adunare (trebuie sa aiba acelasi grad)
    public Monomial add(Monomial x) {
        if (this.degree == x.degree) {
            if (this.coefficient + x.coefficient == 0){
                return new Monomial(0,0);
            }
            return new Monomial(this.coefficient + x.coefficient, x.degree);
        }
        else if (this.coefficient == 0) return x;
        else if (x.coefficient == 0) return this;
        else return new Monomial(0,0);
    }

    public Monomial negative() {
        return new Monomial(-this.coefficient, this.degree);
    }

    public Monomial multiplicate(Monomial x) {
        return new Monomial(this.coefficient * x.coefficient, this.degree + x.degree);
    }

    public Monomial division(Monomial x) throws ArithmeticException{
        if(this.coefficient % x.coefficient == 0)
            return new Monomial(this.coefficient/x.coefficient,this.getDegree()-x.getDegree());
        else throw new ArithmeticException();
    }

    public Monomial derivate() {
        if (this.degree == 0) {
            return new Monomial(0, 0);
        } else {
            return new Monomial(this.coefficient * this.degree, this.degree - 1);
        }
    }

    public String integrate(int ok) {
        String result = "";
        int a = this.coefficient;
        int b = this.degree + 1;
        if (a > 0 && b > 0){
            if(ok==1) result = a + "/" + b + "*x^" + b;
            else  result = "+" + a + "/" + b + "*x^" + b;}
        else if (a < 0 && b > 0)
            result = a + "/" + b + "*x^" + b;
        return result;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int compareTo(Object o) {
        if (this.getDegree() > ((Monomial) o).degree) return -1;
        else if (this.getDegree() == ((Monomial) o).degree) return 0;
        else return 1;
    }

    public static Monomial formMonomial(String x){
        Monomial m = null;
        String MONOMIAL_PATTERN = "([-/w]?[0-9]+)[*/w]x[^/w]([0-9]+)";
        Pattern pattern = Pattern.compile(MONOMIAL_PATTERN);
        Matcher matcher = pattern.matcher(x);
        while(matcher.find()) {
            String a=matcher.group(1);
            String b=matcher.group(2);
            m=new Monomial(Integer.parseInt(a),Integer.parseInt(b));
        }
        return m;
    }

}
