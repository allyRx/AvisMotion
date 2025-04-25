package com.allyRx.AvisMotion.Repository;

import com.allyRx.AvisMotion.Entity.Sentiment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SentimentRepository extends JpaRepository<Sentiment, Long> {
}
