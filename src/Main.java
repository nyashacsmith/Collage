import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;


public class Main extends JFrame {
    //private StartPanel startPanel;
    //private GamePanel gamePanel;
    JFrame frame;

    /*@Override
    public void paint (Graphics g){
        super.paint(g);
        g.fillRect(0, 0, 800, 900);
        // create background
        g.setColor(Color.BLACK);
    }*/

    public Main(){
        frame = new JFrame();
        setTitle("Collage!");
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        setSize(400, 600);
        //frame.getContentPane().setLayout(new GridLayout(40, 60));
        setVisible(true);
    }

    public static void main(String[] args){
        Main m = new Main();
        //m.setVisible(true);
        //m.setSize(600,400);
        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}