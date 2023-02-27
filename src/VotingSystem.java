import javax.swing.*;

public class VotingSystem extends JFrame {

    VotingSystem(){
        setBounds(0,0,1600,700);

        JLabel l1 = new JLabel("Welcome to");
        l1.setBounds(100,230,300,100);
        setVisible(true);
        setLayout(null);
    }

    public static void main(String[] args) {
        new VotingSystem();

    }
}
