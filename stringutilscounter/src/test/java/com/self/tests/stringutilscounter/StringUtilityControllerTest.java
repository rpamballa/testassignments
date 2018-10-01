package com.self.tests.stringutilscounter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class StringUtilityControllerTest {

    private final String text = "{ \"paragraph\" : \"This is a long string with different delimiters. Sentence with exclamation! and one with question mark?\"}";

    @Autowired
    private MockMvc mvc;

    @Test
    public void testWordCountPerSentence() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/word_count_per_sentence")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(text))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"wordCountPerSentence\":{\"and one with question mark\":5,\"Sentence with exclamation\":3,\"This is a long string with different delimiters\":8}}")));
    }

    @Test
    public void testLetterCountPerSentence() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/total_letter_count")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(text))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("{\"letterCount\":\" the text contains 1 !s, 5 As, 2 Cs, 3 Ds, 10 Es, 2 Fs, 2 Gs, 4 Hs, 11 Is, 1 Ks, 3 Ls, 3 Ms, 1 .s, 9 Ns, 4 Os, 1 Qs, 4 Rs, 6 Ss, 10 Ts, 1 Us, 3 Ws, 1 Xs, 1 ?s.\"}")));
    }
}

