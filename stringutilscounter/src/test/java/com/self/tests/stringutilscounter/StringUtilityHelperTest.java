package com.self.tests.stringutilscounter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {StringUtilityHelper.class})
public class StringUtilityHelperTest {

    @Autowired
    private StringUtilityHelper stringUtilityHelper;

    @Test
    public void testWordPerSentenceCountTest() {
        //given
        String giveStatement = "This is a long string with different delimiters." +
                " Sentence with exclamation! and one with question mark?";

        //when
        Map<String, Integer> wordCountPerSentence = stringUtilityHelper.getWordCountPerSentence(giveStatement);

        //then
        assertEquals(wordCountPerSentence.size(), 3);
        assertEquals(wordCountPerSentence.get("Sentence with exclamation").intValue(), 3);
        assertEquals(wordCountPerSentence.get("This is a long string with different delimiters").intValue(), 8);
    }

    @Test
    public void testLettersInSentence() {
        //given
        String giveSentence = "Count number of letters with spaces";

        //when
        Map<String, Long> characterCount = stringUtilityHelper.getLetterCount(giveSentence);

        //then
        assertNull(characterCount.get("c"));
        assertEquals(characterCount.get("C").longValue(), 2);
        assertEquals(characterCount.get("N").longValue(), 2);
    }

}
