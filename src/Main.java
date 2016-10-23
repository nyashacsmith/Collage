import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Main extends JFrame {
//    @Override
//    public void paint (Graphics g){
//        super.paint(g);
//        g.fillRect(0, 0, 800, 900);
//        // create background
//        g.setColor(Color.BLACK);
//
//    }
    private Startpanel startpanel;


    JFrame frame = new JFrame ();

    JPanel j = new JPanel(new GridBagLayout());
    Startpanel home = new Startpanel();




    public Main(){
        startpanel = new Startpanel();
        setTitle("Collage!");
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        setSize(400, 600);
//frame.getContentPane().setLayout(new GridLayout(40, 60));
        add(new Startpanel());
        setVisible(true);
    }


    public Startpanel getStartpanelPanel() {
        return startpanel;
    }

    public class Startpanel extends JPanel {
        boolean homeScreen = false;
        boolean toCategories = false;
        boolean toQuestions = false;


        public Startpanel(){//Figuring out how to color background without wrting over buttons
            homeScreen = true;
            add (new JButton ("Start!"));//Implement action listens
            add (new JButton ("Settings!"));
            add (new JButton ("Leaderboard!"));
        }



    }



    public static void main(String[] args){

        Main m = new Main();
//        m.setVisible(true);
//        m.setSize(600,400);
//        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

















}