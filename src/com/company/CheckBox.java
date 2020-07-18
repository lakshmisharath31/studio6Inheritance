package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckBox extends Question{

        public String  answer;
        public ArrayList<String> choice;

        public  CheckBox(String question, int pointValue, ArrayList<String> choice,String answer) {
            super(question, pointValue) ;
            this.question=question;
            this.pointValue=pointValue;
            this.choice=choice;
            this.answer=answer;
        }





    }


