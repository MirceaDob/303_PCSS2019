import javax.swing.*;
import java.util.Random;

public class MainWindow
{
    private JFrame window;
    private QuestionPanel questionPanel;

    public MainWindow()
    {
        window = new JFrame();
        questionPanel = new QuestionPanel();
        window.setContentPane(questionPanel);
        // Setup the basic window
        window.setSize(1000, 700);
        window.setLayout(null);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public void setToQuestionPanel(Question question)
    {
        questionPanel.showQuestion(question);
        window.setContentPane(questionPanel);
    }
}
