package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThingTest {

    @Test
    void name() {
        assertThat(new Thing().greeting()).isEqualTo("General Kenobi");
    }
}
