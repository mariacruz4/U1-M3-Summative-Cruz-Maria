package com.ecompany.U1M3SummativeCruzMaria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import java.util.*;

@RestController
public class QuoteController {
    private List<Quote> quoteList =  new ArrayList<>();

    Random random = new Random();

    public QuoteController(){

        this.quoteList.add(new Quote("Timothy Montequin", "I am enough."));
        this.quoteList.add(new Quote("Folgers", "The best part of waking up is Folgers in your cup."));
        this.quoteList.add(new Quote("Burger King", "Have it your way."));
    }
        @RequestMapping(value = "/quote", value = RequestMethod.GET)
        public Quote getQuote(){
        return getQuote() = random.nextG;
        }

}
