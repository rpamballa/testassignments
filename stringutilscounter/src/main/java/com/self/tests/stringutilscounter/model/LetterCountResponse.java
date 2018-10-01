package com.self.tests.stringutilscounter.model;

public class LetterCountResponse {

    private String letterCount;

    public LetterCountResponse(String value) {
        this.letterCount = value;
    }

    public String getLetterCount() {
        return letterCount;
    }

    public void setLetterCount(String letterCount) {
        this.letterCount = letterCount;
    }
}
