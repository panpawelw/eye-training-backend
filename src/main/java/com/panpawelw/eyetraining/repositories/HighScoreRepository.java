package com.panpawelw.eyetraining.repositories;

import com.panpawelw.eyetraining.entities.HighScore;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface HighScoreRepository extends JpaRepository<HighScore, Long> {
}
