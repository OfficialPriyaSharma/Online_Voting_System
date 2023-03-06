package votingsystem;

import javax.swing.*;

import java.awt.*;


public class VotingSystem extends JFrame {

    VotingSystem(){
        setBounds(0,0,1600,700);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("Welcome to");
        l1.setFont(new Font("Tahoma", Font.BOLD,50));
        l1.setBounds(150,230,300,100);
        add(l1);

        JLabel l2 = new JLabel("Online Voting System");
        l2.setFont(new Font("Tahoma", Font.BOLD,50));
        l2.setBounds(50,300,700,100);
        add(l2);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("C:\\Users\\Administrator\\Documents\\Online Voting System\\icons\\Vote.png"));
        Image i2 = il.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(700,200,500,300);
        add(l3);

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VotingSystem();

    }
}
