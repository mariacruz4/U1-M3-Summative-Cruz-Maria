package com.ecompany.U1M3SummativeCruzMaria;

public class Answer {
    //variables
    private String question;
    private String answer;
    //default constructor
    public Answer(){}
    //constructor
    public Answer(String answer){
        this.answer = answer;
    }
    //getters and setters
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
