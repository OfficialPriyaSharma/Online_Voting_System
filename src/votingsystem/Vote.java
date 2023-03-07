package votingsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vote extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5;
    int a,b,c,d;

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

        b1 = new JButton("Vote");
        b1.addActionListener(this);
        b1.setBounds(120,260,150,50);
        add(b1);

        b2 = new JButton("Vote");
        b2.addActionListener(this);
        b2.setBounds(860,260,150,50);
        add(b2);

        b3 = new JButton("Vote");
        b3.addActionListener(this);
        b3.setBounds(120,560,150,50);
        add(b3);

        b4 = new JButton("Result");
        b4.addActionListener(this);
        b4.setBounds(500,260,150,50);
        add(b4);

        b5 = new JButton("Vote");
        b5.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            a=a+1;
            JOptionPane.showMessageDialog(null,"Your vote is added to Shivsena");
        }
        if(e.getSource()==b2){
            b=b+1;
            JOptionPane.showMessageDialog(null,"Your vote is added to Aam Aadmi Party");
        }
        if(e.getSource()==b3){
            c=c+1;
            JOptionPane.showMessageDialog(null,"Your vote is added to Congress");
        }
        if(e.getSource()==b5){
            d=d+1;
            JOptionPane.showMessageDialog(null,"Your vote is added to BJP");
        }
        if(e.getSource()==b4){
            JOptionPane.showMessageDialog(null,"Shivsena=" + a + "AamAadmi=" + b +"Congress=" + c + "BJP=" + d);
        }
    }
}
