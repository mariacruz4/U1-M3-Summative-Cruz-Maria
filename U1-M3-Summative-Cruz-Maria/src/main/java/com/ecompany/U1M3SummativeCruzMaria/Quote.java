package com.ecompany.U1M3SummativeCruzMaria;

public class Quote {

    private String author;
    private String quote;

    public Quote(){}

    public Quote(String author, String quote){
        this.author = author;
        this.quote = quote;
    }

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
