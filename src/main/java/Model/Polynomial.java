package Model;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polynomial {
    private final ArrayList<Monomial> monomialsList;

    public Polynomial() {
        this.monomialsList = new ArrayList<Monomial>();
        this.monomialsList.add(new Monomial(0,0));
    }

    @Override
    public boolean equals(Object o) {
        if(this.monomialsList.size()!=((Polynomial)o).monomialsList.size())
            return false;
        int k=0;
        for(Monomial i:this.monomialsList){
            Monomial j=((Polynomial)o).monomialsList.get(k);
            if(i.getCoefficient()!=j.getCoefficient() || i.getDegree()!=j.getDegree())
                return false;
            k++;
        }
        return true;
    }

    public String toString() {
        if(this.monomialsList.size()==0)return "0";
        String r = "";
        int ok = 1;
        for (Monomial i : monomialsList) {
            if (ok == 1)  r = r + i.toString();//primul el
            else {
                if(i.getCoefficient()!=0) {
                    if (i.getCoefficient() > 0)
                        r = r + "+";
                    r = r + i;
                }
            }
            ok = 0;
        }
        return r;
    }

    public void insertMonomial(int c, int d) {
        if(c==0)d=0;
        monomialsList.add(new Monomial(c, d));
        Collections.sort(monomialsList);
        this.delete();
    }

    public void insertMonomial(Monomial x) {
        if(x.getCoefficient()==0)x.setDegree(0);
        monomialsList.add(x);
        Collections.sort(monomialsList);
        this.delete();
    }

    public void delete(){
        ArrayList<Monomial> deleteList=new ArrayList<>();
        for(Monomial i:this.monomialsList){
            if(i.getCoefficient()==0){
                deleteList.add(i);
            }
        }
        for(Monomial i:deleteList){
            this.monomialsList.remove(i);
        }
        this.monomialsList.add(new Monomial(0,0));
    }

    public Polynomial add(Polynomial y) {
        Polynomial result = new Polynomial();
        Polynomial x;

        if (this.monomialsList.get(0).getDegree() < y.monomialsList.get(0).getDegree()) {
            x = y;
            y = this;
        } else x = this;

        int k = 0;
        int l = 0;
        while (l < x.monomialsList.size() && k < y.monomialsList.size()) {
            Monomial i = x.monomialsList.get(l);
            Monomial j = y.monomialsList.get(k);
            if (i.getDegree() == j.getDegree()) {
                Monomial m = i.add(j);
                result.insertMonomial(m);
                k++;
                l++;
            } else if (i.getDegree() > j.getDegree()) {
                result.insertMonomial(i);
                l++;
            } else {
                result.insertMonomial(j);
                k++;
            }
        }
        while (l < x.monomialsList.size()) {
            Monomial i = x.monomialsList.get(l);
            result.insertMonomial(i);
            l++;
        }
        while (k < y.monomialsList.size()) {
            Monomial i = y.monomialsList.get(k);
            result.insertMonomial(i);
            k++;
        }
        result.delete();
        return result;
    }

    public Polynomial subtract(Polynomial y) {
        Polynomial noty = new Polynomial();
        for (Monomial i : y.monomialsList) {
                Monomial m = new Monomial(-i.getCoefficient(), i.getDegree());
                noty.insertMonomial(m);
        }
        Polynomial result = this.add(noty);
        result.delete();
        return result;
    }

    public Polynomial multiplicate(Polynomial x) {
        Polynomial result = new Polynomial();
        ArrayList<Monomial> aux = new ArrayList<Monomial>();
        for (Monomial i : this.monomialsList) {
            for (Monomial j : x.monomialsList) {
                aux.add(i.multiplicate(j));
            }
        }
        Collections.sort(aux);
        Monomial j = aux.get(0);
        aux.remove(j);
        for (Monomial i : aux) {
            if (i.getDegree() == j.getDegree()) {
                j = j.add(i);
            } else {
                result.insertMonomial(j);
                j = i;
            }
        }
        result.insertMonomial(j);
        result.delete();
        return result;
    }

    public Polynomial[] division(Polynomial q) throws ArithmeticException {
        Polynomial[] sir =new Polynomial[2];
        if (q.monomialsList.get(0).getDegree() > this.monomialsList.get(0).getDegree()) {
            Polynomial ret = new Polynomial();
            ret.insertMonomial(new Monomial(0, 0));
            sir[0]=ret;
            sir[1]=ret;
            return sir;
        }
        Polynomial p = this;
        Polynomial cat = new Polynomial();
        while (p.monomialsList.get(0).getDegree() >= q.monomialsList.get(0).getDegree()) {
            Monomial aux = p.monomialsList.get(0).division(q.monomialsList.get(0));
            cat.insertMonomial(aux);
            Polynomial aux2 = new Polynomial();
            aux2.insertMonomial(aux);
            Polynomial prod = q.multiplicate(aux2);
            p = p.subtract(prod);
        }
        p = cat.multiplicate(q);
        Polynomial rest= this.subtract(p);

        ArrayList<Monomial> aux =rest.monomialsList;
        rest =new Polynomial();
        Monomial j = aux.get(0);
        aux.remove(j);
        for (Monomial i : aux) {
            if (i.getDegree() == j.getDegree()) {
                j = j.add(i);
            } else {
                rest.insertMonomial(j);
                j = i;
            }
        }
        rest.insertMonomial(j);
        cat.delete();
        rest.delete();
        sir[0]=cat;
        sir[1]=rest;
        return sir;
    }

    public Polynomial derivate() {
        Polynomial result = new Polynomial();
        for (Monomial i : this.monomialsList) {
            Monomial n = i.derivate();
            if (n.getCoefficient() != 0)
                result.insertMonomial(n);
        }
        if (result.monomialsList.size() == 0) result.insertMonomial(new Monomial(0, 0));
        result.delete();
        return result;
    }

    public String integrate() {
        String result = "";
        int ok = 1;
        for (Monomial i : this.monomialsList) {
            result = result + i.integrate(ok);
            ok = 0;
        }
        result = result + "+C";
        return result;
    }

    public boolean isEmpty() {
        if (this.monomialsList.size() == 1) return true;
        else return false;
    }

    public static Polynomial formPolynomial(String x) {
        Polynomial p = new Polynomial();
        String Polynomial_PATTERN = "[-/w]?[0-9]+[*/w]x[^/w][0-9]+";
        Pattern pattern = Pattern.compile(Polynomial_PATTERN);
        Matcher matcher = pattern.matcher(x);
        while (matcher.find()) {
            Monomial m = Monomial.formMonomial(matcher.group(0));
            p.insertMonomial(m);
        }
        return p;
    }

}
