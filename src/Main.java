import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    //private StartPanel startPanel;
    //private GamePanel gamePanel;
    JFrame frame = new JFrame ();

    JPanel j = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();

    //StartPanel home = new StartPanel();
    //GamePanel game = new GamePanel();

    public Main() {
        //startPanel = new StartPanel();
        //gamePanel = new GamePanel();
        setTitle("Collage!");
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        setSize(400, 600);
        //frame.getContentPane().setLayout(new GridLayout(40, 60));
        //add(new StartPanel());
        //add(new GamePanel());
        //setContentPane(gamePanel);
        setVisible(true);
    }



    public static void main(String[] args){

        Main m = new Main();
        m.setVisible(true);
        m.setSize(600,400);
        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}