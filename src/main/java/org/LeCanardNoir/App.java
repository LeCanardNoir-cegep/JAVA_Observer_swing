package org.LeCanardNoir;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class App extends JFrame
{
    public static void main( String[] args )
    {
        App app = new App();
        app.go();
    }

    private void go() {
        JButton btn = new JButton("Dois-je le faire?");
        btn.setBounds(130,100,100,40);
        btn.addActionListener(new AutideurAnge());
        btn.addActionListener(new AutideurDemon());

        //frame.getContentPane();
        add(BorderLayout.CENTER,btn);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.out.println("System exit");
                System.exit(0);
            }
        });
    }

    private static class AutideurAnge implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ne le fais pas, pourrais le regretter!!!");
        }
    }

    private static class AutideurDemon implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("OUIIII, FAIS LE !!!!");
        }
    }
}
