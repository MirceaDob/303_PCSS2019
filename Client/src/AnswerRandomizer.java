import java.util.*;

public class AnswerRandomizer
{
    public static List<String> shuffler()
    {
        String[] options = new String[]{"1","2","3","4"};
        List<String> AnswersR = Arrays.asList(options);

        System.out.println("original List : " + AnswersR);

        Collections.shuffle(AnswersR);

        System.out.println("Shuffled List : " + AnswersR);

        return AnswersR;
    }

}
