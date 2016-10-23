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
    //private Startpanel startpanel;


    JFrame frame;
    JPanel home;

    JButton start;
    JButton settings;
    JButton leaderboard;

    JButton disney;
    JButton anime;
    JButton animals;
    JButton music;
    JButton veganism;
    JButton random;
    //JPanel j = new JPanel(new GridBagLayout());
    //Startpanel home;

    public Main(){
        frame = new JFrame();
        home = new JPanel();
        start = new JButton("Start!");
        settings = new JButton("Settings!");
        leaderboard = new JButton("Leaderboard!");
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel categories = new JPanel();
                disney = new JButton("Disney!");
                anime = new JButton("Anime/Manga!");
                animals = new JButton("Animals!");
                veganism = new JButton("Veganism :(");
                music = new JButton("Music!");
                random = new JButton("Random!");
                categories.add(disney);
                categories.add(anime);
                categories.add(animals);
                categories.add(veganism);
                categories.add(music);
                categories.add(random);

                frame.getContentPane().removeAll();
                frame.getContentPane().add(categories);
                frame.revalidate();
            }
        });

        frame.setTitle("Collage!");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        
        home.add(start);
        home.add(settings);
        home.add(leaderboard);

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



    public static void main(String[] args){
        Main m = new Main();
        //m.setVisible(true);
        //m.setSize(600,400);
        //m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}