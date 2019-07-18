package com.ecompany.U1M3SummativeCruzMaria;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import java.util.*;

@RestController
public class Magic8BallController {
    private List<Answer> answerList = new ArrayList<>();

    Random random = new Random();

    public Magic8BallController(){
        this.answerList.add(new Answer("Totally"));
        this.answerList.add(new Answer("No way"));
        this.answerList.add(new Answer("Maybe"));
        this.answerList.add(new Answer("Wouldn't count on it"));
        this.answerList.add(new Answer("Absolutely"));
        this.answerList.add(new Answer("Where there's a will there's a way."));
    }
    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Answer askQuestion(@RequestBody @Valid Answer question){

        return answerList.get(random.nextInt(answerList.size()));
    }
}
