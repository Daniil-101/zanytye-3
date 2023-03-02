public class Answer {
    private  int numberAnswer;
    private String answer;
    private boolean correctOrNot;

    private Answer[] answers;



    public Answer(int numberAnswer, String answer, boolean correctOrNot) {
        this.numberAnswer = numberAnswer;
        this.answer = answer;
        this.correctOrNot = correctOrNot;
    }

    public int getNumberAnswer() {
        return numberAnswer;
    }

    public boolean getCorrectOrNot() {
        return correctOrNot;
    }

    public String getAnswer() {
        return answer;
    }
}

