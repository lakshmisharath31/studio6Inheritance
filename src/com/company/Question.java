package com.company;

public class Question {

    public String question;
    public int pointValue;


    public Question(String question, int pointValue) {
        this.question = question;
        this.pointValue = pointValue;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public void displayQuestion(){
        System.out.println(question);
    }

   // public void addQuestion(Question question) {
     //this.questions.add(question);

  // }

}