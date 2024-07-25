package exam;
import java.util.Scanner;
public class Exam {
	private Question[] questions;
    private int[] userAnswers;
    private long startTime;
    private int duration; // in seconds

    public Exam(Question[] questions, int duration) {
        this.questions = questions;
        this.userAnswers = new int[questions.length];
        this.duration = duration;
    }

    public void startExam() {
        startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            if (isTimeUp()) {
                System.out.println("Time's up! Auto-submitting...");
                break;
            }
            System.out.println(questions[i].getQuestionText());
            String[] options = questions[i].getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            System.out.print("Your answer: ");
            userAnswers[i] = scanner.nextInt();
        }
        submitExam();
    }

    public void submitExam() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].checkAnswer(userAnswers[i])) {
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.length);
    }

    private boolean isTimeUp() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = (currentTime - startTime) / 1000;
        return elapsedTime > duration;
    }
}
