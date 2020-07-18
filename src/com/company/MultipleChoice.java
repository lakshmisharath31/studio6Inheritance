package com.company;

import java.util.ArrayList;

public class MultipleChoice extends Question{

    public String answer;
    public ArrayList<String> choice;

    public  MultipleChoice(String question, int pointValue, ArrayList<String> choice,String answer) {
        super(question, pointValue) ;
        this.question=question;
        this.pointValue=pointValue;
        this.choice=choice;
        this.answer=answer;
    }

}

