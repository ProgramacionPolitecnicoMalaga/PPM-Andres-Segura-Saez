package com.politecnico;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Area {
    private float altura;
    private float base;
    private float resultado;
    private JPanel MainPanel;
    private JLabel Altura;
    private JTextField txtAltura;
    private JLabel Base;
    private JTextField txtBase;
    private JButton btnCalcular;
    private JTextField txtResultado;
    private JLabel Resultado;

    public Area() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                altura = Float.parseFloat(txtAltura.getText());
                base = Float.parseFloat(txtBase.getText());
                resultado = base * altura;
                txtResultado.setText(String.valueOf(resultado));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Area");
        frame.setContentPane(new Area().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
