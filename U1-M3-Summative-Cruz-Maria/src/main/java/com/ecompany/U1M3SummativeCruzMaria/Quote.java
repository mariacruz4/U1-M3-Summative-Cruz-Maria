package com.ecompany.U1M3SummativeCruzMaria;

public class Quote {
    //variables
    private String author;
    private String quote;
    //default constructor
    public Quote(){}
    //constructor
    public Quote(String author, String quote){
        this.author = author;
        this.quote = quote;
    }
    //getters and setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
