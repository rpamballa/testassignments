package com.self.tests.stringutilscounter;

import org.springframework.stereotype.Component;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public final class StringUtilityHelper {

    public Map<String, Integer> getWordCountPerSentence(String value) {
        return Arrays.stream(value.split("\\?|\\.|!"))
                .map(this::getWordCount)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public Map<String, Long> getLetterCount(String sentence) {
        return sentence.replaceAll("\\s", "")
                .toUpperCase()
                .chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(s -> !s.equals(" "))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
    }

    private AbstractMap.SimpleEntry<String, Integer> getWordCount(String sentence) {
        return new AbstractMap.SimpleEntry<>(sentence.trim(), sentence.trim().split("\\s").length);
    }
}
