/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Muhamad Yamin
 */
public class Layout extends JFrame{
    GridLayout gl = new GridLayout(4, 6);
    JButton b1 = new JButton("");
    
    Layout(){
        super("Graphical User Interface");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);
        setLocationRelativeTo(null);
        setLayout(gl);
        add(" west ", b1);
        add(new JButton(" 1 "));
        add(new JButton(" 2 "));
        add(new JButton(" 3 "));
        add(new JButton(" 4 "));
        add(new JButton(" 5 "));
        add(new JButton(" 6 "));
        add(new JButton(" 7 "));
        add(new JButton(" 8 "));
        add(new JButton(" 9 "));
        add(new JButton(" 0 "));
        add(new JButton(" + "));
        add(new JButton(" - "));
        add(new JButton(" * "));
        add(new JButton(" / "));
        add(new JButton(" = "));
        add(new JButton(" % "));
        add(new JButton(" Mod "));
        add(new JButton(" EXIT "));
        setVisible(true);       
    }
    public static void main(String[] args) {
        Layout form= new Layout();
    }

    Layout(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
