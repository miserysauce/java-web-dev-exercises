package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Checkbox extends Question {
    private List<String> options;
    private List<String> correctOptions;

    public Checkbox(String prompt, List<String> options, List<String> correctOptions) {
        super(prompt, null);
        this.options = options;
        this.correctOptions = correctOptions;
    }

    public boolean isAnswerCorrect(String userAnswer) {
        String[] userSelectedOptions = userAnswer.split(",");
        if (userSelectedOptions.length != correctOptions.size()) {
            return false;
        }

        for (String option : correctOptions) {
            if (!userAnswer.contains(option)) {
                return false;
            }
        }

        return true;
    }

    public void displayOptions() {
        for (int i = 0; i < options.size(); i++) {
            System.out.println((char) ('A' + i) + ") " + options.get(i));
        }
    }

    public String getAnswer() {
        return String.join(",", correctOptions);
    }
}


