import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class Main extends JFrame {
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
                veganism = new JButton("Veganism!");
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

        /*disney.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        frame.setTitle("Collage!");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        home.add(start);
        home.add(settings);
        home.add(leaderboard);

        frame.add(home);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}