package Motiocut_Project1;

import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String questionText;
    private ArrayList<String> options;
    private int correctAnswerIndex;

    public Question(String questionText, ArrayList<String> options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestionText() {
        return questionText;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}

class Quiz {
    private ArrayList<Question> questions;
    private int score;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            displayQuestion(question);
            int userAnswer = getUserAnswer(scanner, question);
            checkAnswer(userAnswer, question);
        }
        scanner.close();
    }

    private void displayQuestion(Question question) {
        System.out.println(question.getQuestionText());
        ArrayList<String> options = question.getOptions();
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    private int getUserAnswer(Scanner scanner, Question question) {
        System.out.print("Your answer: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void checkAnswer(int userAnswer, Question question) {
        if (userAnswer == question.getCorrectAnswerIndex() + 1) {
            score++;
        }
    }

    public void displayScore() {
        System.out.println("Your score: " + score + "/" + questions.size());
    }
}

