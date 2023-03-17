package de.egga;

import org.junit.jupiter.api.Test;

import static de.egga.CoordinatesTest.coord;
import static de.egga.Directions.*;
import static org.assertj.core.api.Assertions.assertThat;

/*
One level of indentation per method.
Don't use the ELSE keyword.
Wrap all primitives and Strings in classes.
First class collections.
One dot per line.
Don't abbreviate.
Keep all classes less than 50 lines.
No classes with more than two instance variables.
No getters or setters.
*/

public class MarsRoverTest {

    public static final Directions ANY_DIRECTION = NORTH;
    public static final Coordinates ANY_COORDINATES = coord(1, 2);

    @Test
    void rover_is_located_at_starting_point() {
        MarsRover rover = new MarsRover(coord(1, 2), ANY_DIRECTION);
        boolean atPosition = rover.isAtPosition(coord(1, 2));
        assertThat(atPosition).isTrue();
    }


    @Test
    void rover_is_facing_starting_direction() {
        MarsRover rover = new MarsRover(ANY_COORDINATES, NORTH);
        assertThat(rover.isFacing(NORTH)).isTrue();
    }

    @Test
    void test_current_position_after_move_north() {
        MarsRover rover = new MarsRover(coord(0, 0), NORTH);
        rover.moveForward();
        assertThat(rover.isAtPosition(coord(0, 1))).isTrue();
    }
    @Test
    void test_current_position_after_move_south() {
        MarsRover rover = new MarsRover(coord(0, 0), SOUTH);
        rover.moveForward();
        assertThat(rover.isAtPosition(coord(0, -1))).isTrue();
    }

    @Test
    void test_current_position_after_move_west() {
        MarsRover rover = new MarsRover(coord(0, 0), WEST);
        rover.moveForward();
        assertThat(rover.isAtPosition(coord(-1, 0))).isTrue();
    }

    @Test
    void test_current_position_after_move_east() {
        MarsRover rover = new MarsRover(coord(0, 0), EAST);
        rover.moveForward();
        boolean atPosition = rover.isAtPosition(coord(1, 0));
        assertThat(atPosition).isTrue();
    }

    @Test
    void test_current_position_after_move_backward_facing_east() {
        MarsRover rover = new MarsRover(coord(0, 0), EAST);
        rover.moveBackward();
        assertThat(rover.isAtPosition(coord(-1, 0))).isTrue();
    }
    @Test
    void test_current_position_after_move_backward_facing_west() {
        MarsRover rover = new MarsRover(coord(0, 0), WEST);
        rover.moveBackward();
        assertThat(rover.isAtPosition(coord(1, 0))).isTrue();
    }
    @Test
    void test_current_position_after_move_backward_facing_south() {
        MarsRover rover = new MarsRover(coord(0, 0), SOUTH);
        rover.moveBackward();
        assertThat(rover.isAtPosition(coord(0, 1))).isTrue();
    }
    @Test
    void test_current_position_after_move_backward_facing_north() {
        MarsRover rover = new MarsRover(coord(0, 0), NORTH);
        rover.moveBackward();
        assertThat(rover.isAtPosition(coord(0, -1))).isTrue();
    }
    @Test
    void test_current_position_after_move_backward_facing_north_twice() {
        MarsRover rover = new MarsRover(coord(0, 0), NORTH);
        rover.moveBackward();
        rover.moveBackward();
        assertThat(rover.isAtPosition(coord(0, -2))).isTrue();
    }

    @Test
    void test_turn_left_when_facing_north_changes_to_west() {
        MarsRover rover = new MarsRover(coord(0, 0), NORTH);
        rover.turnLeft();
        assertThat(rover.isFacing(WEST)).isTrue();
    }
    @Test
    void test_turn_left_when_facing_west_changes_to_south() {
        MarsRover rover = new MarsRover(coord(0, 0), WEST);
        rover.turnLeft();
        assertThat(rover.isFacing(SOUTH)).isTrue();
    }
    @Test
    void test_turn_left_when_facing_south_changes_to_east() {
        MarsRover rover = new MarsRover(coord(0, 0), SOUTH);
        rover.turnLeft();
        assertThat(rover.isFacing(EAST)).isTrue();
    }

    @Test
    void test_turn_right_when_facing_east_changes_to_south() {
        MarsRover rover = new MarsRover(coord(0, 0), EAST);
        rover.turnRight();
        assertThat(rover.isFacing(SOUTH)).isTrue();
    }
    @Test
    void test_turn_right_when_facing_north_changes_to_east() {
        MarsRover rover = new MarsRover(coord(0, 0), NORTH);
        rover.turnRight();
        assertThat(rover.isFacing(EAST)).isTrue();
    }
    @Test
    void test_turn_right_when_facing_west_changes_to_north() {
        MarsRover rover = new MarsRover(coord(0, 0), WEST);
        rover.turnRight();
        assertThat(rover.isFacing(NORTH)).isTrue();
    }
    @Test
    void test_turn_right_when_facing_south_changes_to_west() {
        MarsRover rover = new MarsRover(coord(0, 0), SOUTH);
        rover.turnRight();
        assertThat(rover.isFacing(WEST)).isTrue();
    }

    @Test
    void test_turn_left_when_facing_east_changes_to_north() {
        MarsRover rover = new MarsRover(coord(0, 0), EAST);
        rover.turnLeft();
        assertThat(rover.isFacing(NORTH)).isTrue();
    }

}
