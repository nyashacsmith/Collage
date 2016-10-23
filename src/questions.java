import javax.swing.*;

/**
 * Created by nyasha on 10/23/16.
 */
public class questions {
    private QuestionPanel questionPanel;
    private String question;
    private String answera;
    private String answerb;
    private String answerc;
    private String answerd;
    String[] answers = {answera, answerb, answerc, answerd};

    QuestionPanel q = new QuestionPanel();

    public class QuestionPanel extends JPanel{
        public QuestionPanel(){
            Box box = Box.createHorizontalBox();
            box.add(new JButton ("A"));
            box.add(new JButton ("B"));
            box.add(new JButton ("C"));
            box.add(new JButton ("D"));

        }

    }





}
