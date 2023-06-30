package org.launchcode.java.studios.funwithquizzes;

import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;
class MultipleChoice extends Question {
    private List<String> options;

    public MultipleChoice(String prompt, List<String> options, String answer) {
        super(prompt, answer);
        this.options = options;
    }
    public String getAnswer() {
        return super.answer;
    }
    public boolean isAnswerCorrect(String userAnswer) {
        return userAnswer.equalsIgnoreCase(getAnswer());
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((char) ('A' + i) + ") " + options.get(i));
        }
    }
}
