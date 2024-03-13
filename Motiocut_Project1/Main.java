package Motiocut_Project1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating questions
        ArrayList<Question> questions = new ArrayList<Question>();

        // Question 1
        ArrayList<String> options1 = new ArrayList<String>();
        options1.add("Linear Search");
        options1.add("Binary Search");
        options1.add("Bubble Sort");
        questions.add(new Question("Which algorithm has a time complexity of O(log n) for searching?", options1, 1));

        // Question 2
        ArrayList<String> options2 = new ArrayList<String>();
        options2.add("BFS");
        options2.add("DFS");
        options2.add("Dijkstra's Algorithm");
        questions.add(new Question("Which algorithm is used to find the shortest path in a weighted graph?", options2, 2));

        // Question 3
        ArrayList<String> options3 = new ArrayList<String>();
        options3.add("Big-O notation");
        options3.add("Binary tree");
        options3.add("Linked list");
        questions.add(new Question("Which data structure is best suited for representing a hierarchical relationship between elements?", options3, 1));

        // Starting the quiz
        Quiz quiz = new Quiz(questions);
        quiz.startQuiz();
        quiz.displayScore();
    }
}

