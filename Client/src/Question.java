import java.util.ArrayList;
import java.util.List;

public class Question {
    public String text;
    public List<Answer> answers;

    public Question(String text, Answer a1, Answer a2, Answer a3)
    {
        this.text = text;

        answers = new ArrayList<>();

        answers.add(a1);
        answers.add(a2);
        answers.add(a3);
    }
}
