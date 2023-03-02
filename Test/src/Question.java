import java.util.ArrayList;

public class Question {
    private String question;
    private ArrayList<String> questionAndAnswers = new ArrayList<>();
    private int rightAnswers;




    public Question(String question){
        this.question =question;
        questionAndAnswers.add(question);
    }

    public ArrayList getQuestion() {
        return questionAndAnswers;
    }

    public ArrayList addAnswers(Answer answer){
        questionAndAnswers.add(String.valueOf(answer.getNumberAnswer()));
        questionAndAnswers.add(answer.getAnswer());
        if(answer.getCorrectOrNot() == true) rightAnswers = answer.getNumberAnswer();
        return questionAndAnswers;
    }

    public int getRightAnswers(){
        return rightAnswers;
    }

    public void printQuestion(){
        String[] questionAndAnswer = new String[questionAndAnswers.size()];
        questionAndAnswers.toArray(questionAndAnswer);
        System.out.println(questionAndAnswer[0]);
        for(int i = 1; i<= questionAndAnswer.length;i +=2) {
            if(i<questionAndAnswer.length) System.out.println(questionAndAnswer[i] + ". " + questionAndAnswer[i+1]);
            else break;
        }
    }


}
