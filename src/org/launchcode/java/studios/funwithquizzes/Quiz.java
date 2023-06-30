package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println("--------");
            question.displayPrompt();
            if (question instanceof MultipleChoice ) {
                ((MultipleChoice) question).displayOptions();
            } else if ( question instanceof Checkbox){
                ((Checkbox) question).displayOptions();
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();
            if (question.isAnswerCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
        }

        System.out.println("--------");
        System.out.println("Quiz completed. Your score: " + score + "/" + questions.size());
    }
}



