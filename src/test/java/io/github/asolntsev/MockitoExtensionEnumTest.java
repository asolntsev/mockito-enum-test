package io.github.asolntsev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static io.github.asolntsev.Hobby.COMPUTER;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class MockitoExtensionEnumTest {
  @Spy 
  private Hobby computer = COMPUTER;
  
  @InjectMocks 
  private HobbyService service;

  @Test
  void spyEnum() {
    assertThat(service.slogan(computer)).isEqualTo("Play a computer");
  }
}
