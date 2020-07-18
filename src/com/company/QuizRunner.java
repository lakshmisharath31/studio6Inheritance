package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {

    public static void main(String[] args) {
       ArrayList<String> ch = new ArrayList<>(Arrays.asList("white", "red", "blue", "green"));
        MultipleChoice mcq=new MultipleChoice("What color is sky?",1,ch,"blue");
        Quiz quiz=new Quiz(new ArrayList<>());
        ArrayList<String> ch1 = new ArrayList<>(Arrays.asList("(a) (jan,feb) ", "(b) (mar,april)","(c)(mar,may)"));
        CheckBox chb=new CheckBox("which are the months which has 31 days?",2,ch1,"c");
        ArrayList<String> ch2 = new ArrayList<>(Arrays.asList("(a) true ", "(b) false"));
        TrueOrFalse tof = new TrueOrFalse("Is water colorless?",3,ch2,"a");
        quiz.addQuestion(mcq);
        quiz.addQuestion(chb);
        quiz.addQuestion(tof);
        quiz.quizDisplay();

    }

}
