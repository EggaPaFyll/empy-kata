package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class CoordinatesTest {

    @Test
    void coordinates_with_same_values_are_considered_equal() {
        assertThat(new Coordinates(2, 3)).isEqualTo(new Coordinates(2, 3));
    }

    public static Coordinates coord(int x, int y) {
        return new Coordinates(x, y);
    }
}