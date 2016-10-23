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

public class Categories {
    JPanel j = new JPanel(new GridBagLayout());

    public class GamePanel extends JPanel {
        public GamePanel() {
            JButton disney = new JButton("Disney Characters");
            JButton music = new JButton("Music");
            JButton vegan = new JButton("Veganism");
            JButton animal = new JButton("Animals");
            JButton manga = new JButton("Manga & Anime");

            Box box = Box.createVerticalBox();
            box.add(disney);
            box.add(vegan);
            box.add(music);
            box.add(manga);
            box.add(animal);

            add(box);

        }
    }
}
