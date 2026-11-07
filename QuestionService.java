import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection [] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "What? 1", "A", "B", "C", "D", "A");
        questions[1] = new Question(1, "What? 2" , "A", "B", "C", "D", "B");
        questions[2] = new Question(1, "What? 3", "A", "B", "C", "D", "C");
        questions[3] = new Question(1, "What? 4", "A", "B", "C", "D", "D");
        questions[4] = new Question(1, "What? 5", "A", "B", "C", "D", "A");
    }

    public void playQuiz(){

        int i=0;
        for(Question q : questions){
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);

           selection[i] = sc.nextLine();
           i++;

        }

        for (String s : selection){
            System.out.println(s);
        }
    }
}
