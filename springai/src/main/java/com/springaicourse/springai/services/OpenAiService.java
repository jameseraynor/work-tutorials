package com.springaicourse.springai.services;

import com.springaicourse.springai.models.Answer;
import com.springaicourse.springai.models.Question;

public interface OpenAiService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
}
