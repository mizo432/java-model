package org.venuspj.models.fundamentals;

import static org.assertj.core.api.Java6Assertions.*;
import org.junit.Test;

public class CommentTest {

  @Test
  public void constructor() {
      Comment target = new Comment();
      assertThat(target)
      .isNotNull();
      assertThat(target.isEmpty())
      .isTrue();
  }

  @Test
  public void of() {
      Comment target = Comment.of("dummy");
      assertThat(target)
      .isNotNull();
  }

  @Test
  public void getValue() {
      Comment target = Comment.of("dummy");
      assertThat(target.getValue())
      .isEqualTo("dummy");
  }

}
