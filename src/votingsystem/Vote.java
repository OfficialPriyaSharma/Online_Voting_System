package votingsystem;

import javax.swing.*;
import java.awt.*;

public class Vote extends JFrame {

    Vote(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/Shivsena.png"));
        Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(50,50,300,200);
        add(l1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/AamAadmi.png"));
        Image i5 = i4.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(800,50,300,200);
        add(l2);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/BJP.png"));
        Image i8 = i7.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l3 = new JLabel(i9);
        l3.setBounds(800,350,300,200);
        add(l3);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/Congress.png"));
        Image i11 = i10.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l4 = new JLabel(i12);
        l4.setBounds(50,350,300,200);
        add(l4);

        JButton b1 = new JButton("Vote");
        b1.setBounds(120,260,150,50);
        add(b1);

        JButton b2 = new JButton("Vote");
        b2.setBounds(860,260,150,50);
        add(b2);

        JButton b3 = new JButton("Vote");
        b3.setBounds(120,560,150,50);
        add(b3);

        JButton b4 = new JButton("Vote");
        b4.setBounds(120,260,150,50);
        add(b4);

        JButton b5 = new JButton("Vote");
        b5.setBounds(860,560,150,50);
        add(b5);


        setBounds(0,0,1600,700);
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
            new Vote();
    }
}
