package com.allyRx.AvisMotion.Service;

import com.allyRx.AvisMotion.Entity.Client;
import com.allyRx.AvisMotion.Entity.Sentiment;
import com.allyRx.AvisMotion.Repository.ClientRepository;
import com.allyRx.AvisMotion.Repository.SentimentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SentimentService {

    //Injection de notre repository
    private SentimentRepository sentimentRepository;
    private ClientService clientService;


    public void addSentiment(Sentiment sentiment) {
       Client newClient =  clientService.getOrCreateClient(sentiment.getClient());
       sentiment.setClient(newClient);

        sentimentRepository.save(sentiment);
    }

    public List<Sentiment> getSentiments() {
        return sentimentRepository.findAll();
    }

    public Optional<Sentiment> getSentimentById(Long id) {
        return sentimentRepository.findById(id);
    }


    public void deleteSentiment(Long id) {
        sentimentRepository.deleteById(id);
    }
}
