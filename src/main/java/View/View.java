package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends javax.swing.JFrame {
    private java.awt.Button add;
    private java.awt.Button derivate;
    private java.awt.Button divide;
    private java.awt.Button integrate;
    private java.awt.Label pol1;
    private java.awt.Label label2;
    private java.awt.Label pol2;
    private java.awt.Button multiplicate;
    private java.awt.TextField polynom1;
    private java.awt.TextField polynom2;
    private java.awt.Label result;
    private java.awt.Button substract;
    private java.awt.Label titlu;
    private JPanel panel;
    private java.awt.Label rest;

    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        titlu = new java.awt.Label();
        pol1 = new java.awt.Label();
        pol2 = new java.awt.Label();
        polynom1 = new java.awt.TextField();
        polynom2 = new java.awt.TextField();
        multiplicate = new java.awt.Button();
        substract = new java.awt.Button();
        divide = new java.awt.Button();
        add = new java.awt.Button();
        integrate = new java.awt.Button();
        derivate = new java.awt.Button();
        label2 = new java.awt.Label();
        result = new java.awt.Label();
        panel = new JPanel();
        rest = new java.awt.Label();

        add(panel);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        titlu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titlu.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        titlu.setForeground(new java.awt.Color(51, 51, 51));
        titlu.setMaximumSize(new java.awt.Dimension(72767, 72767));
        titlu.setMinimumSize(new java.awt.Dimension(216, 118));
        titlu.setPreferredSize(new java.awt.Dimension(216, 118));
        titlu.setText("Polynomial Calculator");

        pol1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pol1.setText("First Polynomial      =");

        pol2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pol2.setText("Second Polynomial =");

        polynom1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        polynom2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        multiplicate.setBackground(new java.awt.Color(255, 204, 204));
        multiplicate.setLabel("Multiplicate");

        substract.setActionCommand("Subtract");
        substract.setBackground(new java.awt.Color(255, 204, 204));
        substract.setLabel("Subtract");
        substract.setName(""); // NOI18N

        divide.setBackground(new java.awt.Color(255, 204, 204));
        divide.setLabel("Divide");

        add.setBackground(new java.awt.Color(255, 204, 204));
        add.setLabel("Add");

        integrate.setBackground(new java.awt.Color(255, 204, 204));
        integrate.setLabel("Integrate");

        derivate.setActionCommand("Derivate");
        derivate.setBackground(new java.awt.Color(255, 204, 204));
        derivate.setLabel("Derivate");

        label2.setText("Result   =");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(pol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(pol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(multiplicate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(10, 10, 10)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(polynom1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(polynom2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(integrate, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                                        .addComponent(derivate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(19, 19, 19)
                                                                                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(rest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titlu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(polynom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(polynom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(multiplicate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(substract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(derivate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(integrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addContainerGap(16, Short.MAX_VALUE))
        );

        titlu.getAccessibleContext().setAccessibleName("titlu");
        titlu.getAccessibleContext().setAccessibleDescription("");

        pack();
    }

    public void setRest(String  rest) {
        this.rest.setText(rest);
    }

    public void setResult(String text) {
        this.result.setText(text);
    }

    public String getPolynom1() {
        return polynom1.getText();
    }

    public String getPolynom2() {
        return polynom2.getText();
    }


    public void addMultiplicateListener(ActionListener x) {
        multiplicate.addActionListener(x);
    }
    public void addDivideListener(ActionListener x) {
        divide.addActionListener(x);
    }
    public void addAddListener(ActionListener x) {
        add.addActionListener(x);
    }
    public void addSubstractListener(ActionListener x) {
        substract.addActionListener(x);
    }
    public void addDerivateListener(ActionListener x) {
        derivate.addActionListener(x);
    }
    public void addIntegrateListener(ActionListener x) {
        integrate.addActionListener(x);
    }
}
