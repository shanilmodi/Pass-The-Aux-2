package com.shanilmodigmail.musicapp;

/**
 * Created by Shanil Modi on 8/4/2016.
 */

public class Quote {

    public String quote;
    public String person;


    public Quote(String mQuote, String mPerson){
        super();

        quote = mQuote;
        person = mPerson;

    }

    public String getPerson() {
        return person;
    }

    public String getQuote() {
        return quote;
    }
}
