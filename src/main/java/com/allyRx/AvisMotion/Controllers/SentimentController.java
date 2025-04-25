package com.allyRx.AvisMotion.Controllers;

import com.allyRx.AvisMotion.Entity.Sentiment;
import com.allyRx.AvisMotion.Service.SentimentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/sentiment") @AllArgsConstructor
public class SentimentController {
    private SentimentService sentimentService;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void addSentiment(@RequestBody Sentiment sentiment) {
        sentimentService.addSentiment(sentiment);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public List<Sentiment> getSentiments() {
        return sentimentService.getSentiments();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "{id}")
    public Optional<Sentiment> getSentimentById(@PathVariable Long id) {
        return sentimentService.getSentimentById(id);
    }
}
