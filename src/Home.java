/**
 * Created by cierralewis on 10/23/16.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Home {
    JPanel j = new JPanel(new GridBagLayout());

    public class GamePanel extends JPanel {
        public GamePanel() {
            JButton start = new JButton("Start!");
            JButton settings = new JButton("Setttings!");
            JButton leaderboard = new JButton("Leaderboard");

            Box box = Box.createVerticalBox();
            box.add(start);
            box.add(settings);
            box.add(leaderboard);

            add(box);

        }
    }
}
