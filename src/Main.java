import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

<<<<<<< HEAD

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

=======
public class Main extends JFrame {
//    @Override
//    public void paint (Graphics g){
//        super.paint(g);
//        g.fillRect(0, 0, 800, 900);
//        // create background
//        g.setColor(Color.BLACK);
//
//    }
    //private Startpanel startpanel;


    JFrame frame;
    JPanel home;
    JButton start;
    //JPanel j = new JPanel(new GridBagLayout());
    //Startpanel home;

    public Main(){
        frame = new JFrame();
        home = new JPanel();
        start = new JButton("Start!");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel category = new JPanel();
                category.add(new JButton("Categories"));
                frame.getContentPane().removeAll();
                frame.getContentPane().add(category);
                frame.revalidate();
            }
        });

        //startpanel = new Startpanel();
        frame.setTitle("Collage!");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        home.add(start);
        frame.add(home);
        frame.setVisible(true);
    }


    /*public Startpanel getStartpanelPanel() {
        return startpanel;
    }*/

    /*public class Startpanel extends JPanel {
        boolean homeScreen = false;
        boolean toCategories = false;
        boolean toQuestions = false;


        public Startpanel() {//Figuring out how to color background without writing over buttons
            homeScreen = true;
            JButton start = new JButton("Start!");
            start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JPanel category = new JPanel();
                    frame.getContentPane().add(category);
                }
            })
            
            JButton settings = new JButton("Settings!");
            JButton leaderboard = new JButton("Leaderboard!");
            add(start);
            add(settings);
            add(leaderboard);
        }
    }*/



>>>>>>> 1338860ef2ceb1e11f79a21b14021a3a4b218d83
    public static void main(String[] args){
        Main m = new Main();
        //m.setVisible(true);
        //m.setSize(600,400);
        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}