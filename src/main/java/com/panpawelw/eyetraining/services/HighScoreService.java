package com.panpawelw.eyetraining.services;

import com.panpawelw.eyetraining.entities.HighScore;
import com.panpawelw.eyetraining.repositories.HighScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighScoreService {

  private final HighScoreRepository highScoreRepository;

  public HighScoreService(HighScoreRepository highScoreRepository) {
    this.highScoreRepository = highScoreRepository;
  }

  public List<HighScore> getAllHighScores() {
    return highScoreRepository.findAll();
  }

  public boolean saveHighScore(HighScore highScore) {
    return highScoreRepository.saveAndFlush(highScore).getId() != 0;
  }
}
