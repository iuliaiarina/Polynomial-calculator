package Controller;

import Model.Polynomial;
import View.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final View view;

    public Controller(View view) {
        this.view = view;
        view.addMultiplicateListener(new MultiplicateListener());
        view.addDivideListener(new DivideListener());
        view.addAddListener(new AddListener());
        view.addSubstractListener(new SubstractListener());
        view.addDerivateListener(new DerivateListener());
        view.addIntegrateListener(new IntegrateListener());
    }

    class MultiplicateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                String p2 = view.getPolynom2();
                if(p1.isEmpty() || p2.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                Polynomial pol2 = Polynomial.formPolynomial(p2);
                Polynomial rez = pol1.multiplicate(pol2);
                view.setResult(rez.toString());
                view.setRest("");
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "DATE INCOMPLETE!!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class DivideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                String p2 = view.getPolynom2();
                if(p1.isEmpty() || p2.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                Polynomial pol2 = Polynomial.formPolynomial(p2);
                Polynomial[] vec = pol1.division(pol2);
                Polynomial rez=vec[0];
                view.setResult(rez.toString());
                view.setRest("Rest     =    "+vec[1].toString());
            }
            catch(ArithmeticException x) {
                JOptionPane.showMessageDialog(null, "Nu se poate afisa!!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "DATE INCOMPLETE!!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                String p2 = view.getPolynom2();
                if(p1.isEmpty() || p2.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                Polynomial pol2 = Polynomial.formPolynomial(p2);
                Polynomial rez = pol1.add(pol2);
                view.setResult(rez.toString());
                view.setRest("");
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "DATE INCOMPLETE!!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class SubstractListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                String p2 = view.getPolynom2();
                if(p1.isEmpty() || p2.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                Polynomial pol2 = Polynomial.formPolynomial(p2);
                Polynomial rez = pol1.subtract(pol2);
                view.setResult(rez.toString());
                view.setRest("");
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "DATE INCOMPLETE!!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class DerivateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                if(p1.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                Polynomial rez = pol1.derivate();
                view.setResult(rez.toString());
                view.setRest("");
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "POLINOM 1 INCOMPLET!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    class IntegrateListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String p1 = view.getPolynom1();
                if(p1.isEmpty())throw new Exception();
                Polynomial pol1 = Polynomial.formPolynomial(p1);
                String rez = pol1.integrate();
                view.setResult(rez);
                view.setRest("");
            }
            catch(Exception x) {
                JOptionPane.showMessageDialog(null, "POLINOM 1 INCOMPLET!", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
