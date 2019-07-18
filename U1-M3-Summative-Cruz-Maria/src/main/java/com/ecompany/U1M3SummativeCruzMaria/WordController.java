package com.ecompany.U1M3SummativeCruzMaria;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import java.util.*;
//setting up controller
@RestController
public class WordController {
    //creating List filled with arraylists of words and definitions
    private List<Definition> definitionList = new ArrayList<>();
    //creates random
    Random random = new Random();

    public WordController(){
        //adding words and definitions
        this.definitionList.add(new Definition("Estatic","Feeling or expressing overwhelming happiness or joyful excitement."));
        this.definitionList.add(new Definition("Gregarious", "Fond of company; sociable."));
        this.definitionList.add(new Definition("Ambivalent", "Having mixed feelings or contradictory ideas about something or someone."));
        this.definitionList.add(new Definition("Falter", "Move unsteadily or in a way that shows lack of confidence."));
        this.definitionList.add(new Definition("Harangue", "A lengthy and aggressive speech."));
        this.definitionList.add(new Definition("Reticence", "The quality of not revealing one’s thoughts or feelings readily."));
        this.definitionList.add(new Definition("Ruminate","Think deeply about something."));
        this.definitionList.add(new Definition("Syncopation","A displacement of the beat or accents in (music or a rhythm) so that strong beats become weak and vice versa."));
        this.definitionList.add(new Definition("Tawdry", "Showy but cheap and of poor quality."));
        this.definitionList.add(new Definition("Zeal", "Great energy or enthusiasm in pursuit of a cause or an objective."));
    }
    //URI is /word and GET is the method
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getDefinition(){
        //returns random word and definition
        return definitionList.get(random.nextInt(definitionList.size()));
    }
}
