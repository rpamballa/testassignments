package com.self.tests.stringutilscounter;

import com.self.tests.stringutilscounter.model.LetterCountResponse;
import com.self.tests.stringutilscounter.model.TextRequest;
import com.self.tests.stringutilscounter.model.WordCountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringUtilityController {

    @Autowired
    private StringUtilityHelper stringUtilityHelper;

    @PostMapping(value = "/word_count_per_sentence")
    public WordCountResponse wordCountPerSentence(@RequestBody TextRequest jsonObject) {
        return new WordCountResponse(stringUtilityHelper.getWordCountPerSentence(jsonObject.getParagraph()));
    }

    @PostMapping(value = "/total_letter_count")
    public LetterCountResponse letterCount(@RequestBody TextRequest jsonObject) {
        StringBuilder stringBuilder = new StringBuilder(" the text contains ");
        stringUtilityHelper.getLetterCount(jsonObject.getParagraph())
                .forEach((key, value) -> stringBuilder.append(value + " " + key + "s, "));
        return new LetterCountResponse(stringBuilder.replace(stringBuilder.lastIndexOf(","), stringBuilder.length(), ".").toString());
    }


}
