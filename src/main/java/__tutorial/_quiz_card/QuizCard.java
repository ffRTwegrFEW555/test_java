package __tutorial._quiz_card;

/**
 * Created by Vad on 06.06.2016.
 */
public class QuizCard {
    String question;
    String answer;

    public QuizCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
