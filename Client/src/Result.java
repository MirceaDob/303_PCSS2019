public class Result {
    int rights = 0;
    int wrongs = 0;


    Outcomes UserChoice (Answers answers)
    {
        switch(answers)
        {
            case A1:
                return Outcomes.RIGHT;
            case A2:
                return Outcomes.WRONG;
            case A3:
                return Outcomes.WRONG;
        }
        throw new RuntimeException("Invalid answer.");
    }

    void registerOutcome(Outcomes outcome) {
        switch (outcome) {
            case RIGHT:
                rights += 1;
                break;
            case WRONG:
                wrongs += 0;
                break;
        }

    }
}