import java.util.*;

public class AnswerRandomizer
{
    String[] options;

    public static List<String> shuffler(String[] options)
    {
        //options = new String[]{"1","2","3","4"};
        List<String> AnswersR = Arrays.asList(options[1],options[2],options[3]);
        System.out.println("original List : " + AnswersR);

        Collections.shuffle(AnswersR);

        System.out.println("Shuffled List : " + AnswersR);

        System.out.println(options.toString());

        return AnswersR;
    }

}
