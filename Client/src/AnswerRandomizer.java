import java.util.*;



public class AnswerRandomizer
{

    String[] options;

    public static List<Answer> shuffler(List<Answer> answers)
    {

        Collections.shuffle(answers);



        return answers;
    }

}
