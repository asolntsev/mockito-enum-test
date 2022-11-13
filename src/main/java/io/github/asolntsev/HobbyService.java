package io.github.asolntsev;

public class HobbyService {
  public String slogan(Hobby hobby) {
    return switch (hobby) {
      case BOOK -> hobby.getAction() + " a book";
      case FILM -> hobby.getAction() + " a film";
      case COMPUTER -> hobby.getAction() + " a computer";
    };
  }
}
