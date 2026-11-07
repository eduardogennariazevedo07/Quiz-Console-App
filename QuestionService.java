public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1, "What?", "A", "B", "C", "D", "A");
        questions[1] = new Question(1, "What?", "A", "B", "C", "D", "B");
        questions[2] = new Question(1, "What?", "A", "B", "C", "D", "C");
        questions[3] = new Question(1, "What?", "A", "B", "C", "D", "D");
        questions[4] = new Question(1, "What?", "A", "B", "C", "D", "A");
    }

    public void displayQuestions(){

        for(Question q : questions){
            System.out.println(q);
        }
    }
}
