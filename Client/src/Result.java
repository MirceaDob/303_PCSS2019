public class Result {
    int points = 0;


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
                points += 1;
                break;
            case WRONG:
                points +=0;
                break;
        }

    }
}