package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add multiple-choice question
        List<String> options = new ArrayList<>();
        options.add("Option A");
        options.add("Option B");
        options.add("Option C");
        options.add("Option D");
        quiz.addQuestion(new MultipleChoice("What is the capital of France?", options, "C"));

        // Add true-or-false question
        quiz.addQuestion(new TrueOrFalse("Java is a programming language.", "True"));

        // Add checkbox question
        options = new ArrayList<>();
        options.add("Option A");
        options.add("Option B");
        options.add("Option C");
        options.add("Option D");
        List<String> correctOptions = new ArrayList<>();
        correctOptions.add("A");
        correctOptions.add("C");
        quiz.addQuestion(new Checkbox("Which options are fruits?", options, correctOptions));


        // Run the quiz
        quiz.run();
    }
}

