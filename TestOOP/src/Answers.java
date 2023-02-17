public class Answers {
    int numberAnswer;
    String textAnswer;
    boolean correctAnswerOrNot;


    public static void typeAnswers(int numberAnswer, String[][] textAnswer) {
        for (int j=0; j<textAnswer[numberAnswer].length; j++) {
            System.out.println(textAnswer[numberAnswer][j]);
        }


    }
    public static boolean correctAnswerOrNot(int number, int userResponse, int[] textAnswer) {
        if (userResponse == textAnswer[number]) {
            return true;
        } else {
            return false;
        }
    }

}
