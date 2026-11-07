import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection [] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "Em que ano o Brasil foi descoberto?", "1500", "1499", "1888", "1970", "1500");
        questions[1] = new Question(2, "Em qual ano a linguagem Java foi oficialmente criada?" , "2000", "1990", "1995", "1987", "1995");
        questions[2] = new Question(3, "Qual foi o nome original da linguagem Java?", "Coffee", "Ruby", "Oak", "Kotlin", "Oak");
        questions[3] = new Question(4, "Qual o valor de 4³?", "12", "24", "48", "64", "64");
        questions[4] = new Question(5, "Qual o valor de 5²?", "50", "25", "10", "0", "25");
    }

    public void playQuiz(){

        int i=0;
        for(Question q : questions){
            System.out.println("Questão no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.println("============================================");

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite sua resposta: ");
           selection[i] = sc.nextLine();

           System.out.println("Sua resposta: "+selection[i]);
           i++;

        }

    }



    public void printScore(){

        int score =0;

        for (int i =0; i<questions.length; i++){
            Question que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)){
                score ++;
            }
        }

        System.out.println("============================================");

        System.out.println("Número de acertos: " + score + "/"+questions.length);

    }
}
