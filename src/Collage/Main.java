package Collage;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Main extends JFrame implements ActionListener{
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
        int num = 0;
        int j = 1;
        JPanel[] questionPanel = new JPanel[25];
        Collage.Question[] questions = new Collage.Question[25];
        private Integer seconds = 11;
        JLabel time = new JLabel(Integer.toString(seconds));
        private int speed = 1000; // How often the screen is redrawn (when the snake is moved)
        private Timer timer;
        private JProgressBar progressBar;


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
            JButton[] buttons = {disney, anime, animals, veganism, music, random};
            HashMap<String, String[]> questionMap = new Collage.Constants().getDisneyQuestions();

            int i = 0;
            timer = new Timer(speed, this);
            progressBar = new JProgressBar(0, 100);





            for (Map.Entry<String, String[]> e : questionMap.entrySet()) {
                questions[i] = new Collage.Question(e);
                i++;
            }

            for (Collage.Question q : questions) {
                System.out.println(q);
            }



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
            for (JButton button : buttons) {
                num += 1;
                button.addActionListener(this);

            }

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

    @Override
    public void actionPerformed(ActionEvent e) {
        String label = Integer.toString(j) + ". " + questions[num - 1].question;
        JLabel q1 = new JLabel(label);
        if (seconds >= 0) {
            //speed += 1000;
            //going through each panel

            timer.start();

            int current = Integer.parseInt(time.getText());
            current--;
            seconds--;
            time.setText(Integer.toString(current));


            if (seconds == 0) {
                timer.stop();

            }
        }
        progressBar.setValue(10);
        progressBar.setStringPainted(true);
        questionPanel[num - 1] = new JPanel();
        questionPanel[num - 1].add(q1);
        questionPanel[num-1].add(time);
        questionPanel[num-1].add(progressBar);


        for (JButton b : questions[num - 1].answerButtons) {
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    j += 1;
                    String label = Integer.toString(j) + ". " + questions[num - 1].question;
                    JLabel q1 = new JLabel(label);
                    questionPanel[num - 1] = new JPanel();
                    questionPanel[num - 1].add(q1);
                    for (JButton c : questions[num - 1].answerButtons) {
                        questionPanel[num - 1].add(c);
                    }
                    frame.getContentPane().removeAll();
                    frame.getContentPane().add(questionPanel[num - 1]);
                    frame.revalidate();
                    //frame.repaint();
                }
            });
            questionPanel[num - 1].add(b);
        }



        frame.getContentPane().removeAll();
        frame.getContentPane().add(questionPanel[num - 1]);
        frame.revalidate();
        //frame.repaint();


    }
}