package com.panpawelw.eyetraining.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HighScore {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private long score;

  private String userName;

  private int time;

  public HighScore() {
  }

  public HighScore(long id, long score, String userName, int time) {
    this.id = id;
    this.score = score;
    this.userName = userName;
    this.time = time;
  }

  public long getId() {
    return id;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getTime() {
    return time;
  }

  public void setTime(int time) {
    this.time = time;
  }
}
