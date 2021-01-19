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

  private String userName;

  private int time;

  public HighScore() {
  }

  public HighScore(long id, String userName, int time) {
    this.id = id;
    this.userName = userName;
    this.time = time;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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
