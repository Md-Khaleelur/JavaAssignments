package com.company;
import java.util.regex.Pattern;

class SentenceCheck {
    public void check(String sentence)
    {
        if(Pattern.matches("[A-Z](.)*[.]$", sentence))
            System.out.println("Sentence begins with capital and ends with a period");
        else
            System.out.println("Does not follow the pattern");
    }
}