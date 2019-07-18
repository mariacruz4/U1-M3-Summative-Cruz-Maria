package com.ecompany.U1M3SummativeCruzMaria;

public class Definition {
    //variables
    private String word;
    private String definition;
    //default constructor
    public Definition(){}
    //constructor
    public Definition(String word, String definition){
        this.word = word;
        this.definition = definition;
    }
    //getters and setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
