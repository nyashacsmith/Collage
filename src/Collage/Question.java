package Collage;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nyasha on 10/23/16.
 */
public class Question {
    public String question;
    public String[] answers;
    public JButton[] answerButtons;

    public Question(Map.Entry<String, String[]> m) {
        answerButtons = new JButton[4];
        question = m.getKey();
        answers = m.getValue();
        for (int i = 0; i < answers.length; i++) {
            answerButtons[i] = new JButton(answers[i]);
        }
    }

 }
