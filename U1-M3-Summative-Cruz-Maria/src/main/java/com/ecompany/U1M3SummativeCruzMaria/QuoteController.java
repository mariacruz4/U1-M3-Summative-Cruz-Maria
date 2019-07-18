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

        this.quoteList.add(new Quote("Malala Yousafzai", "Let us remember: One book, one pen, one child, and one teacher can change the world."));
        this.quoteList.add(new Quote("Folgers", "The best part of waking up is Folgers in your cup."));
        this.quoteList.add(new Quote("Muhammad Ali", "I hated every minute of training, but I said, 'Don't quit. Suffer now and live the rest of your life as a champion.'"));
        this.quoteList.add(new Quote("Aurthur Helps", "Keep your feet on the ground, but let your heart soar as high as it will. Refuse to be average or to surrender to the chill of your spiritual environment."));
        this.quoteList.add(new Quote("Aurthur Ashe", "From what we get, we can make a living; what we give, however, makes a life."));
        this.quoteList.add(new Quote("Eleanor Roosevelt", "You must do the things you think you cannot do."));
        this.quoteList.add(new Quote("A. P. J. Abdul Kalam", "The bird is powered by its own life and by its motivation."));
        this.quoteList.add(new Quote("Martin Luther", "Even if I knew that tomorrow the world would go to pieces, I would still plant my apple tree."));
        this.quoteList.add(new Quote("Wilma Rudolph", "When the sun is shining I can do anything; no mountain is too high, no trouble too difficult to overcome."));
        this.quoteList.add(new Quote("Henry Rollins", "I believe that one defines oneself by reinvention. To not be like your parents. To not be like your friends. To be yourself. To cut yourself out of stone."));
    }
        @RequestMapping(value = "/quote", method = RequestMethod.GET)
        public Quote getQuote(){
        return quoteList.get(random.nextInt(quoteList.size()));
        }

}
