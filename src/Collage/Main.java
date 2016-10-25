package Collage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
        JButton a2;
        JButton a1;
        JButton a3;
        JButton a4;
        //JPanel j = new JPanel(new GridBagLayout());
        //Startpanel home;

        public Main() {
            frame = new JFrame();
            home = new JPanel();
            start = new JButton("Start!");
            settings = new JButton("Settings!");
            leaderboard = new JButton("Leaderboard!");
            disney = new JButton("Disney!");
            anime = new JButton("Anime/Manga!");
            animals = new JButton("Animals!");
            veganism = new JButton("Veganism :(");
            music = new JButton("Music!");
            random = new JButton("Random!");
            Collage.Constants q = new Collage.Constants();
            a1 = new JButton (q.Answer1[0]);
            a2 = new JButton (q.Answer1[1]);
            a3 = new JButton (q.Answer1[2]);
            a4 = new JButton (q.Answer1[3]);
            JPanel questions = new JPanel();
            JPanel questions1 = new JPanel();


            start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JPanel categories = new JPanel();
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
            disney.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JLabel q1 = new JLabel(q.D1);
                    questions.add(q1);
                    questions.add(a1);
                    questions.add(a2);
                    questions.add(a3);
                    questions.add(a4);
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(questions);
                    frame.revalidate();
                }
            });

            a1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Collage.Constants q = new Collage.Constants();
                    JLabel q2 = new JLabel(q.D2);
                    JButton a1 = new JButton (q.Answer2[0]);
                    JButton a2 = new JButton (q.Answer2[1]);
                    JButton a3  = new JButton (q.Answer2[2]);
                    JButton a4 = new JButton (q.Answer2[3]);
                    questions1.add(q2);
                    questions1.add(a1);
                    questions1.add(a2);
                    questions1.add(a3);
                    questions1.add(a4);
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(questions1);
                    frame.revalidate();
                }
            });



            frame.setTitle("Collage!");
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setSize(600, 800);

            home.add(start);
            home.add(settings);
            home.add(leaderboard);

            frame.add(home);
            frame.setVisible(true);
        }


        public static void main(String[] args) {
            Main m = new Main();
        }

}