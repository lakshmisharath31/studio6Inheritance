package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
  ArrayList<String> quizQuestion = new ArrayList<>();
    ArrayList<String> quizChoice = new ArrayList<>();
    ArrayList<Object> question = new ArrayList<>();
    ArrayList<Integer> score =  new ArrayList<>();
    ArrayList<String> input1 = new ArrayList<>();
    int total = 0;

    public Quiz(ArrayList<Object> question) {

        this.question = question;

    }

    public Quiz(ArrayList<String> quizQuestion, ArrayList<String> quizChoice, ArrayList<Object> question) {
        this.quizQuestion = quizQuestion;
        this.quizChoice = quizChoice;
        this.question = question;
    }

    public void addQuestion(MultipleChoice mcq){
        quizQuestion.add(mcq.question);
        quizChoice.add(mcq.choice.toString());
        score.add(mcq.pointValue);
       input1.add(mcq.answer);
    }

    public void addQuestion(CheckBox chb){
        quizQuestion.add(chb.question);
        quizChoice.add(chb.choice.toString());
        score.add(chb.pointValue);
        input1.add(chb.answer);


    }

    public void addQuestion(TrueOrFalse tof){
        quizQuestion.add(tof.question);
        quizChoice.add(tof.choice.toString());
        score.add(tof.pointValue);
        input1.add(tof.answer);


    }

    public void quizDisplay() {
        for (int i = 0; i < quizQuestion.size(); i++) {
            System.out.println((i+1)+":" +quizQuestion.get(i));
            System.out.println(quizChoice.get(i));
            System.out.println("please choose your answer:");
            Scanner input = new Scanner(System.in);
            String mcqAnswer = input.nextLine();
            System.out.println(" your answer is :" + mcqAnswer);
            if(mcqAnswer.matches(input1.get(i)))
            {
                total=score.get(i)+total;

            }

            }
        if(total==6){
            System.out.println("your score:"+total+"/6");
            System.out.println("Excellent!");
        } else if(total>=4 && total<=5){
            System.out.println("your score:"+total+"/6");
            System.out.println("Good!");
        }else if(total<4){
            System.out.println("your Final score:"+total+"/6");
            System.out.println("Can do better!");
        }
    }

}




