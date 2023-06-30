package org.launchcode.java.studios.funwithquizzes;

import java.util.Scanner;
class TrueOrFalse extends Question {
    public TrueOrFalse(String prompt, String answer) {
        super(prompt, answer);
    }
    public String getAnswer() {
        return super.answer;
    }
    public boolean isAnswerCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(getAnswer());
    }
}

