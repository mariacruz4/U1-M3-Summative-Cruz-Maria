package com.ecompany.U1M3SummativeCruzMaria;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import java.util.*;
//setting up controller
@RestController
public class Magic8BallController {
    //creating List filled with answers
    private List<Answer> answerList = new ArrayList<>();
    //creating random
    Random random = new Random();

    public Magic8BallController(){
        //creating responses
        this.answerList.add(new Answer("Totally"));
        this.answerList.add(new Answer("No way"));
        this.answerList.add(new Answer("Maybe"));
        this.answerList.add(new Answer("Wouldn't count on it"));
        this.answerList.add(new Answer("Absolutely"));
        this.answerList.add(new Answer("Where there's a will there's a way."));
    }
    //URI is /magic and this is a POST method, so the user can input something
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Answer askQuestion(@RequestBody @Valid Answer question){
        //returns random answer
        return answerList.get(random.nextInt(answerList.size()));
    }
}
