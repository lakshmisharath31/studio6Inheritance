package com.company;

import java.util.ArrayList;

public class TrueOrFalse extends Question{

    public String answer;
    public ArrayList<String> choice;

    public  TrueOrFalse(String question, int pointValue, ArrayList<String> choice,String answer) {
        super(question, pointValue) ;
        this.choice=choice;
        this.answer=answer;
        this.pointValue=pointValue;
    }
}
