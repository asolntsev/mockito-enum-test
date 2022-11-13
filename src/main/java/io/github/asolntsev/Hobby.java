package io.github.asolntsev;

public enum Hobby {
  BOOK("Read"),
  FILM("Watch"),
  COMPUTER("Play");

  private final String action;

  Hobby(String action) {
    this.action = action;
  }

  public String getAction() {
    return action;
  }
}
