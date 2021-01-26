package com.panpawelw.eyetraining.controllers;

import com.panpawelw.eyetraining.entities.HighScore;
import com.panpawelw.eyetraining.services.HighScoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("highscores")
public class HighScoreController {

  private final HighScoreService highScoreService;

  public HighScoreController(HighScoreService highScoreService) {
    this.highScoreService = highScoreService;
  }

  @GetMapping(value = "/", produces = "application/json")
  public List<HighScore> getHighscores() {
    return highScoreService.getAllHighScores();
  }

  @PostMapping(value = "/")
  public boolean saveHighScore(HighScore highScore) {
    return highScoreService.saveHighScore(highScore);
  }
}
