package org.venuspj.models.fundamentals;

import static org.assertj.core.api.Java6Assertions.*;
import org.junit.Test;

public class NameTest {

	@Test
	public void of() {
		Name name = Name.of("dummy");
        assertThat(name)
        .isNotNull();
	}

    @Test
    public void getValue() {
        Name name = Name.of("dummy");
        assertThat(name.getValue())
        .isEqualTo("dummy");
    }

}
