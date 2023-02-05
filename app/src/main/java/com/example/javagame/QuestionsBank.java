package com.example.javagame;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    public List<QuestionsList> getQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();
        final QuestionsList question1 = new QuestionsList("Bla bla bla",
                "TudaSuda", "Xaxaxa", "babab", "AxaxTaaaaa",
                "Xaxaxa", "");
        final QuestionsList question2 = new QuestionsList("Tatatat",
                "True", "False", "Correct", "incorrect",
                "True", "");
        final QuestionsList question3 = new QuestionsList("Nananan",
                "Studio", "Develop", "Master", "Origin",
                "Master", "");
        final QuestionsList question4 = new QuestionsList("siiiiiiu",
                "Car", "Plane", "Rocket", "Helicopter",
                "Car", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);

        return questionsLists;
    }
}


