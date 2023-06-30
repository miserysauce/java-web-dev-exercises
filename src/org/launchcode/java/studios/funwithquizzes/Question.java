package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Question {
    private String prompt;
    String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }

    public abstract boolean isAnswerCorrect(String userAnswer);

    public void displayPrompt() {
        System.out.println(prompt);
    }
}










