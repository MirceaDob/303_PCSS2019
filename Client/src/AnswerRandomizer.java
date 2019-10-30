import java.util.*;



public class AnswerRandomizer
{

    String[] options;

    public static List<Answer> shuffler(List<Answer> answers)
    {
        //options = new String[]{"1","2","3","4"};

        // List<String> AnswersR = Arrays.asList(options[1],options[2],options[3]);

        //System.out.println("original List : " + AnswersR);

        Collections.shuffle(answers);

        //System.out.println("Shuffled List : " + AnswersR);

        //System.out.println(options.toString());

        return answers;
    }

}
