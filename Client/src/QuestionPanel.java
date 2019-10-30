import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.IOException;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class QuestionPanel extends JPanel implements ActionListener {
    List<Answer> answers;

    JTextArea questionArea;
    JButton a1;
    JButton a2;
    JButton a3;

    int scor;

    public QuestionPanel() {

        JTextArea score = new JTextArea("Score:", scor, scor);
        score.setBounds(400, 50, 200, 100);
        score.setEditable(false);
        add(score);

        questionArea = new JTextArea();
        //questionArea.update(questionArea.getGraphics());
        questionArea.setBounds(100, 250, 800, 200);
        questionArea.setEditable(false);
        add(questionArea);

        JButton next = new JButton();
        next.setBounds(700, 75, 150, 40);
        add(next);

        a1 = new JButton();
        a1.addActionListener(this);
        a1.setActionCommand("Button1");
        a1.setBounds(50, 500, 900, 40);
        add(a1);

        a2 = new JButton();
        a2.setBounds(50, 550, 900, 40);
        a2.addActionListener(this);
        a2.setActionCommand("Button2");
        add(a2);

        a3 = new JButton();
        a3.setBounds(50, 600, 900, 40);
        a3.addActionListener(this);
        a3.setActionCommand("Button3");
        add(a3);

    }

    void showQuestion(Question question)
    {
        questionArea.setText(question.text);
        List<Answer> answers = AnswerRandomizer.shuffler(question.answers);
        this.answers = answers;
        a1.setText(answers.get(0).text);
        a2.setText(answers.get(1).text);
        a3.setText(answers.get(2).text);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("Button1")) {
            if (answers.get(0).isRightAnswer) {
                System.out.println("Right!");
                // We pressed the right answer!
            } else {
                System.out.println("wrong");
            }
        }
        if (action.equals("Button2")) {
            if (answers.get(1).isRightAnswer) {
                System.out.println("Right!");
                // We pressed the right answer!
            } else {
                System.out.println("wrong");
            }
        }
        if (action.equals("Button3")) {
            if (answers.get(2).isRightAnswer) {
                System.out.println("Right!");
                // We pressed the right answer!
            } else {
                System.out.println("wrong");
            }
        }
    }
}
