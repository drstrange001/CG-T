package com.example.assignment_2_spring_core;

import java.util.Map;

public class Question {
    String questionId;
    String question;
    Map<Integer, String> answers;

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Map<Integer, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Integer, String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        String answerStr = String.join(",", answers.values());
        return "Question{" +
                "questionId='" + questionId + '\'' +
                ", question='" + question + '\'' +
                ", answers=" + answerStr +
                '}';
    }
}
