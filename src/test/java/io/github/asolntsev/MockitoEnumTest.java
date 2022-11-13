package io.github.asolntsev;

import org.junit.jupiter.api.Test;

import static io.github.asolntsev.Hobby.BOOK;
import static io.github.asolntsev.Hobby.COMPUTER;
import static io.github.asolntsev.Hobby.FILM;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;

public class MockitoEnumTest {
  private final HobbyService service = new HobbyService();

  @Test
  void spyEnum1() {
    Hobby book = spy(BOOK);
    assertThat(service.slogan(book)).isEqualTo("Read a book");
  }

  @Test
  void spyEnum2() {
    Hobby film = spy(FILM);
    assertThat(service.slogan(film)).isEqualTo("Watch a film");
  }

  @Test
  void spyEnum3() {
    Hobby computer = spy(COMPUTER);
    assertThat(service.slogan(computer)).isEqualTo("Play a computer");
  }
}
