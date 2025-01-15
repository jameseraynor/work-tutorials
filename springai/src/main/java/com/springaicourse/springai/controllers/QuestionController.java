package com.springaicourse.springai.controllers;

import com.springaicourse.springai.models.Answer;
import com.springaicourse.springai.models.Question;
import com.springaicourse.springai.services.OpenAiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    private final OpenAiService openAiService;

    public QuestionController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @PostMapping("/ask")
    public Answer getAnswer(@RequestBody Question question) {
        return openAiService.getAnswer(question);
    }

}
