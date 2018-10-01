package com.self.tests.stringutilscounter.model;

import java.util.Map;

public class WordCountResponse {

    private Map<String, Integer> wordCountPerSentence;

    public WordCountResponse(Map<String, Integer> wordCountPerSentence) {
        this.wordCountPerSentence = wordCountPerSentence;
    }

    public Map<String, Integer> getWordCountPerSentence() {
        return wordCountPerSentence;
    }

    public void setWordCountPerSentence(Map<String, Integer> wordCountPerSentence) {
        this.wordCountPerSentence = wordCountPerSentence;
    }
}
